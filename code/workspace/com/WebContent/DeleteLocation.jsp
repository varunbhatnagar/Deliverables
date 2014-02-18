<%/**
 * @author 
 *
 * @version 1.0
 * This page receives location name that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="bean.Location" %>
<%@ page import="facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="bean.Location"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FFCC99">
<h4><i>
	<%
	if((request.getParameter("adminDeleteLocationText")).equals("")){
		out.print("Error! Fields can't be left blank.");				//server side validation
	}
	else{
	Location location= new Location();
	location.setLocationName(request.getParameter("adminDeleteLocationText"));
	JSPFacade facadeDeleteLocation= new JSPFacade();
	int status= facadeDeleteLocation.catchLocationDelete(location);
	if(status==0)
		out.print("Location Not Found");
	else
		out.print("Location Deleted");
	%>
	<%} %>
</i></h4>
</body>
</html>