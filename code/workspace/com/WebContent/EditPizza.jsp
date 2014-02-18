<%/**
 * @author 
 *
 * @version 1.0
 * This page receives pizza name that is to be deleted from  
 * the database and passes it to facade
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "bean.PizzaItem" %>
<%@ page import= "facade.JSPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Administrator</title>
</head>
<body bgcolor="#FFCC99">
<b>

	<i><%
	if((request.getParameter("adminEditPizzaText")).equals("")){
		out.print("Error! Pizza Name Not Entered");//validation
	}
	else{
	%>
	</i>	
</b>
<ol>
<h4><li type="1">Edit Pizza</li></h4>
<form action="EditedPizza.jsp" method="POST">
<table colspan="2">
<%	
	String enteredPizzaName= request.getParameter("adminEditPizzaText");
	PizzaItem pizzaItem= new PizzaItem();
	JSPFacade facadePizzaInfo= new JSPFacade();
	pizzaItem= facadePizzaInfo.catchPizzaInfo(enteredPizzaName);
%>
	<tr>
	<td></td>
	<td align="center"><i><b>Pizza Details</b></i></td>
	</tr>
	<tr></tr>	<tr></tr>
	<tr>
		<td><i>Pizza Name</i></td>
		<td><input type="text" name="adminEditPizzaNameText" value=<%=pizzaItem.getPizzaName()%> readonly=yes size="20" maxlength="20" ></td>
	</tr>
	<tr></tr>
	<tr>
	<td><i>Pizza Type</i></td>
		<td><input type="text" name="adminEditPizzaTypeText" value=<%=pizzaItem.getPizzaType()%> size="20" maxlength="20"></td>
    </tr>
    <tr></tr>
    <tr> 
		<td><i>Pizza Size</i></td>
		<td><input type="text" name="adminEditPizzaSizeText" readonly=yes value=<%=pizzaItem.getPizzaSize()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>Pizza Topping</i></td>
		<td><input type="text" name="adminEditPizzaToppingText" value=<%=pizzaItem.getPizzaTopping()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>	
	<tr>
		<td><i>Pizza Rate</i></td>
		<td><input type="text" name="adminEditPizzaRateText" value=<%=pizzaItem.getPizzaRate()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>
	<tr>
		<td><i>Img Path</i></td>
		<td><input type="text" name="adminEditImgPathText" value=<%=pizzaItem.getImgPath()%> size="20" maxlength="20" ></td> 
	</tr>
	<tr></tr>
	<tr></tr>
	<tr>
	<td></td>
	<td><input type="submit" name="adminEditPizzaSubmit" value="Submit" style="width: 100px"></td>
	</tr>
	<%} %>
</table>
</form>
</body>
</html>