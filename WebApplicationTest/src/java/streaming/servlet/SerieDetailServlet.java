/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "SerieDetailServlet", urlPatterns = {"/series_detail"})
public class SerieDetailServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        //recuperation de valeur transféré par l'url
        long serieid = Long.parseLong(req.getParameter("series_id"));
        
        
        //Recup film a partir de idFilm
        
        Serie s = new SerieService ().rechercherParId(serieid);
        
        //set un attribut film
        req.setAttribute("serie", s);
        
        //forward vers JSP
        req.getRequestDispatcher("series_detail.jsp").forward (req, resp);
        
        
    }
    
    
}
