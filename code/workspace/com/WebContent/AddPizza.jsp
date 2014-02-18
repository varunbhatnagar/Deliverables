<%/**
 * @author 
 *
 * @version 1.0
 * This page passes the pizza info to facade  
 * to add a new pizza info into the database
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
	<h4><i>
	<% 	if((request.getParameter("adminAddPizzaNameText")).equals("")){		//server side validation
				out.println("Error! Fields can't be left blank.");
		}
		else if((request.getParameter("adminAddPizzaRateText")).equals("")){	//server side validation
			out.println("Error! Fields can't be left blank.");
		}
		else if((request.getParameter("adminAddPizzaTypeText")).equals("")){	//server side validation
			out.println("Error! Fields can't be left blank.");
		}
		else if((request.getParameter("adminAddPizzaToppingText")).equals("")){	//server side validation
			out.println("Error! Fields can't be left blank.");
		}
		else if((request.getParameter("adminAddImgPathText")).equals("")){	//server side validation
			out.println("Error! Fields can't be left blank.");
		}
		else{
		PizzaItem pizzaItem= new PizzaItem();
		pizzaItem.setPizzaName(request.getParameter("adminAddPizzaNameText"));
		pizzaItem.setPizzaType(request.getParameter("adminAddPizzaTypeText"));
		pizzaItem.setPizzaTopping(request.getParameter("adminAddPizzaToppingText"));
		pizzaItem.setPizzaRate(Integer.parseInt(request.getParameter("adminAddPizzaRateText")));
		pizzaItem.setImgPath(request.getParameter("adminAddImgPathText"));
		JSPFacade facadeAddPizza= new JSPFacade();
		int status =facadeAddPizza.catchPizzaAdd(pizzaItem);
		if(status==0)
			out.print("Error! Check the details entered.");
		else 
			out.print("Pizza Added");
		}
	%> 
	</i></h4>
</body>
</html>