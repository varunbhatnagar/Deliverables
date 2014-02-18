<%/**
 * @author 
 *
 * @version 1.0
 * This page passes the edited location info to facade  
 * to pass it further to database for addition into the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "bean.Location" %>
<%@page import= "facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">
	<% 	
		Location location = new Location();
		location.setLocationName(request.getParameter("adminEditLocationNameText"));
		location.setLocationAddLine1(request.getParameter("adminEditLocationAddressLine1Text"));
		location.setLocationAddLine2(request.getParameter("adminEditLocationAddressLine2Text"));
		location.setLocationCity(request.getParameter("adminEditLocationCityText"));
		location.setLocationState(request.getParameter("adminEditLocationStateText"));
		location.setLocationPinCode(request.getParameter("adminEditLocationPinCodeText"));
		location.setLocationMobileNo(request.getParameter("adminEditLocationMobileNoText"));
		JSPFacade facadeEditLocation= new JSPFacade();
		int status =facadeEditLocation.catchLocationEdit(location);//validation
		if(status==0)										
			out.print("Error! Check the details entered");
		else
			out.print("Location Edited");
	%> 
</body>
</html>