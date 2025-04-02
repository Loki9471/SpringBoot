<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Management System | GreenLeaf Admin</title>
    <style>
        :root {
            --primary-green: #2e7d32;
            --light-green: #81c784;
            --leaf-green: #4caf50;
            --earth-brown: #5d4037;
            --sky-blue: #e3f2fd;
        }
        
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
            margin: 0;
            padding: 20px;
            background-image: url('https://images.unsplash.com/photo-1476231682828-37e571bc172f?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80');
            background-size: cover;
            background-attachment: fixed;
            background-position: center;
        }
        
        .container {
            max-width: 1000px;
            margin: 30px auto;
            background-color: rgba(255, 255, 255, 0.9);
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            padding: 30px;
            backdrop-filter: blur(5px);
            border: 1px solid rgba(255, 255, 255, 0.3);
        }
        
        h1 {
            color: var(--primary-green);
            text-align: center;
            margin-bottom: 30px;
            font-size: 2.5em;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
            position: relative;
            padding-bottom: 15px;
        }
        
        h1:after {
            content: "";
            position: absolute;
            bottom: 0;
            left: 50%;
            transform: translateX(-50%);
            width: 100px;
            height: 3px;
            background: var(--leaf-green);
            border-radius: 3px;
        }
        
        table {
            width: 100%;
            border-collapse: separate;
            border-spacing: 0;
            margin: 25px 0;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }
        
        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #e0e0e0;
        }
        
        th {
            background-color: var(--primary-green);
            color: white;
            font-weight: 600;
            letter-spacing: 0.5px;
        }
        
        tr:nth-child(even) {
            background-color: #f5f5f5;
        }
        
        tr:hover {
            background-color: rgba(76, 175, 80, 0.1);
            transition: all 0.3s ease;
        }
        
        a {
            text-decoration: none;
            color: var(--primary-green);
            margin: 0 8px;
            font-weight: 500;
            padding: 5px 10px;
            border-radius: 4px;
            transition: all 0.3s ease;
        }
        
        a.edit-btn {
            color: #1976d2;
            border: 1px solid #1976d2;
        }
        
        a.edit-btn:hover {
            background-color: #1976d2;
            color: white;
        }
        
        a.delete-btn {
            color: #d32f2f;
            border: 1px solid #d32f2f;
        }
        
        a.delete-btn:hover {
            background-color: #d32f2f;
            color: white;
        }
        
        .add-link {
            display: inline-block;
            margin-top: 20px;
            padding: 12px 25px;
            background-color: var(--primary-green);
            color: white;
            text-decoration: none;
            border-radius: 30px;
            font-weight: 600;
            transition: all 0.3s ease;
            box-shadow: 0 4px 10px rgba(46, 125, 50, 0.3);
        }
        
        .add-link:hover {
            background-color: #1b5e20;
            transform: translateY(-2px);
            box-shadow: 0 6px 15px rgba(46, 125, 50, 0.4);
        }
        
        .add-link i {
            margin-right: 8px;
        }
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>
<div class="container">
    <h1><i class="fas fa-leaf"></i> Person Management System</h1>

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
                    <a href="/editPersonForm?id=${person.id}" class="edit-btn"><i class="fas fa-edit"></i> Edit</a>
                    <a href="/deletePerson?id=${person.id}" class="delete-btn" 
                       onclick="return confirm('Are you sure you want to delete this person?');">
                       <i class="fas fa-trash-alt"></i> Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <center>
        <a href="/addPersonForm" class="add-link">
            <i class="fas fa-user-plus"></i> Add New Person
        </a>
    </center>
</div>
</body>
</html>