<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    <%@ include file="menu.jsp" %>
        <p>Bonjour ${ !empty name ? name : ""} </p>
    </body>
</html> 