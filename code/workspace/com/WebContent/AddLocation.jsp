<%/**
 * @author 
 *
 * @version 1.0
 * This page passes the location info to facade  
 * to add a new location info into the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="bean.Location" %>
<%@ page import="facade.JSPFacade" %>
<%@ page import="bean.Mapping" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">
<h3><i>
<%	if((request.getParameter("adminAddLocationNameText")).equals("")){	//server side validation
		out.print("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddLocationAddLine1Text")).equals("")){	//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddLocationAddLine1Text")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddLocationCityText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddLocationStateText")).equals("")){	//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddLocationPinCodeText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddSubLocation1NameText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddSubLocation2NameText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddSubLocation3NameText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddSubLocation4NameText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else if((request.getParameter("adminAddSubLocation5NameText")).equals("")){		//server side validation
		out.println("Error! Fields can't be left blank.");
	}
	else{
	Location location= new Location();
	location.setLocationName(request.getParameter("adminAddLocationNameText"));
	location.setLocationAddLine1(request.getParameter("adminAddLocationAddLine1Text"));
	location.setLocationAddLine2(request.getParameter("adminAddLocationAddLine2Text"));
	location.setLocationCity(request.getParameter("adminAddLocationCityText"));
	location.setLocationState(request.getParameter("adminAddLocationStateText"));
	location.setLocationPinCode(request.getParameter("adminAddLocationPinCodeText"));
	location.setLocationMobileNo(request.getParameter("adminAddLocationMobileNoText"));
	Mapping mapping= new Mapping();
	mapping.setOutletName(request.getParameter("adminAddLocationNameText"));
	mapping.setSubLocation1(request.getParameter("adminAddSubLocation1NameText"));
	mapping.setSubLocation2(request.getParameter("adminAddSubLocation2NameText"));
	mapping.setSubLocation3(request.getParameter("adminAddSubLocation3NameText"));
	mapping.setSubLocation4(request.getParameter("adminAddSubLocation4NameText"));
	mapping.setSubLocation5(request.getParameter("adminAddSubLocation5NameText"));
	JSPFacade facadeAddLocation= new JSPFacade();
	int status1= facadeAddLocation.catchLocationAdd(location);
	JSPFacade facadeAddMapping= new JSPFacade();
	int status2= facadeAddMapping.catchMappingAdd(mapping);
	if(status2==0)
		out.print("Error! Check the details entered");
	else
		out.print("Location Added");
	
%>
<%} %>
</i></h3>
</body>
</html>