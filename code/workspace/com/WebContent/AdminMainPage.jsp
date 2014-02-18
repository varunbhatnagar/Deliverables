<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Pizza Ordering System</title>
<h3><i>Welcome Administrator</i></h3>
</head>
<body>
<ol>
<h4><li type="1">Add, Delete & Edit Pizza</li></h4>
<table colspan="2">
	<tr>
		<td><input type="submit" onClick="self.location='AddDeleteEditPizza.jsp'" name="adminAddPizzaSubmit" value="Add, Delete or Edit Pizza" style="height:25px; width:200px"></td>
	</tr>
</table>
<h4><li>Add, Delete & Edit Location</li></h4>
<table colspan="2">
	<tr>		
		<td><input type="submit" onClick="self.location='AddDeleteEditLocation.jsp'" name="adminAddLocationSubmit" value="Add, Delete or Edit Location" style="height:25px; width:200px"></td>
	</tr>
</table>
<h4><li>Add & Delete Employee Login</li></h4>
<table colspan="2">
	<tr>
		<td><input type="submit" onClick="self.location='AddDeleteEmpLogin.jsp'" name="adminAddPizzaSubmit" value="Add & Delete Emp Login" style="height:25px; width:200px"></td>
	</tr>
</table>
<h4><li>Delete Customer</li></h4>
<table colspan="2">
	<tr>
		<td><input type="submit" onClick="self.location='DeleteCustomer.jsp'" name="adminDeleteCustomerSubmit" value="Delete Customer" style="height:25px; width:200px"></td>
	</tr>
</table>
<h4><li>Generate Reports</li></h4>
<table colspan="2">
	<tr>
		<td><input type="submit" onClick="self.location='LocationSalesReport.jsp'" name="adminLocationSalesReportSubmit" value="Location Sales Report" style="height:25px; width:200px"></td>
	
		<td><input type="submit" onClick="self.location='PizzaSalesReport.jsp'" name="adminPizzaSalesReportSubmit" value="Pizza Sales Report" style="height: 25px; width: 200px"></td>
	
		<td><input type="submit" onClick="self.location='CustomerSalesReport.jsp'" name="adminCustomerSalesReportSubmit" value="Customer Sales Report" style="height:25px; width:200px"></td>
	</tr>
</table>
</body>
</html>