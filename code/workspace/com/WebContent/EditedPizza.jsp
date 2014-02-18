<%/**
 * @author 
 *
 * @version 1.0
 * This page passes the edited pizza info to facade  
 * to pass it further to database for addition into the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="bean.PizzaItem" %>
<%@page import="facade.JSPFacade" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">		
	<h4><i><b>
	<% 
		PizzaItem pizzaItem= new PizzaItem();
		pizzaItem.setPizzaName(request.getParameter("adminEditPizzaNameText"));
		pizzaItem.setPizzaType(request.getParameter("adminEditPizzaTypeText"));
		pizzaItem.setPizzaTopping(request.getParameter("adminEditPizzaToppingText"));
		pizzaItem.setPizzaRate(Integer.parseInt(request.getParameter("adminEditPizzaRateText")));
		pizzaItem.setImgPath(request.getParameter("adminEditImgPathText"));
		JSPFacade facadeEditPizza= new JSPFacade();
		int status =facadeEditPizza.catchPizzaEdit(pizzaItem);		//for validation
		if(status==0)											
			out.print("Error! Check the details entered.");
		else
			out.print("Pizza Edited");
	%>
	 
	</b></i></h4>
</body>
</html>