/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutFilmServlet", urlPatterns = {"/ajout_film"})
public class AjoutFilmServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Genre> listeg = new GenreService().listerTous();

        req.setAttribute("genres", listeg);

        //forward vers JSP
        req.getRequestDispatcher("ajout_film.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //recup genre
        long genreId = Long.parseLong(req.getParameter("genre"));
        Genre genre = new GenreService().rechercherParId(genreId);

        //recuperation de valeur transféré par l'url
        Film f = new Film();
        f.setTitre(req.getParameter("titre"));
        f.setSynopsis(req.getParameter("Synopsis"));
        genre.getFilms().add(f);
        f.setGenre(genre);
        
        //persite
        new FilmService().ajouter(f);
        // forward vers liste films
        resp.sendRedirect("films_liste");

    }

}
