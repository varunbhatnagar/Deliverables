<%/**
 * @author 
 *
 * @version 1.0
 * This page dynamically generates location sales report from the sales table
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
<h3><i>Location Sales Report (in Numbers)</i></h3></head>
<body bgcolor="#FFCC99">
<table border="1">
	<tr>
		<td><b>Location Name</b></td>
		<td><b>Pizza 1</b></td><td><b>Pizza 2</b></td><td><b>Pizza 3</b></td><td><b>Pizza 4</b></td>
		<td><b>Pizza 5</b></td><td><b>Pizza 6</b></td><td><b>Pizza 7</b></td><td><b>Pizza 8</b></td>
		<td><b>Pizza 9</b></td><td><b>Pizza 10</b></td><td><b>Pizza 11</b></td><td><b>Pizza 12</b></td>
		<td><b>Pizza 13</b></td><td><b>Pizza 14</b></td><td><b>Pizza 15</td><td><i><b>Total Sale</b></i></td>
	</tr>	
<%!	ArrayList locationReport= new ArrayList(); %>
<%!	int totalAmountNo[]= new int[100]; %>
<%!	int max=0; %>
<%!	int min=0; %>
<%! int i=0; %>
<%!	Iterator reportIterator;
   	Sales locationSales= new Sales();
%>
<%
 	JSPFacade facadeOutletReport= new JSPFacade();
	locationReport= facadeOutletReport.catchLocationSalesReport();//for sales report generation for each pizza type and each location
	totalAmountNo= facadeOutletReport.catchOutletSalesReport(); //for total sales calculation for each pizza type
	min=totalAmountNo[1];
	reportIterator= locationReport.iterator();
	while(reportIterator.hasNext()){
	locationSales= (Sales)reportIterator.next();		
%>
	<tr>
	<td><%=locationSales.getLocationName()%></td><td><%= locationSales.getPizzaType1()%></td>
	<td><%=locationSales.getPizzaType2()%></td><td><%=locationSales.getPizzaType3()%></td>
	<td><%=locationSales.getPizzaType4()%></td><td><%=locationSales.getPizzaType5()%></td>
	<td><%=locationSales.getPizzaType6()%></td><td><%=locationSales.getPizzaType7()%></td>
	<td><%=locationSales.getPizzaType8()%></td><td><%=locationSales.getPizzaType9()%></td>
	<td><%=locationSales.getPizzaType10()%></td><td><%=locationSales.getPizzaType11()%></td>
	<td><%=locationSales.getPizzaType12()%></td><td><%=locationSales.getPizzaType13()%></td>
	<td><%=locationSales.getPizzaType14()%></td><td><%=locationSales.getPizzaType15()%></td>
	<td><%= totalAmountNo[i]%></td>
	</tr>
<%	if(max<totalAmountNo[i])
		max= totalAmountNo[i]; 
%>
<%	if(min>totalAmountNo[i])
		min=totalAmountNo[i];
%>
<%	i++;%>	
<% 	}	%>
</table>
<table>
	<tr></tr>
	<tr>
		<td><i>Highest Pizza Sale (in numbers)= </i></td>
		<td><b><%=max%></b></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Least Pizza Sale (in numbers)= </i></td>
		<td><b><%=min%></b></td>
	</tr>
</table>
</body>
</html>