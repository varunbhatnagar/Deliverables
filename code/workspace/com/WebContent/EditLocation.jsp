<%/**
 * @author 
 *
 * @version 1.0
 * This page receives location name that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "bean.Location" %>
<%@ page import= "facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99"><b><i>
	<%
	if((request.getParameter("adminEditLocationText")).equals("")){
		out.print("Error! Location Name Not Entered");
	}
	else{
	%></i>
</b>
<ol>
<h4><li type="1">Edit Location</li></h4>
<form action="EditedLocation.jsp" method="POST">
<table colspan="2">
<%	
	String enteredLocationName= request.getParameter("adminEditLocationText");
	Location location= new Location();
	JSPFacade facadeLocationInfo= new JSPFacade();
	location= facadeLocationInfo.catchLocationInfo(enteredLocationName);
%>

	<tr>
	<td></td>
	<td align="center"><i><b>Location Details</b></i></td>
	</tr>
	<tr></tr>	<tr></tr>
	<tr>
		<td><i>Location Name</i></td>
		<td><input type="text" name="adminEditLocationNameText" value=<%=location.getLocationName()%> readonly=yes size="20" maxlength="20" ></td>
	</tr>
	<tr></tr>
	<tr>
		<td><i>Address Line 1</i></td>
		<td><input type="text" name="adminEditLocationAddressLine1Text" value=<%=location.getLocationAddLine1()%> size="20" maxlength="20"></td>
    </tr>
    <tr></tr>
    <tr> 
		<td><i>Address Line 2</i></td>
		<td><input type="text" name="adminEditLocationAddressLine2Text" value=<%=location.getLocationAddLine2()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>City</i></td>
		<td><input type="text" name="adminEditLocationCityText" value=<%=location.getLocationCity()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>State</i></td>
		<td><input type="text" name="adminEditLocationStateText" value=<%=location.getLocationState()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>Pin Code</i></td>
		<td><input type="text" name="adminEditLocationPinCodeText" value=<%=location.getLocationPinCode()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>Mobile No.</i></td>
		<td><input type="text" name="adminEditLocationMobileNoText" value=<%=location.getLocationMobileNo()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	<tr></tr>
	<tr>
	<td></td>
	<td><input type="submit" name="adminEditLocationSubmit" value="Submit" style="width: 100px"></td>
	</tr>
<%} %>

</table>
</body>
</html>