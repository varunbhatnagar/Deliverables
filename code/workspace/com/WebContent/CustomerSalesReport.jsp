<%/**
 * @author 
 *
 * @version 1.0
 * This page dynamically generates customer sales report from the pizza_order table
 * Receives data in an arraylist
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="bean.OrderPizza" %>
<%@page import="facade.JSPFacade" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="dataBase.CustomerSalesDB"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<h3><i>Customer Sales Report (in Rs.)</i></h3></head>
<body bgcolor="#FFCC99">
<table border="1">
	<tr>
		<td><b>Customer Id</b></td><td><b>Total Purchase (in Rs.)</b></td>
	</tr>	
<%!	ArrayList customerReport= new ArrayList(); %>
<%!	Iterator reportIterator;
   	OrderPizza orderPizzaAmount= new OrderPizza();
%>
<%
 		JSPFacade facadeCustomerReport= new JSPFacade();
		customerReport= facadeCustomerReport.catchCustomerSalesReport();
		reportIterator= customerReport.iterator();
		while(reportIterator.hasNext()){
			orderPizzaAmount= (OrderPizza)reportIterator.next();		
%>
	<tr>
	<td><%out.print(orderPizzaAmount.getCustomerId());%></td>
	<td><%=orderPizzaAmount.getTotalAmount()%></td>
	</tr>
<% 	}%>
</table>
</body>
</html>