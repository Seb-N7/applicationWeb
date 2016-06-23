<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:22
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="CSS/Style1.css" rel="stylesheet" type="text/css"/>
<link href="CSS/Style2.css" rel="stylesheet" type="text/css"/>

<c:choose>
    <c:when test="${cookie.style_prefere=='blanc'}">
    </c:when>
</c:choose>