<%/**
 * @author 
 *
 * @version 1.0
 * This page passes the password and employee login info to facade  
 * to pass info into the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="bean.Employee" %>
<%@page import="facade.JSPFacade" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">
	<h4><i>
	<% 	if((request.getParameter("adminAddEmpLoginIdText")).equals("")){	//server side validation
			out.print("Error! Fields can't be left blank.");
		}
		else if((request.getParameter("adminAddEmpPassword")).equals("")){	//server side validation
			out.println("Error! Fields can't be left blank.");
		}
		else{
		Employee employee= new Employee();
		employee.setUserId(request.getParameter("adminAddEmpLoginIdText"));
		employee.setPassword(request.getParameter("adminAddEmpPassword"));
		JSPFacade facadeAddEmp= new JSPFacade();
		int status =facadeAddEmp.catchEmpAdd(employee);
		if(status==0){
			out.print("Error! Check the details entered.");
		}
		else{
			out.print("Employee Login Created");
		}
	
	%>
	<%} %> 
	</i></h4>
</body>
</html>