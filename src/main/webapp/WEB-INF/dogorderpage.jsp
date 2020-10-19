<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dog Order home page</title>
    </head>
    <body>


    <h1>Resultatet</h1>
        <p>${requestScope.breed}</p>
        <p>${requestScope.area}</p>
        <p>${requestScope.msg}</p>

    </body>
</html>
