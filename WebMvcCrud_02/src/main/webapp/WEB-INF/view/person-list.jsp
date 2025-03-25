<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Person List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        text-align: center;
    }
    h1 {
        color: green;
        margin-bottom: 20px;
    }
    table {
        width: 80%;
        margin: auto;
        border-collapse: collapse;
        background-color: white;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
    }
    th, td {
        padding: 10px;
        border: 1px solid black;
        text-align: center;
    }
    th {
        background-color: #f2f2f2;
    }
    a {
        text-decoration: none;
        color: blue;
        margin-right: 10px;
    }
    a:hover {
        color: red;
    }
    .add-link {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #28a745;
        color: white;
        text-decoration: none;
        border-radius: 5px;
    }
    .add-link:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
<h1>Person Management System</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>

    <c:forEach var="person" items="${persons}">
        <tr>
            <td>${person.id}</td>
            <td>${person.name}</td>
            <td>${person.email}</td>
            <td>
                <a href="/editPersonForm?id=${person.id}">Edit</a>
                <a href="/deletePerson?id=${person.id}" onclick="return confirm('Are you sure you want to delete this person?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/addPersonForm" class="add-link">Add New Person</a>

</body>
</html>
