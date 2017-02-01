<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login PAGE</h1>

<form:form action="processLogin.obj" modelAttribute="login" method="POST">
Enter Name <form:input path="userName"/>
<form:errors path="userName" cssStyle="color:red"/> 
<br/>
Enter Password <form:input path="password"/>
<form:errors path="password" cssStyle="color:red"/>
<br/>

<input type="submit" value="Login"/>
</form:form>
</body>
</html>