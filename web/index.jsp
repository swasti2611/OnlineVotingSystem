<html>
<head>
<meta charset="UTF-8">
<title>Online Voting System</title>
<link rel="stylesheet" type="text/css" href = "stylescss.css">
</head>
<body>

<%@include file="navbar.jsp"%>


<div class="form-container">
<form action="VoterLogin" method="post">
<h4>Enter your voter card number</h4>
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
