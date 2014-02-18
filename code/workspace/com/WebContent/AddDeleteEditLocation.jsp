<%/**
 * @author 
 *
 * @version 1.0
 * This page takes location info from the user and passes the location info to facade  
 * to pass it further to database for addition of new location, deletion of existing location
 * and editing of existing location info into the database
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function validate() {
		var adminAddLocationNameText=document.AddLocationRegistrationForm.adminAddLocationNameText.value;
		var adminAddLocationAddLine1Text=document.AddLocationRegistrationForm.adminAddLocationAddLine1Text.value;
		var adminAddLocationAddLine2Text=document.AddLocationRegistrationForm.adminAddLocationAddLine2Text.value;
		var adminAddLocationCityText=document.AddLocationRegistrationForm.adminAddLocationCityText.value;
		var adminAddLocationStateText=document.AddLocationRegistrationForm.adminAddLocationStateText.value;
		var adminAddLocationPinCodeText=document.AddLocationRegistrationForm.adminAddLocationPinCodeText.value;
		var adminAddLocationMobileNoText=document.AddLocationRegistrationForm.adminAddLocationMobileNoText.value;	
		var adminAddSubLocation1NameText=document.AddLocationRegistrationForm.adminAddSubLocation1NameText.value;
		var adminAddSubLocation2NameText=document.AddLocationRegistrationForm.adminAddSubLocation2NameText.value;
		var adminAddSubLocation3NameText=document.AddLocationRegistrationForm.adminAddSubLocation3NameText.value;
		var adminAddSubLocation4NameText=document.AddLocationRegistrationForm.adminAddSubLocation4NameText.value;
		var adminAddSubLocation5NameText=document.AddLocationRegistrationForm.adminAddSubLocation5NameText.value;
		if(adminAddLocationNameText==""||adminAddLocationAddLine1Text==""||adminAddLocationAddLine2Text==""||adminAddLocationCityText==""||adminAddLocationStateText==""||adminAddSubLocation1NameText==""||adminAddSubLocation2NameText==""||adminAddSubLocation3NameText==""||adminAddSubLocation4NameText==""||adminAddSubLocation5NameText=="") {
			alert("Fields cannot be left empty"); //checks that no field should be left empty
			return false;
			}
		if((!isFinite(adminAddLocationPinCodeText))||adminAddLocationPinCodeText.length!=6) {
				alert("Pin code should be a 6 digit number");
				document.AddLocationRegistrationForm.adminAddLocationPinCodeText.value="";
				return false;					
			}
		if((!isFinite(adminAddLocationMobileNoText))||adminAddLocationMobileNoText.length<6) {
				alert("Phone No should have more than six numeric digits");
				document.AddLocationRegistrationForm.adminAddLocationMobileNoText.value="";
				return false;
			}	
			}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
<h3><i>Add, Delete or Edit Location</i></h3></head>
<body bgcolor="#FFCC99">
<ol>
<h4><li type="1"> Add Location</li></h4>
<table colspan="2">
	<form action="AddLocation.jsp" method="POST" name="AddLocationRegistrationForm" onsubmit="return validate()">
	<tr>
	<td></td>
	<td align="center"><i>Location Details</i></td>
	</tr>
	<tr></tr>	<tr></tr>
	<tr>
		<td><i>Outlet Name</i></td>
		<td><input type="text" name="adminAddLocationNameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Address Line 1</i></td>
		<td><input type="text" name="adminAddLocationAddLine1Text" size="30" maxlength="25"></td>
    </tr>
    <tr></tr>
    <tr> 
		<td><i>Address Line 2</i></td>
		<td><input type="text" name="adminAddLocationAddLine2Text" size="30" maxlength="25" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>City</i></td>
		<td><input type="text" name="adminAddLocationCityText" size="30" maxlength="25" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>State</i></td>
		<td><input type="text" name="adminAddLocationStateText" size="30" maxlength="25" ></td> 
	</tr>
	<tr>
		<td><i>Pin Code</i></td>
		<td><input type="text" name="adminAddLocationPinCodeText" size="30" maxlength="6" ></td> 
	</tr>
	<tr>
		<td><i>Mobile No.</i></td>
		<td><input type="text" name="adminAddLocationMobileNoText" size="30" maxlength="20" ></td> 
	</tr>
	<tr></tr>
	<tr>
		<td><i>Sub Location1</i></td>
		<td><input type="text" name="adminAddSubLocation1NameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Sub Location2</i></td>
		<td><input type="text" name="adminAddSubLocation2NameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Sub Location3</i></td>
		<td><input type="text" name="adminAddSubLocation3NameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Sub Location4</i></td>
		<td><input type="text" name="adminAddSubLocation4NameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Sub Location5</i></td>
		<td><input type="text" name="adminAddSubLocation5NameText" size="30" maxlength="30" ></td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td></td>
		<td><input type="submit" name="adminAddLocation5Submit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>
<h4><li>Delete Location</li></h4> 
<table colspan="2">
	<form action="DeleteLocation.jsp" method="POST">
	<tr>
		<td align="left"><i>Enter Location Name</i></td>
		<td><input type="text" name="adminDeleteLocationText" size="30" maxlength="30" ></td>
		<td><input type="submit" name="adminDeleteLocationSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>
<h4><li>Edit Location</li></h4>
<table colspan="2">
	<form action="EditLocation.jsp" method="POST">
	<tr>
		<td align="left"><i>Enter Location Name</i></td>
		<td><input type="text" name="adminEditLocationText" size="30" maxlength="30" ></td>
		<td><input type="submit" name="adminEditLocationSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	</form>
</table>
</ol> 
</body>
</html>