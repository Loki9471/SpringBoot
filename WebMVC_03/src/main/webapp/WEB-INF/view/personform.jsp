<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Enter Person Details</h1>
<form:form action="regperson" method="post" modelAttribute="person">
<form:label path="id" >ID</form:label>
<form:input path="id" />

<br><br> 

<form:label path="name" >Name</form:label>
<form:input path="name" />

<br><br> 

<form:label path="email" >Email</form:label>
<form:input path="email" />

<br><br> 

<input type="submit" value="Register" />
<input type="submit" value="Cancel" />

</form:form>

</center>
</body>
</html>