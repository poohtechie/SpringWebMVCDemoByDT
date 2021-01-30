<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<!--Turn on : Set false for Expression Langauage -->
<%@page isELIgnored="false"%>
<!-- JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<!-- Getting data from controller(HomeController) -->
	<%-- <%
		String getName = (String) request.getAttribute("nameKey");
	int getRollNo = (int) request.getAttribute("rollNoKey");
	LocalDateTime getDateTime = (LocalDateTime) request.getAttribute("dateKey");
	%> --%>

	<h4>
		Hello,
		<%-- <%=getName%> --%>
		${nameKey}
	</h4>
	<h4>
		Your RollNo
		<%-- <%=getRollNo%> --%>
		${rollNoKey}
	</h4>
	<h4>
		Date & Time
		<%-- <%=getDateTime.toString()%> --%>
		${dateKey}
	</h4>
	<hr>
	
	<h4>${listKey}</h4>
	<c:forEach var="item" items="${listKey}">
		<h4>${item}</h4>
		<%-- <c:out value="${item}"></c:out> --%>
	</c:forEach>
</body>
</html>
