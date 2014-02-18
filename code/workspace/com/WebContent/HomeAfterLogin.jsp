<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 * Generating Home after Login if user is REGULAR OR CORPORATE
 * 
 * 
 **/%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script type="text/javascript" src="spinmenu.js"></script>
</head>
<body background="images/bg_main01.jpg">
<script type="text/javascript">
	rahul.isVertical =0;                  // if it's vertical or horizontal [0|1]
	rahul.x = 500;                        // x offset from point of insertion on page
	rahul.y = 200;                        // y offset from point of insertion on page
	rahul.w = 150;                        // item's width
	rahul.h = 30;                         // height
	rahul.r = 150;                        // menu's radius
	rahul.v = 20;                         // velocity
	rahul.s = 8;                          // scale in space (for 3D effect)
	rahul.color = '#FFFFFF';              // normal text color
	rahul.colorover = '#ffffff';          // mouseover text color
	rahul.backgroundcolor = '#DC143C';    // normal background color
	rahul.backgroundcolorover = '#EE6363';// mouseover background color
	rahul.bordercolor = '#000000';        // border color
	rahul.fontsize = 15;                  // font size
	rahul.fontfamily = 'Arial';           // font family
	if (document.getElementById)	{
		document.write('<div id="orderanchor" style="height:'+eval(rahul.h+20)+'"></div>')
		rahul.anchor=document.getElementById('orderanchor')
		rahul.ordermenu();
		rahul.x+=getposOffset(rahul.anchor, "left") //relatively position it
		rahul.y+=getposOffset(rahul.anchor, "top")  //relatively position it

		//menuitem:   rahul.ordermenuitem(text, link, target)
		rahul.ordermenuitem("HOME","HomeAfterLogin.jsp");
		rahul.ordermenuitem("MENU","MenuAfterLogin.jsp");
		rahul.ordermenuitem("ORDER","Order.jsp");
		rahul.ordermenuitem("ABOUT US","AboutUSAfterLogin.html");
		rahul.ordermenuitem("LOGOUT","LogOut.jsp");
		rahul.ordermenuitem("LOCATION","LocationAfterLogin.html");
		rahul.ordermenuclose();
	}
</script>
				<% 
           		 	// If Session Expires go to logout 
					System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.html" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>

		<table width="853" height="1126" border="1" align="center"  bordercolor="#003333" >
 			<tr>
    			<td width="843" height="163"><img src="images/welcome.jpg" width="843" height="159" /></td>
  			</tr>
  			<tr>
				<td height="82"  ></td>
  			</tr>
 			 <tr>
  			<tr>
    
  			</tr>
  			<tr>
    			<td height="869">
					<table width="842" height="856" border="1"  bordercolor="#003333" >
      				<tr>
        				<td width="407" height="850" bgcolor="#FFCC99"><%=session.getAttribute( "noOfTransaction") %><%=session.getAttribute("customerId") %>;</td>
        				<td width="419"><table width="406" height="849" border="1"  bordercolor="#003333" >
          			<tr>
            	<td width="196" height="194"><a href="Menu.jsp"><img src="images//menu.png" width="207" height="189" /></a></td>
            	<td width="194"><img src="images/cheesybites_img.jpg" width="180" height="191" align="middle"/></td>
          			</tr>
         	 	<tr>
            		<td height="206"><img src="images/specChesseloversLg.jpg" width="208" height="200" /></td>
            		<td><a href="Order.jsp"><img src="images/order.jpg" width="181" height="201" /></a></td>
          		</tr>
          		<tr>
            		<td height="216"><a href="Location.html"><img src="images/locator.gif" width="208" height="212" /></a></td>
            		<td><img src="images/pizza_3.jpg" width="180" height="214" /></td>
          		</tr>
          	<tr>
            	<td height="220"><img src="images/MeatLoversLg.jpg" width="211" height="217" /></td>
            	<td><img src="images/whats_hot_not.jpg" width="192" height="201" /></td>
          	</tr>
		</table>
	</td>
  </tr>
</table>
</td>
</tr>
</table>
</body>
</html>

