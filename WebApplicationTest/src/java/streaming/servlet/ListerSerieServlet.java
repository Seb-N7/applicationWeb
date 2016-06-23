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
import streaming.entity.Serie;
import streaming.service.SerieService;


/**
 *
 * @author admin
 */
@WebServlet(name = "ListerSerieServlet", urlPatterns = {"/series_liste"})
public class ListerSerieServlet extends HttpServlet {
    
        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       //recup series bd
        
        List <Serie> seriesTrouves = new SerieService ().lister();
        
        // init attributs pour le JSP
        req.setAttribute("series", seriesTrouves);
        
        //Forward vers JSP
        req.getRequestDispatcher("series_liste.jsp").forward(req, resp);
        
   
    }
}
