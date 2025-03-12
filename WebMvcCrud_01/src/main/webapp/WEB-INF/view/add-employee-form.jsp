<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
</head>
<body>
<center>
<h1 style="color:green">Add New Employee</h1>
<form action="/addEmployee" method="post">

Name: <input type="text" name="name" required><br><br>
Salary: <input type="text" name="salary" required><br><br>
Designation: <input type="text" name="designation" required><br><br>

<input type="submit" value="Add Employee">
<input type="reset" value="Cancel">

</form>
</center>
</body>
</html>
