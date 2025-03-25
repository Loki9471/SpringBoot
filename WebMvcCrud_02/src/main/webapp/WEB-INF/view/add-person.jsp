<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Person</title>
</head>
<body>
<center>
    <h1 style="color:green">Add New Person</h1>
    <form action="addPerson" method="post">
        Name: <input type="text" name="name" required /><br><br>
        Email: <input type="email" name="email" required /><br><br>
        <input type="submit" value="Add Person" />
        <input type="reset" value="Reset" />
    </form>
</center>
</body>
</html>
