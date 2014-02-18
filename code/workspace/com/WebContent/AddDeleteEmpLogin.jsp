<%/**
 * @author 
 *
 * @version 1.0
 * This page takes employee login & password and passes the employee login info to facade  
 * to pass it further to database for addition of new employee login, deletion of existing employee login
 * into the database
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<h3><i>Add or Delete Employee Login</i></h3></head>
<body bgcolor="#FFCC99">
<ol>
<h4><li type="1"> Add login</li></h4>
<form action="AddEmp.jsp" method="POST">
<table colspan="2">
	<tr>
		<td></td>
		<td></td>
		<td align="center"><i><b>Employee Login Details</b></i></td>
	</tr>
	<tr></tr>	
	<tr></tr>
	<tr>
		<td><i>Login Id</i></td>
		<td></td>
		<td><input type="text" name="adminAddEmpLoginIdText" size="20" maxlength="20" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Password</i></td>
		<td></td>
		<td><input type="Password" name="adminAddEmpPassword" size="20" maxlength="20"></td>
    </tr>
    <tr></tr>
    <tr></tr>
	<tr></tr>	
	<tr></tr>
	<tr>
	<td></td>
	<td></td>
	<td align="center"><input type="submit" name="adminAddEmpSubmit" value="Submit" style="width: 100px"></td>
	</tr>
</table>
</form>
<h4><li>Delete Employee Login</li></h4> 
<table>
	<form action="DeleteEmp.jsp" method="POST">
	<tr>
		<td align="left"><i>Enter Login Id</i></td>
		<td></td>
		<td><input type="text" name="adminDeleteEmpText" size="20" maxlength="20" ></td>
		<td align="center"><input type="submit" name="adminDeleteEmpSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>