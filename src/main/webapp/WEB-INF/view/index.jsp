<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>

	<!-- Getting data from controller(HomeController) -->
	<%
		String getName = (String) request.getAttribute("nameKey");
	int getId = (int) request.getAttribute("idKey");
	List<String> getFriendList = (List<String>) request.getAttribute("listKey");
	%>
	<%="Hello," + getName%><br />

	<%="Your ID " + getId%><br />

	<%
		for (String name : getFriendList) {
	%>
	<%=name%><br />
	<%
		}
	%>

</body>
</html>