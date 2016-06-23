<%-- 
    Document   : series_detail
    Created on : 20 juin 2016, 10:02:30
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

            <h1>Detail de :${serie.titre}</h1>
            <br>

            Synopsis: ${serie.synopsis}
            <br>

            Nombre de Saison : ${serie.saisons.size()}
            <br>

            <c:forEach items="${serie.saisons}" var="saison">
                Saison : ${saison.numSaison}

                Nombre d'épisode : ${saison.episodes.size()}  <br>
                <c:forEach items="${saison.episodes}" var="episode">
                    Episode : ${episode.id}<br>


                    <c:forEach items="${episode.liens}" var="lien">
                        Liens : ${lien.url}<br>
                    </c:forEach>

                </c:forEach>

            </c:forEach>

            <c:forEach items="${serie.realisateurs}" var="real">
                Realisateur : ${real.prenom}${real.nom},
            </c:forEach>

            <br>

            <c:forEach items="${serie.acteurs}" var="acteur">
                Acteurs : ${acteur.prenom}${acteur.nom},
            </c:forEach>



        </div>
        <div class="pied"> 
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>