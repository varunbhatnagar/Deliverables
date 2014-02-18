<%/**
 * @author 
 *
 * @version 1.0
 * This page takes pizza info from user and passes the pizza info to facade  
 * to pass it further to database for addition of new pizza, deletion of existing pizza
 * and editing of existing pizza info into the database
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function validate() {
		var adminAddPizzaRateText=document.AddPizzaRegistrationForm.adminAddPizzaRateText.value;	
		if(!isFinite(adminAddPizzaRateText)) {
			alert("Number should be entered");
			document.AddPizzaRegistrationForm.adminAddPizzaRateText.value="";
			return false;	
			}
			}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<h3><i>Add, Delete or Edit Pizza</i></h3></head>
<body bgcolor="#FFCC99">

<ol>
<h4><li type="1"> Add Pizza</li></h4>
<form action="AddPizza.jsp" method="POST" name="AddPizzaRegistrationForm" onsubmit="return validate()">
<table colspan="2">
	<tr>
		<td></td>
		<td></td>
		<td align="center"><i><b>Pizza Details</b></i></td>
	</tr>
	<tr></tr>	
	<tr></tr>
	<tr>
		<td><i>Pizza Name</i></td>
		<td></td>
		<td><input type="text" name="adminAddPizzaNameText" size="20" maxlength="20" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Pizza Type</i></td>
		<td></td>
		<td><input type="text" name="adminAddPizzaTypeText" size="20" maxlength="20"></td>
    </tr>
    <tr></tr>
    <tr>
		<td><i>Pizza Topping</i></td>
		<td></td>
		<td><input type="text" name="adminAddPizzaToppingText" size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>Pizza Rate</i></td>
		<td></td>
		<td><input type="text" name="adminAddPizzaRateText" size="20" maxlength="20" ></td> 
	</tr>
	<tr>
		<td><i>Image Path</i></td>
		<td></td>
		<td><input type="text" name="adminAddImgPathText" size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>
	<tr></tr>	
	<tr></tr>
	<tr>
	<td></td>
	<td></td>
	<td align="center"><input type="submit" name="adminAddPizzaSubmit" value="Submit" style="width: 100px"></td>
	</tr>
</table>
</form>
<h4><li>Delete Pizza</li></h4> 
<table>
	<form action="DeletePizza.jsp" method="POST">
	<tr>
		<td align="left"><i>Enter Pizza Name</i></td>
		<td></td>
		<td><input type="text" name="adminDeletePizzaText" size="20" maxlength="20" ></td>
		<td align="center"><input type="submit" name="adminDeletePizzaSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>
<h4><li>Edit Pizza</li></h4> 
<table colspan="2">
	<form action="EditPizza.jsp" method="POST">
	<tr>
		<td align="left"><i>Enter Pizza Name</i></td><td></td>
		<td><input type="text" name="adminEditPizzaText" size="20" maxlength="20" ></td>
		<td align="center"><input type="submit" name="adminEditPizzaSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>	
</ol>	
</body>
</html>