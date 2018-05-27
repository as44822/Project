<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Register New User</h1>
<h2></h2>
<spring:form action="adduser.hos" method="post" commandName="user">
<table>
<tr><td>Name </td><td><spring:input path="userName"/></td></tr>
<tr><td>Email</td><td><spring:input path="userEmail"/></td></tr>
<tr><td>Phone</td><td><spring:input path="userPanno"/></td></tr>
<tr><td>Phone</td><td><spring:input path="userPwd"/></td></tr>
<tr><td align="center" colspan="2"> <input type="submit" value="Add User"/></td></tr>
</table>
</spring:form>
</center>
</body>
</html>