<%/**
 * @author 
 *
 * @version 1.0
 * This page receives pizza name that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="bean.PizzaItem" %>
<%@ page import="facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<body bgcolor="#FFCC99">
	<h4><i>
	<%
	if((request.getParameter("adminDeletePizzaText")).equals("")){
		out.print("Error! Fields can't be left blank");
	}
	else{
	PizzaItem pizzaItem= new PizzaItem();
	pizzaItem.setPizzaName(request.getParameter("adminDeletePizzaText"));
	JSPFacade facadeDeletePizza= new JSPFacade();
	int status= facadeDeletePizza.catchPizzaDelete(pizzaItem);//for server side validation for pizza name entered
	if(status==0){  
		out.print("Value Not Found");
	}
	else
		out.print("Pizza Details Deleted");
	%>
	<%} %>
	</i></h4>
</body>
</html>