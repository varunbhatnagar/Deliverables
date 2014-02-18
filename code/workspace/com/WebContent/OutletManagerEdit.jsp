<%/**
 * @author LAKHAA.J
 *
 * @version 1.0
 * This OutletManagerEdit class contains the saves the edited transaction status 
 * to the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Imports for Facade and Bean class-->
<%@page import="facade.Facade"%>
<%@page import="catchBean.TransactionStatusBean"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FFCC99">
	<form name="TransactionEdit" action="" method="post">
	
	<!--Saves the transaction status edited by the user in  a request object-->
	<%String transid=request.getParameter("TransOptionRadio"); %>
	<%String transstatus=request.getParameter("TransStatusSet"); %>
	<!--Creates Facade object-->
	<%!Facade facadeObject = new Facade();%>
	
	<!--Creates Transaction Bean object-->
	<%!TransactionStatusBean transbeanobject = new TransactionStatusBean(); %>
	
	<%--Sets Id and Status of the Transaction Bean object--%>
	<% if(transid!=null && transstatus!=null){
		transbeanobject.setTansactionId(transid);
		transbeanobject.setTransStatus(transstatus);%>
		
		<%--Calls the facade method by passing the transaction bean object and saves the return--%>
		<%int status = facadeObject.setTransactionStatus(transbeanobject);%>
		
		<!--Check for whether the transaction status has been updated or not-->
		<%if (status!=0){ %>
			<%out.print("Transction status updated successfully!!!");%>
			</br>
			<!--Button to go back to the OutletManagerTransactionDetail.jsp-->
			<input type="button" value="GO BACK" name="goBack" onclick="window.history.back();">
			
		<% }
	}%>
	</form>
</body>
</html>