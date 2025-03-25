<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Person</title>
</head>
<body>
<center>
    <h1 style="color:blue">Edit Person Details</h1>
    <form action="/updatePerson" method="post">
        <input type="hidden" name="id" value="${person.id}">
        Name: <input type="text" name="name" value="${person.name}" required /><br><br>
        Email: <input type="email" name="email" value="${person.email}" required /><br><br>
        <input type="submit" value="Update Person" />
        <input type="reset" value="Cancel" />
    </form>
</center>
</body>
</html>
