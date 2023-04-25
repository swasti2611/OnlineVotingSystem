<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
 <%@page import="java.sql.DriverManager"%>   
 <%@page import="java.sql.ResultSet"%>
 <%@page import="java.sql.Statement"%>
 <%@page import="java.sql.Connection"%>
 <%@page import="java.sql.PreparedStatement"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
<link rel="stylesheet" type="text/css" href = "stylescss.css">

 <%
   
    Integer a[] = new Integer[100];
 
    Class.forName("com.mysql.cj.jdbc.Driver");
	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineVotingSystem","root","Swatijagtap1998");
	
	PreparedStatement preparedStatement = con.prepareStatement("select partie,count(partie) as c from vote group by partie");
	ResultSet rs=((java.sql.Statement) preparedStatement).executeQuery("select partie,count(partie) as c from vote group by partie");
	
    int i=0;
    while(rs.next()){
        int temp = Integer.valueOf(rs.getString("c"));
        a[i]=temp-1;
        i++;
    }
    %>








</head>
<%@include file="AdminNavbar.jsp"%>
<body>

<div class="checkTable">
<table>
<tr>
<th>
parties
</th>
<th>
Names
</th>
<th>
Votes
</th>
</tr>

<tr>
<td>
<img src="https://bit.ly/3vb3JzX" alt="AAP">
</td>
<td>Aam Aadmi Party</td>
<td><%=a[0]%></td>
</tr>

<tr>
<td>
<img src="https://bit.ly/3FRLZyq" alt="CONGRESS">
</td>
<td>Congress</td>
<td><%=a[1]==null?0:a[1]%></td>
</tr>

<tr>
<td>
<img src="https://bit.ly/3Vnf1M5" alt="BJP">
</td>
<td>BJP</td>
<td><%=a[2]==null?0:a[2]%></td>
</tr>

<tr>
<td>
<img src="https://bit.ly/3C1guka" alt="BSP">
</td>
<td>BSP</td>
<td><%=a[3]==null?0:a[3]%></td>
</tr>

<tr>
<td>
<img src="https://www.deccanherald.com/sites/dh/files/styles/article_detail/public/article_images/2020/05/19/file74mtnjoehl2o7zpvm5l-1607729839-1553778090.jpg?itok=Q4k5DAOf" alt="CPI">
</td>
<td>CPI</td>
<td><%=a[4]==null?0:a[4]%></td>
</tr>

</table>
</div>

</body>
</html>