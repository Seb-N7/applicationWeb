/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //recup données
        
        String anneeProdStr = req.getParameter ("adp");
        System.out.println(anneeProdStr);
        
        String titreF = req.getParameter ("titre");
        System.out.println(titreF);
        
        String paysF = req.getParameter ("genre");
        System.out.println(paysF);
        
        String genreF = req.getParameter ("pays");
        System.out.println(genreF);
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
     req.getRequestDispatcher("form.jsp").forward(req, resp);
    }
    
    

    }
