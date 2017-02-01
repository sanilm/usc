<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<table border=2 bgcolor="yellow">
<h1>Enter the following Details</h1>

<form:form action="processAddmr.obj" modelAttribute="movement" method="POST">
<tr><td>
Enter empno</td><td><form:input path="empId"/>
<form:errors path="empId" cssStyle="color:red"/></td>
</tr> 
<br/>

<tr><td>travel mode</td>
<td>
<form:select path="travelMode">
<form:option label="train" value="train"/>
<form:option label="bus" value="bus"/>
</form:select>
</td>
</tr>

<tr><td>
Enter travel date</td><td> <form:input path="travelDate"/>
<form:errors path="travelDate" cssStyle="color:red"/></td>
<td></td></tr>
<br/>
<tr><td>
Enter travel time </td><td><form:input path="travelTime"/>
<form:errors path="travelTime" cssStyle="color:red"/></td>
</tr>
<br/>
<tr><td>source city</td>
<td>
<form:select path="sourceCity">
<form:option label="banglore" value="banglore"/>
<form:option label="mumbai" value="mumbai"/>
</form:select>
</td>
</tr>



<tr><td>destination city</td>
<td>
<form:select path="destinationCity">
<form:option label="banglore" value="banglore"/>
<form:option label="mumbai" value="mumbai"/>
</form:select>
</td>
</tr>








<tr><td>
purpose </td><td><form:input path="purpose"/>
<form:errors path="purpose" cssStyle="color:red"/></td>
</tr>
<br/>
<tr><td>
<input type="submit" value="raise mr"/></td>
</tr>
</form:form>
</table>
</body>
</html>