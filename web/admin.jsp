<%-- 
    Document   : admin
    Created on : 21-Apr-2023, 6:40:07 pm
    Author     : swati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>


<link rel="stylesheet" href="stylescss.css?ver=1.1">

</head>
<body>

<%@include file="navbar.jsp"%>

<div class="form-container">
<form action = "AdminWelcome.jsp" method="post">
<h3>Please fill the required details</h3>
<label for="aName">Name</label>
<br>
<input name ="aName" id="aName" type="text">
<br>


<label for="Password">Password</label>
<br>
<input name ="Password" id="Password" type="text">
<br>

<button type="submit">Login</button>
<br>
</form> 
</div>

</body>
</html>
