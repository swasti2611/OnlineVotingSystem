<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin login</title>
<link rel="stylesheet" type="text/css" href = "stylescss.css">
</head>


<body>
<%@include file="navbar.jsp"%>


<div class="form-container">
<form >
<h3>Enter your voter card number</h3>
<label for="voterNumber">Voter ID</label>
<br>
<input name ="voterNumber" id="voterNumber" type="text">
<br>
<button type="submit">Login</button>
<br>
<a href="admin.jsp">Admin</a>
</form> 
</div>

</body>
</html>