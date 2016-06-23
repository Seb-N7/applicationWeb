<%-- 
    Document   : film_detail
    Created on : 17 juin 2016, 16:25:19
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
 
       <h1>Detail de :${film.titre}</h1>
       <br>
       <b>Réalisé par:</b>
        <c:forEach items="${film.realisateurs}" var="real">
        ${real.prenom}${real.nom},
        </c:forEach>
       <br>
       <b>Liens:</b>
       <c:forEach items="${film.liens}" var="lien">
           ${lien.langue} ${lien.qualite} <a href="${lien.url}"> Voir en Straming </a>
           <br>
        </c:forEach>
           

        
        </div>
        <div class="pied"> 
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
</html>
