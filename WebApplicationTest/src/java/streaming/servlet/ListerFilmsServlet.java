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
import streaming.service.FilmService;


/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/films_liste"})
public class ListerFilmsServlet extends HttpServlet {
    
        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //recup film bd
        
        List <Film> filmsTrouves = new FilmService ().lister();
        
        // init attributs pour le JSP
        req.setAttribute("films", filmsTrouves);
        
        //Forward vers JSP
        req.getRequestDispatcher("films_liste.jsp").forward(req, resp);
    }

}
