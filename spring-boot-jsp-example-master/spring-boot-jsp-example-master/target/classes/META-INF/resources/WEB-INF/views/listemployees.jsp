<%@page import="com.jsp.example.service.EmployeeService"%>
<%@page import="com.jsp.example.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>User Management Application</title>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* Style the entire table */
        table {
            width: 100%;
            border-collapse: collapse; /* Combine adjacent borders */
        }

        /* Style table header cells (th) */
        th {
            background-color: #f2f2f2;
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        /* Style table data cells (td) */
        td {
            border: 1px solid #ddd;
            padding: 8px;
        }
    </style>
</head>
<body>
 <center>
  <h1>Employee Management</h1>
        <h2>
         <a href="new">Add New User</a>
         &nbsp;&nbsp;&nbsp;
         <a href="/emp">List All Users</a>
         
        </h2>
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Has Car</th>
                <th>Actions</th>
            </tr>
  
     <c:forEach items="${driverDetails}" var="item">
<tr>
<td>${item.id }</td>
<td>${item.name}</td>
<td>${item.age}</td>
<td>${item.gender}</td>
<td>${item.hasCar}</td>

<td><a href='stu/${item.id }'>Edit</a>

 <a href='delstu/${item.id }' onclick="showConfirmation()">Delete</a>

  <script>
      function showConfirmation() {
          var result = confirm("Are you sure you want to delete this employee?");
          if (result) {
        	  window.location.href='delstu/${item.id }';
          }
          return false; 
      }
  </script>





<!-- 
<button onclick="myFunction()">Delete</button>
<p id="demo"></p>
<script>
function myFunction() {
  let text = "Press a button!\nEither OK or Cancel.";
 // <a href='delstu/${item.id }'>confirm(text) == true</a>
 
 <%--   if (confirm(text) == true) {
 		 text= <a href='delstu/${item.id}'></a>
 		  text = "You pressed OK!";
  	  } else {
 	    text = "You canceled!";
 	  }
 	  document.getElementById("demo").innerHTML = text;
 	}
 --%>-->
  </script>
</tr>
</c:forEach>
        </table>
 
    </div> 
</body>
</html>