<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Leave Details history</h1>
Employee id : ${Employee.empid}<br>
Employee Name :${Employee.ename }<br>


<h1> ${msg}  </h1>
<table border="1">
<c:forEach items="${LeaveList}" var="leave">
<tr><Td>${leave.start_date } <td>${leave.end_date }
<td>${leave.description }<td>${leave.leaves_applied }

</c:forEach>
</table>

</body>
</html>