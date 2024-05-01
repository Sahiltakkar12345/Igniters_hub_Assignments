<!-- users.jsp -->
<%@page import="com.jsp.example.entity.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.example.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management System - View All Users</title>
</head>
<body>
    <h1>Employee Management System - View All Users</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>HasCar</th>
            <!-- Add more columns as needed -->
        </tr>
        <%-- Assuming you have a list of users (e.g., from a database) --%>
        <%
            List<Employee> userList = EmployeeService.getAllEmployees();
            for (Employee user : userList) {
        %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getName() %></td>
            <td><%= user.getAge() %></td>
            <td><%= user.getGender() %></td>
            <td><%= user.getHasCar() %></td>
            <!-- Add more cells for other user properties -->
        </tr>
        <% } %>
    </table>
</body>
</html>
