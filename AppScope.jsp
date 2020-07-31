


<%@page import="java.util.Set"%>
<%@page import="java.util.LinkedHashSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	
	<%!Set<String> productlist = new LinkedHashSet<String>();%>

	<%
		if (application.getAttribute("appScope") == null) {
		application.setAttribute("appScope", productlist);
	}
	if (request.getParameter("Name") != null) {
		productlist.add(request.getParameter("Name"));
	}
	%>
	<form action="" method="post">
		Product Name <input type="text" name="Name"><br> <input
			type="submit" value="PRINT">

	<hr>
		Suggestion : [<% for(String products:productlist){out.print(products);}%>]
	
	<%
	application.setAttribute("Name", productlist);
	%>

	</form>
</body>
</html>