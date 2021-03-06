<%-- 
    Document   : crea_util
    Created on : 22 juin 2016, 11:40:06
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>

    </head>
    <body>

        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="contenu">

            <b>Inscription</b>
            <form method="post">
                <div>
                    <label for="login">Login</label>
                    <input type="text" name="login" />
                </div>
                <div>
                    <label for="mdp">MDP</label>
                    <input type="password" name="mdp" />
                </div>
                <div>
                    <label for="email">Email</label>
                    <input type="text" name="email" />
                </div>
                <div class="button">
                    <button type="submit">Valider</button>
                </div>

            </form>  


        </div>
        <div class="pied"> 
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>