<%/**
 * @author LAKHAA.J
 *
 * @version 1.0
 * This PaymentValidate class contains validation of card details
 * with the database
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="facade.Facade"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="history.go(+1)">
					<% 
				 	// If Session Expires go to logout 
           		 	System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.jsp" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>
	<form name="TransactionDetail" action="" method="post">
	<!-- Creates new facade object -->
	<%Facade facadeObject = new Facade(); %> 
	
	<!-- Creates new Payment Bean object and uses the setter method to fill the bean -->
	<jsp:useBean id="paybeanobject"  class="catchBean.PaymentBean" /> 
	<jsp:setProperty name="paybeanobject" property="payCardType" param="payCardTypeList" /> 
	
	<!-- Gets the concatenated card number using the request object -->
	<%String cardnumberPart1 = request.getParameter("payCardNumText1"); %>
	<%String cardnumberPart2 = request.getParameter("payCardNumText2"); %>
	<%String cardnumberPart3 = request.getParameter("payCardNumText3"); %>
	<%String cardnumberPart4 = request.getParameter("payCardNumText4"); %>
	<%String payCardNumber = "null"; %> 
	<%payCardNumber =  cardnumberPart1.concat(cardnumberPart2).concat(cardnumberPart3).concat(cardnumberPart4);%>
	
	<jsp:setProperty name="paybeanobject" property="payCardNumber" value="<%=payCardNumber%>"/> 
	<jsp:setProperty name="paybeanobject" property="payCardHolderName" param="payCardNameText" /> 
	<jsp:setProperty name="paybeanobject" property="payCardCvv" param="payCardCvvText" /> 
	<jsp:setProperty name="paybeanobject" property="payCardBankName" param="payBankNameList" /> 
	
	<!-- Gets the expiry month and year using the request object -->
	<%String expiryMonth = request.getParameter("payExpiryMonthList"); %>
	<%String expiryYear = request.getParameter("payExpiryDateList"); %>
	<%String payCardExpiry = "null"; %>
	<%payCardExpiry = expiryMonth.concat("-").concat(expiryYear); %>
	<jsp:setProperty name="paybeanobject" property="payCardExpiry" value="<%=payCardExpiry%>"/> 
	
	<!-- Facade class method is called by passing bean object that returns database update status -->
	<%int status = facadeObject.catchPayment(paybeanobject);%>
	<%if(status!=0){ 
		out.print("Payment Successful");%>
		<!-- If payment successful displays the order slip -->
		<jsp:forward page="ConOrder1.jsp">
		<jsp:param name="status" value="<%=status%>"/>
		</jsp:forward>
	<%} 
	else{%>
		<!-- If payment not successful goes back to the order page -->
		<%="Card Details not matched !! Payment invalid!!! " %>
		<input type="button" value="BACK TO HOME" name="goBack" onClick="window.replace("HomeAfterLogin.jsp")">
	<% }%>
</form>
</body>
</html>