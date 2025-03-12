<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee List</title>
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
<h1>Employee Management System</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Designation</th>
        <th>Actions</th>
    </tr>

    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
            <td>${employee.designation}</td>
            <td>
                <a href="/editEmployeeForm?id=${employee.id}">Edit</a>
                <a href="/deleteEmployee?id=${employee.id}" onclick="return confirm('Are you sure you want to delete this employee?');">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

<a href="/addEmployeeForm" class="add-link">Add New Employee</a>

</body>
</html>
