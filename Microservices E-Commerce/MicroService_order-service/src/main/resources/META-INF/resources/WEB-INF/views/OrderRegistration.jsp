<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="ISO-8859-1">
    <title>Registration Form</title>
    <style>
        /* CSS styles for the registration form container */
        .registration-container {
            width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 2px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        /* CSS styles for input fields */
        .input-field {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    <div class="registration-container">
        <h2>Registration Form</h2>
        <form action="AddOrder" method="post">
            <label for="oid">Order ID:</label>
            <input type="number" id="oid" name="oid" class="input-field" required><br>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" class="input-field" required><br>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" class="input-field" required><br>
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
