<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  This JSP is taking data from Order.jsp and processing it to show the user his order and ask his 
 * 	confirmation,allows him to go back
 * 
 **/%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="java.util.StringTokenizer"%>
<script type="text/javascript" src="spinmenu.js"></script>
<style type="text/css">
<!--
.style1 {font-family: "Comic Sans MS"}
-->
</style>


<script>
	function clickPay(){
				
				for(i=0;i<document.confirmform.radioPay.length;i++){
				if(document.confirmform.radioPay[i].checked==true)
				{
					
					if(document.confirmform.radioPay[i].value=="cash"){
						
						document.confirmform.action="ConOrder.jsp";
						
							}
						if(document.confirmform.radioPay[i].value==="card")
						{
						
							document.confirmform.action="PaymentForm.html";
						}	
				}
				}
				}
		function goBack() 
 		 { 
  			window.history.back() 
 		 } 
				
</script>
</head>


<body background="images/bg_main01.jpg" onload="history.go(+1)">
<script type="text/javascript" >



rahul.isVertical =0; //if it's vertical or horizontal [0|1]
rahul.x = 500; // x offset from point of insertion on page
rahul.y = 200; // y offset from point of insertion on page
rahul.w = 150; // item's width
rahul.h = 30; // height
rahul.r = 150; // menu's radius
rahul.v = 20; // velocity
rahul.s = 8; // scale in space (for 3D effect)
rahul.color = '#FFFFFF'; // normal text color
rahul.colorover = '#ffffff'; // mouseover text color
rahul.backgroundcolor = '#DC143C'; // normal background color
rahul.backgroundcolorover = '#EE6363'; // mouseover background color
rahul.bordercolor = '#000000'; //border color
rahul.fontsize = 15; // font size
rahul.fontfamily = 'Arial'; //font family
if (document.getElementById){
document.write('<div id="orderanchor" style="height:'+eval(rahul.h+20)+'"></div>')
rahul.anchor=document.getElementById('orderanchor')
rahul.ordermenu();
rahul.x+=getposOffset(rahul.anchor, "left") //relatively position it
rahul.y+=getposOffset(rahul.anchor, "top")  //relatively position it

//menuitem:   rahul.ordermenuitem(text, link, target)
rahul.ordermenuitem("HOME","index.html");
rahul.ordermenuitem("MENU","");
rahul.ordermenuitem("REGISTER","Register.html");
rahul.ordermenuitem("ABOUT US","");
rahul.ordermenuitem("LOGOUT","LogOut.jsp");
rahul.ordermenuitem("LOCATION","location.html");
rahul.ordermenuclose();
}
</script>
<form  action="" method=post  name="confirmform"  onload="history.go(+1)" > 

<%!String orderValue;
	String total;
	String order,sales;
	String quant;%>
<table width="853" height="1119" border="1" align="center" >

    <td width="843" height="163"><img src="images/welcome.jpg" width="843" height="159" /></td>
  </tr>
  <tr><td height="82"  ></td>
  </tr>
  <tr>
  <tr>

  </tr>
  <tr>
    <td height="864" ><table width="846" height="860" border="0" bgcolor="#FFCC66">
      <tr>
        <td width="101" height="734">&nbsp;</td>
        <td width="607" height="734" background="C:/Documents and Settings/Learning/Desktop/rhul/payment.jpg" ><table width="610" height="735" border="0">
          <tr>
            <td width="84" height="105">&nbsp;</td>
            <td width="427">&nbsp;</td>
            <td width="77">&nbsp;</td>
          </tr>
          <tr>
            <td height="471">&nbsp;</td>
            <td>
           		 <% 
				 	// If Session Expires go to logout 
           		 	System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.jsp" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>
           		 	 <%
           		 	order=request.getParameter("order");
           		 	
	 				total=request.getParameter("total");
	 				quant=request.getParameter("totalQuant");
	 				sales=request.getParameter("sales");
	 				session.setAttribute("order",order);
	 				session.setAttribute("total",total);
	 				session.setAttribute("quant",quant);
	 				session.setAttribute("sales",sales);
	 				System.out.println(session.getAttribute("order"));
	 				System.out.println(session.getAttribute("customerId"));
	 				System.out.println(session.getAttribute("total"));
	 				System.out.println(session.getAttribute("quant"));
	 				System.out.println(session.getAttribute("sales"));
					StringTokenizer orderToken=new StringTokenizer(order,"@");
					while(orderToken.hasMoreTokens()){
							StringTokenizer orderNext=new StringTokenizer(orderToken.nextToken(),";");
							while(orderNext.hasMoreTokens()){
	   							orderValue=orderNext.nextToken();
	  			 %><label><%=orderValue %></label><br>
	  			 <%} %>
	  			 <br>
	  			 <%} %>
	  			 <br>
	  			 <label>Total payable Amount <%=total %></label>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="140">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
        <td width="113">&nbsp;</td>
      </tr>
      <tr>
        <td height="56">&nbsp;</td>
        <td><marquee behavior="alternate">WITH CASH YOU HAVE TO PAY 2% EXTRA OF TOTAL</marquee>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td><input type="button" name="gobackButton" value="GO BACK" onclick="goBack()" style="height: 25px; width: 100px"/></td>
        <td><center><input type="radio" name="radioPay" size="30" value="cash">CASH
      <input type="radio" name="radioPay" size="30" value="card">CARD&nbsp;</center></td>
        <td><input type="submit" name="paybutton" value="Pay" onclick="clickPay()" style="height: 25px; width: 100px"/></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
