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
<title>Contact us</title>
<link rel="stylesheet"  type="text/css"  href="style.css">
</head>

<%@ include file="navbar.jsp" %>

<body>

<div class="form-container">
<form action="Contact"  method="post">
<h3>Please fill the required details:</h3>

<label for="uName">Name</label>
<br>
<input name="uName"  id="uName"  type="text" >
<br>
<label for="pNumber">Phone Number</label>
<br>
<input name="pNumber"  id="pNumber"  type="number" >
<br>
<label for="email">Email</label>
<br>
<input name="email"  id="email"  type="email" >
<br>
<label for="comment">Comment</label>
<br>
<textarea name="comment"  id="comment"  rows="4"  cols="8"></textarea> 
<br>
<button type="submit" >Submit</button>

</form>
</div>

</body>
</html>