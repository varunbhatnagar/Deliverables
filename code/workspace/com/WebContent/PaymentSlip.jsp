<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<script type="text/javascript" src="spinmenu.js"></script>
<style type="text/css">
<!--
.style2 {color: #9900FF; font-family: Georgia, "Times New Roman", Times, serif; font-style: italic; font-size: 36px;}
.style3 {color: #993333}
.style6 {
	color: #9900CC;
	font-weight: bold;
	font-style: italic;
	font-size: 20px;
}
.style8 {color: #993333; font-weight: bold; }
-->
</style>
</head>


<body background="C:/Documents and Settings/Administrator/workspace1/com/images/bg_main01.jpg"  onload="history.go(+1)" >
						
<script type="text/javascript">



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
rahul.ordermenuitem("HOME","HomeAfterLogin.html");
rahul.ordermenuitem("MENU","Menu.jsp");
rahul.ordermenuitem("ORDER","Order.jsp");
rahul.ordermenuitem("ABOUT US","AboutUSAfterLogin.html");
rahul.ordermenuitem("LOGOUT","LogOut.jsp");
rahul.ordermenuitem("LOCATION","LocationAfterLogin.html");
rahul.ordermenuclose();
rahul.ordermenuclose();
}
</script>
					<% 
				 	// If Session Expires go to logout 
           		 	System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.jsp" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>
           		 	 <!-- GENERATING PAYMENT SLIP -->
<%!String order1;
String custID1;
String total1;
String quant1;
String sales1;
String mode1;
String loginid;
SimpleDateFormat sdf;
Calendar cal;
String outlet;
String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
%>
<%
			 order1=(String)session.getAttribute("order");
			 custID1=(String)session.getAttribute("customerId");
			 total1=(String)session.getAttribute("total");
			 quant1=(String)session.getAttribute("quant");
			 sales1=(String)session.getAttribute("sales");
			 mode1=(String)session.getAttribute("mode");
			 loginid=(String)session.getAttribute("loginId");%>
			 cal = Calendar.getInstance();
   			 sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
   			 outlet=session.getAttribute("outlet");
<table width="853" height="1126" border="1" align="center"  bordercolor="#003333" >
 <tr>
    <td width="843" height="163"><img src="images/welcome.jpg" width="843" height="159" /></td>
  </tr>
  <tr><td height="82"  ></td>
  </tr>
  <tr>
  <tr>
    
  </tr>
  <tr>
    <td height="869"><table width="845" height="856" border="1"  bordercolor="#003333" >
      <tr>
        <td width="835" height="850" bgcolor="#FFCC99">

          <h3 align="center" class="style2">Payment Successful</h3>
<h3 align="center" class="style3">Bill receipt</h3>
<table width="821" height="419" border="1" bordercolor="#000000">
	<tr>
		<td width="132" height="29"><span class="style3"><strong>Customer ID: </strong></span></td>
		<td width="181"><%=loginid%>&nbsp;</td>
		<td width="158"><span class="style3"><strong>Transaction ID</strong>:</span></td>
		<td width="204">&nbsp;</td>
	</tr>
	<tr>
		<td height="30"><span class="style3"><strong>Customer Name</strong>:</span></td>
		<td><%=custID1 %>&nbsp;</td>
		<td><span class="style3"><strong>Transaction DateTime:</strong></span></td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td height="30" colspan="4"><span class="style3"><strong>Outlet Name:   <%=outlet%></strong></span></td>
	</tr>
	<tr>
		<td height="30" colspan="4"><span class="style3"><strong>Delivery Address: </strong></span></td>
	</tr>
	<tr>
		<td height="30" colspan="4">
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>		</td>
	</tr>
	<tr>
		<td height="30" colspan="4"><span class="style8">Order Detail: </span></td>
	</tr>
	<tr>
		
		<td height="30" colspan="2"> <%=order1%>&nbsp;</td>
	</tr>
	
	<tr>
		<td height="30"><span class="style3"><strong>NET Payment:</strong></span></td>
		<td height="30" colspan="3"><%=total1%>&nbsp;</td>
	</tr>
	<tr>
		<td height="30"><strong class="style3">Payment mode: </strong></td>
		<td height="30" colspan="3"><%=mode1%>&nbsp;</td>
	</tr>
</table>
<p align="center"><span class="style6"> 
Thanks for ordering from Pizza Corner. Your order will be delivered within 30 minutes.</span></p>

<p align="center">
  <input type="button" name="printbutton" value="PRINT"
	onClick="printPage();" />
</p></td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>

