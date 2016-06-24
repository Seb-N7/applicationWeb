<%-- 
    Document   : _MENU
    Created on : 17 juin 2016, 10:55:00
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="films_liste">Films</a>
<a href="series_liste">Serie</a>


<c:choose>


    <c:when test="${utilConnecte.pseudo==null}">
        <a href="crea_util">Inscription</a>
        <a href="Pagedeco">Connexion</a>     
    </c:when>

    <c:otherwise>
        <a href="decoServlet">Déconnexion</a>
        <c:if test="${utilConnecte.typeuti=='ADMIN'}">
            <a href="ajout_film">Ajout Film</a>
            <a href="ajout_serie">Ajout Serie</a>
        </c:if>
    </c:otherwise>    

</c:choose>

<a href="change_style?style=Style1">Style1</a>
<a href="change_style?style=Style2">Style2</a>