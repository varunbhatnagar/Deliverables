<%/**
 * @author 
 *
 * @version 1.0
 * This page receives customer login id that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>

<h3><i>Delete Customer</i></h3></head>
<body bgcolor="#FFCC99">
<form action="DeletedCustomer.jsp" method="POST">
<table colspan="2">
	<tr>
		<td align="left"><i>Enter Customer Login Id</i></td>
		<td><input type="text" name="adminDeleteCustomerText" size="20" maxlength="20" ></td>
		<td><input type="submit" name="adminDeleteCustomerButton" value="Submit" style="width: 200px"></td>
	</tr>
	
</table>
</form>
</body>
</html>