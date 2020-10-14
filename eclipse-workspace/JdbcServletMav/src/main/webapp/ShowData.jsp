<%@page import="com.sumanth.model.DataObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">

Your data is show here

<%
	DataObject d = (DataObject)request.getAttribute("secretcode");
/*
If we use redirect request in cotroller, now client will be sending 2 requests 
clientI(browser) to controller
controller to client
client to jsp
session.getAttribute("secretcode");

if use above, it will redirect to new url in browser, client will know that it is redirected but
if we dont want client to know that we are redirected than use dispatcher
*/

	out.println(d);
%>

</body>
</html>