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
<title>WebappD3</title>
</head>
<body>
<header style="height: 30px;background-color:#badeba;">Welcome to LakeView Apartments, Austin</header>
<div class="container" style="width:35%">
	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1VTcdzIfHrD1mnqlyyYKPHFSOvDM4YCOVIA&usqp=CAU" style="height:220px">
	
	<!-- Below line refers to servlet file  -->
	<form action="validateUser">
	<div style="width:70%">
	Username:
	<input type="text" name="Username" class="form-control">
	Password: 
	<input type="password" name="Password" class="form-control">
	<br>
	<button class="btn btn-light">Login</button>
	<button class="btn btn-light">Cancel</button>
	<br>
	<button type="submit" class="btn btn-light">Submit</button>
	<!-- this submit type will now send username and password to validateUser servlet -->
	</div>
	</form>
		
</div>



</body>
</html>