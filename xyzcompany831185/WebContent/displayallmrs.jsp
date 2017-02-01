<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="redirect.obj" modelAttribute="" method="POST">
<h2 align="center">Mr status for employee number ${display1}  </h2>
 
<table border='2' align="center">
<tr>
<th>mr no</th>
<th>date</th>
<th>time</th>
<th>mode</th>
<th>from</th>
<th>to</th>
<th>purpose</th>
<th>status</th>
</tr>
<c:forEach var="display1" items="${display}">

<tr>
<td>MR${display1.mrNo}</td>
<td>${display1.travelDate }</td>
<td>${display1.travelTime }</td>
<td>${display1.travelMode }</td>
<td>${display1.sourceCity }</td>
<td>${display1.destinationCity }</td>
<td>${display1.purpose }</td>
<td>${display1.mrStatus }</td>
</tr>
</c:forEach> 
<tr>
<td align="center">
<a  href="redirect.obj">Click here to go to home page</a>
</td></tr>
</table>
</form:form>
</body>
</html>