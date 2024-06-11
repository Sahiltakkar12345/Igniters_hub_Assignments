 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Updated Order Details</title>
    
    <style>
    *
    {
    	text-align: center;
    }
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
        }
        h1 {
            color: #333;
            text-align: center;
            margin-top: 20px;
        }
        p {
            font-size: 16px;
            color: #555;
            margin: 10px 0;
        }
    </style>
    
    
</head>
<body>
    <h1>Updated Order Details</h1>
    <p>Order ID: ${order.id}</p>
    <p>Name: ${order.name}</p>
    <p>Address: ${order.address}</p>
</body>
</html>

  