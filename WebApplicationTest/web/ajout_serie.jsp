<%-- 
    Document   : ajout_film
    Created on : 20 juin 2016, 12:08:07
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


        <form method="post">
            <div>
                <label for="titre">Titre :</label>
                <input type="text" name="titre" />
            </div>
            <div>
                <label for="genre">Genre :</label>
                <select name="genre">
                    <c:forEach items="${genres}" var="g">
                        <option value="${g.id}">${g.nom}</option>
                    </c:forEach>
                </select>


            </div>
            <div>
                <label for="Synopsis"> Synopsis :</label>
                <input type="text" name="Synopsis" />
            </div>

            <div class="button">
                <button type="submit">Enregistrement</button>
            </div>
        </form>



    </div>
    <div class="pied"> 
        <c:import url="_PIED.jsp"/>
    </div>

</body>
</html>