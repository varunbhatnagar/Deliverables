<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  This JSP is taking data from ConfirmOrder.jsp if USER wants to pay by CASH
 * 	
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="facade.Facade"%>
<%@page import="catchBean.OrderPizza"%>
</head>
<body>
					<% 
           		 	// If Session Expires go to logout 
					System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.html" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>
           							 <!--JSP FOR PAYMENT BY CASH -->
<%		
			String outletName;
			boolean status;
			float totalFinal;
			float Discount;
			float Multiplier;
			float subt;
			int custId=Integer.parseInt((String)(session.getAttribute("customerId")));
			Facade orderfac = new Facade();
			outletName=orderfac.getOutlet(custId);
			System.out.println(outletName);
			OrderPizza op=new OrderPizza();
			// getting session variables for generating the business logic
			String order1=(String)session.getAttribute("order");
			String custID1=(String)session.getAttribute("customerId");
			String total1=(String)session.getAttribute("total");
			String quant1=(String)session.getAttribute("quant");
			String sales1=(String)session.getAttribute("sales");
			session.setAttribute("mode","cash");
			session.setAttribute("outlet",outletName);
			String type=(String)(session.getAttribute("type"));
			// 2% extra and Discount
			int quant2=Integer.parseInt(quant1);
			System.out.println(quant2);
			if(type.equals("Corporate")&& quant2>=50 ){
				session.setAttribute("discount","20");
			}
			//  calculating the discount according to the user, transaction ,payment mode,and no of transaction 
			Discount=Float.parseFloat((String)session.getAttribute("discount"));
			
			Multiplier=(float)(Discount/100);
			
			totalFinal=Float.parseFloat(total1);
			subt=totalFinal*Multiplier;
			// 2% extra for paynig through cash
			
			totalFinal=(float)((totalFinal*1.02)-subt);
			total1=totalFinal+"";
			session.setAttribute("total",total1);
			op.setOrder(order1);
			op.setCustomerId(custID1);
			op.setPaymode(1);
			op.setTotalAmount(Float.parseFloat(total1));
			op.setTotalQuantity(Integer.parseInt(quant1));
			op.setOutletName(outletName);
			status=orderfac.catchOrder(op,sales1);
			System.out.println(status);
			// after setting all session variables forward the page to Payment Slip
			if(status==true){%>
				<jsp:forward page="PaymentSlip.jsp" >
				<jsp:param name="mName" value="rahul" />
				</jsp:forward>
			<% }%>
			%>
</body>
</html>