<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.inc"%>

<p class="text-center"><a href="FrontController?target=redirect&destination=login">Login</a> </p>
<table>
    <tr><td>Login</td>
        <td>
            <form name="dogShow" action="FrontController" method="POST">
                <input type="hidden" name="target" value="dogorder">
                Area:<br>
                <input type="text" name="area" value="BLAKEVIEW">
                <br>
                Breed:<br>
                <input type="text" name="breed" value="Golden Retriever">
                <br>
                <input type="submit" value="Submit">
            </form>
        </td>
        <td>Or Register</td>
        <td>
            <form name="register" action="FrontController" method="POST">
                <input type="hidden" name="target" value="register">
                Email:<br>
                <input type="text" name="email" value="someone@nowhere.com">
                <br>
                Password:<br>
                <input type="password" name="password1" value="sesam">
                <br>
                Retype Password:<br>
                <input type="password" name="password2" value="sesam">
                <br>
                <input type="submit" value="Submit">
            </form>
        </td>
    </tr>
</table>

<c:if test = "${requestScope.error!= null}" >
<h2>Error ! </h2>
    ${requestScope.error}
</c:if>
<%@include file="includes/footer.inc"%>
