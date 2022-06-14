<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.practice.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>in the jsp file </h1>
<%-- <% Object name = request.getAttribute("key1");
out.println((String)name); %>

<%=request.getAttribute("key2") %> --%>
<%
Employee data = (Employee)request.getAttribute("employee");
out.print(data.getName());
out.print(data.getAge());
%>
</body>
</html>