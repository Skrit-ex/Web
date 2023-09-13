<%@ page import="java.util.List" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>


        <%
            if((boolean) request.getAttribute("Flag")){
                out.print("<h1> Hello flag </h1>");
            }
            if((boolean) request.getAttribute("Flag1")){
                out.print("<h1> Hello flag1 </h1>");
            }

            for( String a: (List<String>)request.getAttribute("list")){
                out.print("<p>" + a + "</p>");
            }

        %>
</body>
</html>
