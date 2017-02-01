<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><h2>Trainee Management System</h2></center>
<form:form method="post" modelAttribute="" action="">


<table border='2'>
<tr><th>Pick your operation</th></tr>
<tr><td><a href="add.obj">Add a Trainee</a></td></tr>
<tr><td><a href="add1.obj">delete Trainee</a></td></tr>
<tr><td><a href="update.obj">update Trainee</a></td></tr>
<tr><td><a href="retrevesingle.obj">display based on id Trainee</a></td></tr>
<tr><td><a href="displayall.obj">display all</a></td></tr>
<tr><td>Retrieve all Trainee</td></tr>
</table>

</form:form>

</body>
</html>