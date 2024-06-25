<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 14.09.2023
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorisation</title>
</head>
<body>
<form action="/auth" method="post">
    <input href="text" placeholder="Username" name="username">
    <input href="text" placeholder="Password" name="password">
    <button>Submit</button>
</form>
<p>${message}</p>

</body>
</html>
