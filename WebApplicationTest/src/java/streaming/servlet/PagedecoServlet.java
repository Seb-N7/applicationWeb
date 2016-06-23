/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "PagedecoServlet", urlPatterns = {"/pagedeco"})
public class PagedecoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //forward vers JSP
        req.getRequestDispatcher("Pagedeco.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pseudo = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        
      Utilisateur u = new UtilisateurService().rechercheParLoginEtMdp(pseudo, mdp);
      
      
      //je suis leggé correctement
      resp.addCookie(new Cookie("pseudo",pseudo));
      resp.addCookie(new Cookie("mdp",mdp));
      resp.addCookie(new Cookie ("util_type", u.getTypeuti().toString()));
      

        //je suis loggé correctement
        // redirection vers ecran listage des films
        resp.sendRedirect("films_liste");
    }
}
