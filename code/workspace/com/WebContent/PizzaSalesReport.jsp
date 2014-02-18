<%/**
 * @author 
 *
 * @version 1.0
 * This page dynamically generates pizza sales report from the sales table
 * Receives data in an arraylist
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="bean.Sales" %>
<%@page import="facade.JSPFacade" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<h4><i>Pizza Sales Report (in Numbers)</i></h4></head>
<body bgcolor="#FFCC99">
<table border="1">
	<tr>
		<td><b>Location Name</b></td>
		<td><b>Pizza 1</b></td><td><b>Pizza 2</b></td><td><b>Pizza 3</b></td><td><b>Pizza 4</b></td>
		<td><b>Pizza 5</b></td><td><b>Pizza 6</b></td><td><b>Pizza 7</b></td><td><b>Pizza 8</b></td>
		<td><b>Pizza 9</b></td><td><b>Pizza 10</b></td><td><b>Pizza 11</b></td><td><b>Pizza 12</b></td>
		<td><b>Pizza 13</b></td><td><b>Pizza 14</b></td><td><b>Pizza 15</b></td>
	</tr>	
<%!	ArrayList locationReport= new ArrayList(); %>
<%!	int totalAmountNo[]= new int[15]; %>
<%!	int max=0; %>
<%!	int min; %>
<%!	Iterator reportIterator;
   	Sales sales= new Sales();
%>
<%
 	JSPFacade facadePizzaReport= new JSPFacade();
	totalAmountNo= facadePizzaReport.catchPizzaSalesReport();
	locationReport= facadePizzaReport.catchLocationSalesReport();
	reportIterator= locationReport.iterator();
	while(reportIterator.hasNext()){
	sales= (Sales)reportIterator.next();		
%>
	<tr>
	<td><%=sales.getLocationName()%></td><td><%= sales.getPizzaType1()%></td>
	<td><%=sales.getPizzaType2()%></td><td><%=sales.getPizzaType3()%></td>
	<td><%=sales.getPizzaType4()%></td><td><%=sales.getPizzaType5()%></td>
	<td><%=sales.getPizzaType6()%></td><td><%=sales.getPizzaType7()%></td>
	<td><%=sales.getPizzaType8()%></td><td><%=sales.getPizzaType9()%></td>
	<td><%=sales.getPizzaType10()%></td><td><%=sales.getPizzaType11()%></td>
	<td><%=sales.getPizzaType12()%></td><td><%=sales.getPizzaType13()%></td>
	<td><%=sales.getPizzaType14()%></td><td><%=sales.getPizzaType15()%></td>
	</tr>
<% 	}%>
	<tr>
	<td><i><b>Total Sale</b></i></td>
<%	for(int i=0; i<15; i++){
%>
	<td><%=totalAmountNo[i]%></td>
<%} %>
	</tr>
</table>
<table>
	<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
	<tr>
	<td><i>Highest Pizza Sale= </i></td>
	<td></td>
<%	for(int i=0; i<15; i++){
		if(max<totalAmountNo[i])
			max= totalAmountNo[i];
	}
%>
	<td align="right"><b><%=max %></b></td>
	</tr>
	<tr>
	<td><i>Least Pizza Sale= </i></td>
	<td></td>
<%	min=totalAmountNo[1];
	for(int i=0; i<15; i++){
		if(min>totalAmountNo[i])
			min=totalAmountNo[i];				
	}
%>
	<td align="right"><b><%=min %></b></td>	
	</tr>
</table>	
</body>
</html>