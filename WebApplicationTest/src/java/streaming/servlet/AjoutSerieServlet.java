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
import streaming.entity.Genre;
import streaming.entity.Serie;
import streaming.service.GenreService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutSerieServlet", urlPatterns = {"/ajout_serie"})
public class AjoutSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Genre> listeg = new GenreService().listerTous();

        req.setAttribute("genres", listeg);

        //forward vers JSP
        req.getRequestDispatcher("ajout_serie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //recup genre
        long genreId = Long.parseLong(req.getParameter("genre"));
        Genre genre = new GenreService().rechercherParId(genreId);

        //recuperation de valeur transféré par l'url
        Serie s = new Serie();
        s.setTitre(req.getParameter("titre"));
        s.setSynopsis(req.getParameter("Synopsis"));
        genre.getSeries().add(s);
        s.setGenre(genre);
        
        //persite
        new SerieService().ajouter(s);
        // forward vers liste films
        resp.sendRedirect("series_liste");

    }

}