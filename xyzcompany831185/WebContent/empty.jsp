<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="redirect.obj" modelAttribute="login" method="POST">
<center>
<h1>no movement request exists for the employee id ${display1}</h1>

 <a href="redirect.obj">go to home page</a>
</center>
</form:form>
</body>
</html>