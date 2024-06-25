<%@ page import="by.tms.servlet.lesson26.User" %><%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 14.09.2023
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%
    if(session.getAttribute("user")==null){
        out.print("<h1> hello guest! </h1>");
    }
    User user = (User) session.getAttribute("user");
    if(user!= null){
        out.print("<h1> Hello" + user.getName() + "</h1>");
    }
%>

<a href="/reg">Registration</a>
<a href="/auth">Authentification</a>
<a href="/calc">Calculator</a>
<a href="/logout">Logout</a>
</body>
</html>
