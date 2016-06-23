<%-- 
    Document   : films_liste
    Created on : 17 juin 2016, 11:11:24
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
            <h1>Liste des films</h1>

            <table border="1">  
                <tr>
                    <th>Titre</th>
                    <th>Annee</th>
                    <th>Genre</th>
                    <th>Année</th>
                    <th>Pays</th>
                </tr>

                <c:forEach items="${films}" var="film">
                    <tr>
                        <td><a href="film_detail?film_id=${film.id}">${film.titre}</a>
                   <td>
                        <td>${film.genre.nom}</td>
                        <td>${film.annee}</td>
                        <td>
                            <c:forEach items="${film.pays}" var="pays">
                                ${pays.nom}
                            </c:forEach>
                        </td>
                    </tr>

                </c:forEach>
            </table>
        </div>
        <div class="pied"> 
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>
