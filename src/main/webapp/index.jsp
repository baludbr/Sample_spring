<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        // Retrieve the message from the request attributes
        String message = (String) request.getAttribute("message");
    %>
<%= message %>
</body>
</html>