<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  
  <style>
	body{
	background-image: url("https://images.unsplash.com/photo-1533219480925-55054b668f15?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1330&q=80");
	background-repeat: no-repeat;
	background-attachment: fixed;
  	background-size: cover;
  	font-weight: 400;
 
	}
</style>
<title>Home</title>
</head>
<body>

<div class="container" style=width:30%>
<form action="promptViewUData" method="get">
	<br>
	<h5 style="font-family:serif; ">Welcome Home!! Trekkers and Hikers</h5>
	<br>
	<br>
	<label for="viewData">Do you want to view your credentials: </label>
	<select name="viewdata" id="viewdata" class="form-control">
		<option value="Yes">Yes</option>
		<option value="No">No</option>
	</select>
	<input type="submit" value="Submit" class="form-control">
	<br>
	<!-- <label for="marriageStatus">Married: </label><input type="checkbox" name="marriageStatus" id="marriageStatus" class="form-control">-->
	 <br>
	
</form>
</div>

</body>
</html>


