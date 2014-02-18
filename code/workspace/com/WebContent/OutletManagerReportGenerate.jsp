<%/**
 * @author LAKHAA.J
 *
 * @version 1.0
 * This OutletManagerReporGenerate class contains the report details
 * for the particular transaction selected
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Imports for standard API's-->
<%@ page import="java.sql.Connection" %> 
<%@ page import="java.sql.PreparedStatement" %> 
<%@ page import="java.sql.ResultSet" %>

<!--Imports for DB Connection class--> 
<%@page import="dataBase.CreateConnection"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Generation</title>
</head>
<body  bgcolor="#FFCC99">
	<!--Java Scripts for OutletMangerReportGenerate.jsp-->
	<script>
	/**
 	* Opens the print dialog to print the report 
 	* @param
	* @return
	**/
	function printPage(){
		window.print();
	}
	</script>
	<!--End of Java Scripts for OutletMangerReportGenerate.jsp-->
	<h3 align="left">Report Generate</h3>
	<!-- Gets the Transaction id from request object-->
	<%!String transid; %>
	<%if(request.getParameter("TransButton").equals("GenerateReport"))
	{
	transid = request.getParameter("TransOptionRadio"); 
	
	}
	%>
	
	<!--Establishes connection using the DB connection class with the database-->
	<%try{		
		CreateConnection connclassObject = new CreateConnection();
		Connection connect = connclassObject.returnCon();%>
		<%--SQL Query to get pizza_order details from the database --%>
		<%String getPizzaOrderDetail = " select * FROM Pizza_Order where trans_id=?"; 
		PreparedStatement preparedStatement = connect.prepareStatement(getPizzaOrderDetail);
		if(transid!=null){
			preparedStatement.setString(1,transid.toString());
			ResultSet rs = preparedStatement.executeQuery();	
			while(rs.next()){
				int cnt = rs.getRow();%>	
	
	<!-- Table that contains the report details-->
	<table width="703" height="419" border="0">
  	<tr>
  		<%-- Table row that contains Customer Id and Transaction Id--%>
    	<td width="132" height="29"><strong>Customer ID: </strong></td>
    	<td width="181">&nbsp;</td>
    	<td width="158"><strong>Transaction ID</strong>: </td>
    	<td width="204"><%=transid %>&nbsp;</td>
  	</tr>
  	<tr>
  		<!-- Table row that contains Customer Id and Transaction DateTime-->
    	<td height="30"><strong>Customer Id</strong>: </td>
    	<td>&nbsp;<%=rs.getString(2)%></td>
    	<td height="30"><strong>Customer Id</strong>: </td>
    	<td>&nbsp;<%=rs.getString(7)%></td>
   	</tr>
  	<tr>
  		<!-- Table row that contains Outlet Name-->
    	<td height="30" colspan="4"><strong>Outlet Name:<%=rs.getString(4)%> </strong></td>
  	</tr>
  	<tr>
  		<!-- Table row that contains Delivery Address-->
    	<td height="30" colspan="4"><strong>Delivery Address: </strong> </td>
  	</tr>
  	<tr>
    	<td height="30" colspan="4"><p>&nbsp;</p>
    	<p>&nbsp;</p>
    	<p>&nbsp;</p></td>
  	</tr>
  	<tr>
  		<!-- Table rows that contains OrderDetail-->
    	<td height="30" colspan="4"><strong>Order Detail: </strong></td>
  	</tr>
  	<tr>
    	<td height="30" colspan="2">&nbsp;<%=rs.getString(3)%></td>
    	
  	</tr>
   	<tr>
    	<td height="30"><strong>Total Amount:</strong> </td>
    	<td height="30" colspan="3">&nbsp;<%=rs.getString(6)%></td>
  	</tr>
  	<tr>
    	<td height="30"><strong>Payment Mode: </strong></td>
    	<td height="30" colspan="3">&nbsp;<%=rs.getString(8)%></td>
  	</tr>
	</table>
		<%}
		}
	}catch(Exception e){ %>
		<!--Prints the stack trace of the exception occurred-->
	<%	e.printStackTrace(); 
	}%> 
	<p>	
		<!-- Button to open the print dialog-->
		<input type="button" name="printbutton" value="PRINT" onclick="printPage();"/> &nbsp; &nbsp;
		<input type="button" name="goBack" value="Go Back" onclick="window.history.back(-1);"/>
	</p>
</body>
</html>
