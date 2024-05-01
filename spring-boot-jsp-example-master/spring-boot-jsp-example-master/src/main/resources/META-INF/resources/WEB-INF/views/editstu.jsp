<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
<meta charset="ISO-8859-1">
 <style>
 .myDiv {
 margin:2px;
 padding:2px;
  width: 330px;
  height: 250px;
  border: 6px solid black;
  background-color: #ccc;
}
 
        html, body {
            display: flex;
            justify-content: center;
            height: 80%;
           
        }
        body, div, h1, form, input, p {
            padding: 0;
            margin: 0;
            outline: none;
            font-family: Roboto, Arial, sans-serif;
            font-size: 16px;
            color: #666;
        }
    h1 {
  border-inline: 5px solid red;
}

h2 {
  border-inline: 4px dotted blue;
}
/* 
table {
  border: 5px solid black;
} */
    </style>

</head>
<body  bgcolor="lightgreen";>
<forms:form action="${pageContext.request.contextPath}/updatestu" modelAttribute="student">

<h2>------ Edit Student Page -------</h2>
<div class="myDiv">

<table>
<tr><td><forms:label path="id">ID</forms:label></td>
<td><forms:input path="id" disabled="disabled"/></td></tr>
<tr><td><forms:label path="name">Name</forms:label></td>
<td><forms:input path="name"/>
</td></tr>
<tr><td><forms:label path="age">Age</forms:label></td>
<td><forms:input path="age"/>
</td></tr>
<tr><td><forms:label path="gender">Gender</forms:label></td>
<td><forms:input path="gender"/>
</td></tr>
<tr><td><forms:label path="hasCar">Has Car</forms:label></td>
<td><forms:input path="hasCar"/>
</td></tr>&nbsp;&nbsp;
<tr><td><Input type="submit" value="UpdateStudent"></td></tr>
</table>
</forms:form>
</div>