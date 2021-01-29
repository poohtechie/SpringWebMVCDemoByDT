<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Success</title>
</head>
<body>
	<h4>${Header}</h4>
	<h4>${Desc}</h4>
	<h5>${CreatedUserID}</h5>

	<h4>${userBean.name}</h4>
	<h4>${userBean.email}</h4>
	<h4>${userBean.password}</h4>
</body>
</html>