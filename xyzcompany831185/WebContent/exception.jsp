<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login PAGE</h1>

<form:form action="redirect.obj" modelAttribute="login" method="POST">

<h2 align="center">exception occured ${exception}  </h2>
 
<input type="submit" value="move"/>
</form:form>
</body>
</html>