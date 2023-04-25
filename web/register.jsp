<%-- 
    Document   : ContactUs
    Created on : 03-Apr-2023, 11:52:33 am
    Author     : swati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href = "stylescss.css">
</head>
<%@include file="AdminNavbar.jsp"%>
<body>

<div class="form-container">
<form action="RegisterVoter" method="post">
<h3>Please fill the required details</h3>
<label for="uName">Name</label>
<br>
<input name ="uName" id="uName" type="text">
<br>

<label for="pNumber">Phone Number</label>
<br>
<input name ="pNumber" id="pNumber" type="text">
<br>


<label for="email">Email</label>
<br>
<input name ="email" id="email" type="text">
<br>

<label for="voterNumber">Voter Card Number</label>
<br>
<input name ="voterNumber" id="voterNumber" type="text">
<br>

<label for="DOB">Date of birth</label>
<br>
<input name ="DOB" id="DOB" type="date">
<br>

<label for="address">Address</label>
<br>

<textarea name="address" id = "address" rows="4" cols="8"></textarea>
<button type="submit">Submit</button>
</form> 
</div>

</body>
</html>