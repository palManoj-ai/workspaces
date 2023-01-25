<%@page import="webappday7.UserData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
	body{
	background-image: url("https://images.unsplash.com/photo-1533219480925-55054b668f15?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1330&q=80");
	background-repeat: no-repeat;
	background-attachment: fixed;
  	background-size: cover;
  	font-weight: 400;
	}
</style>
<title>User Credentials</title>
</head>

<body>

<div class="container">
<br>
<br>
<br>
  <p style="font-weight: bolder;">${message2}</p>            
  <table class="table table-striped"> 
    <thead>
      <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Password</th>
        <th>PhoneNo</th>
        <th>Gender</th>  
        <th>Created Date</th>      
      </tr>
    </thead>
    <tbody>
    	<tr>
        <td>${udata.fname}</td>
        <td>${udata.lname}</td>
        <td>${udata.email}</td>
        <td>${udata.pword}</td>
        <td>${udata.phone}</td>
        <td>${udata.gender}</td>
        <td>${udata.cdate}</td>
        </tr>
    </tbody>
  </table>

<a href="moreInfo?instanceOfEmail=${udata.email}"><button type="button" class="btn btn-success">View Rest Data</button></a>
<br>
<table class="table table-striped"> 
 
    <thead>
      <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Password</th>
        <th>PhoneNo</th>
        <th>Gender</th>  
        <th>Created Date</th>      
      </tr>
    </thead>
<tbody>
<!-- request.getAttribute("listudata") -->

<% 
List<UserData> listOfUser=(List<UserData>)request.getAttribute("listudata");
if(listOfUser!=null){
	for (UserData user: listOfUser){
%>
    	<tr>
        <td><%=user.getFname()%></td>
        <td><%=user.getLname()%></td>
        <td><%=user.getEmail()%></td>
        <td><%=user.getPhone()%></td>
        <td><%=user.getGender()%></td>
        <td><%=user.getPword()%></td>
        <td><%=user.getCdate()%></td>
        </tr>
<%
	}
}
%>    
</tbody>
</table>    
</div>
</body>
</html>


