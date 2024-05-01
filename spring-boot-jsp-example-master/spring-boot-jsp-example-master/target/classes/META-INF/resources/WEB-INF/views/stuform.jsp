<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
     <style>
        /* Style form elements */
        form {
            max-width: 400px;
            margin: 0 auto;
          
        }

        input[type="text"],
        input[type="email"] {
            width: 60%;
            padding: 0px;
            margin:0px;
            border-bottom-color:black;
            margin-bottom: 0px;
            border: 3px solid #ddd;
           
        }

        input[type="submit"] {
            background-color: #0074D9;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }

    </style>
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #87CEEB;">
<div class="container"; style="border:black; border-width:5px; border-style: solid; background-color: #9AB9D0;">
<h2><center>Student Registration form</center>
</h2>
<form>
<form action="processform2" method="post" >
<div class="form-group">
<h2> Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="text" name="Id" placeholder="Enter id"/></h2>
<br></div><div class="form-group">
<h2> Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="text" name="Name" placeholder="Enter Name"/></h2>
<br></div><div class="form-group">
<h2> Age &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="text" name="Age" placeholder="Enter Age"/></h2>
<br></div><div class="form-group">
<h2> Gender&nbsp;&nbsp;&nbsp;
 <input type="text" name="Gender" placeholder="Enter Gender"/></h2>
<br></div><div class="form-group">

<h2> Has Car &nbsp;
<input type="text" name="hasCar" placeholder="Enter hasCar"/></h2>
<br></div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="submit">
</form></form>
</div>
</body>
</html>