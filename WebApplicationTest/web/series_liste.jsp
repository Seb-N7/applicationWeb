<%-- 
    Document   : series_liste
    Created on : 17 juin 2016, 11:13:22
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
         <h1>Liste des series</h1>
         <c:forEach items="${series}" var="series">
             <a href="series_detail?series_id=${series.id}">${series.titre}</a>
         <br>
         </c:forEach>
        </div>
        <div class="pied"> 
            <c:import url="_PIED.jsp"/>
            
        </div>
        
    </body>
    
</html>