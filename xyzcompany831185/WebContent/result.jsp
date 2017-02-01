<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="redirect.obj" modelAttribute="login" method="POST">
<center>
<h2 align="center">Mr for employee number ${result.empId} has been raised successfully. </h2>
 <h2 align="center"> mrno is MR${result.mrNo } </h2>


<a  href="redirect.obj">Click here to go to home page</a>
</center>
</form:form>
</body>
</html>