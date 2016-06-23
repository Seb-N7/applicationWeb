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


    <c:when test="${cookie.pseudo==null}">
        <a href="crea_util">Inscription</a>
        <a href="Pagedeco">Connexion</a>     
    </c:when>

    <c:when test="${cookie.pseudo!=null}"> 
        <a href="decoServlet">Déconnexion</a>
    </c:when>

    <c:otherwise>
        <c:if test="${cookie.util_type.getValue()=='ADMIN'}">
            <a href="ajout_film">Ajout Film</a>
            <a href="ajout_serie">Ajout Serie</a>
        </c:if>
    </c:otherwise>    


</c:choose>