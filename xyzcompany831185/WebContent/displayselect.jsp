<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>delete PAGE</h1>

<form:form action="processretreve.obj" modelAttribute="displayselect" method="POST">
Enter empid<form:input path="empId"/>
<form:errors path="empId" cssStyle="color:red"/> 

<br/>


<input type="submit" value="move"/>
</form:form>
</body>
</html>