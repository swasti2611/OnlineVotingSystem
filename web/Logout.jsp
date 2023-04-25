<%-- 
    Document   : Logout
    Created on : 21-Apr-2023, 6:59:04 pm
    Author     : swati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>

<%
HttpSession session1 = request.getSession();
session1.removeAttribute("aName");
response.sendRedirect("index.jsp");
%>

</body>
</html>
