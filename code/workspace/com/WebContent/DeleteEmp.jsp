<%/**
 * @author 
 *
 * @version 1.0
 * This page receives employee id that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="bean.Employee" %>
<%@ page import="facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<body bgcolor="#FFCC99">
	<h4><i>
	<%
	if((request.getParameter("adminDeleteEmpText")).equals("")){
		out.print("Error! Fields can't be left blank.");		//server side validation
	}
	else{
	Employee employee= new Employee();
	employee.setUserId(request.getParameter("adminDeleteEmpText"));
	JSPFacade facadeDeleteEmp= new JSPFacade();
	int status= facadeDeleteEmp.catchEmpDelete(employee);
	if(status==0){  //server side validation for employee login 
		out.print("Value Not Found");
	}
	else
		out.print("Employee Login Deleted");
	%>
<%} %>
	</i></h4>
</body>
</html>