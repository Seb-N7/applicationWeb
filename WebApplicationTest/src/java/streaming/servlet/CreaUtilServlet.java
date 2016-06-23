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
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "CreaUtilServlet", urlPatterns = {"/crea_util"})
public class CreaUtilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //forward vers jsp
        req.getRequestDispatcher("crea_util.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pseudo = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        String email =req.getParameter("email");
        
        Utilisateur u = new Utilisateur ();
        u.setPseudo(pseudo);
        u.setMdp(mdp);
        u.setEmail(email);
        
        UtilisateurService utilservice = new UtilisateurService ();
        utilservice.inscription(u);
        
        resp.sendRedirect("films_liste");
        
        
        
        
    }

}
