<%/**
 * @author 
 *
 * @version 1.0
 * This page performs deletion of customer info from the database 
 * and generation of confirmation report
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "bean.Customer" %>
<%@ page import= "facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">
<h4><i>
<%	
	if((request.getParameter("adminDeleteCustomerText")).equals("")){
		out.print("Error! Fields can't be left blank.");
		}
	else{
	Customer customer= new Customer();
	customer.setLoginId(request.getParameter("adminDeleteCustomerText"));
	JSPFacade facadeDeleteCustomer= new JSPFacade();
	int status= facadeDeleteCustomer.catchCustomerDelete(customer);
	if(status==0){
		out.print("Customer Not Found");
	}
	else
		out.print("Customer Deleted");
%>
<%} %>
</i></h4>
</body>
</html>