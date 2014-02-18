<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  This JSP is creating a HOME page ADMIN
 * 	
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Pizza Ordering System</title>

<script type="text/javascript" src="spinmenu.js"></script>
</head>
<body background="images/bg_main01.jpg">
<h3><i>Welcome Administrator</i></h3>
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
			//	menuitem:   rahul.ordermenuitem(text, link, target)
			rahul.ordermenuitem("HOME","HomeForAdmin.jsp");
			rahul.ordermenuitem("MENU","Menu.jsp");
			rahul.ordermenuitem("LOGOUT","LogOut.jsp");
			rahul.ordermenuitem("LOCATION","Location.html");
			rahul.ordermenuclose();
		}
	</script>
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
						<td width="419" height="850" bgcolor="#FFCC99"<ol><h4><li type="1">Add, Delete & Edit Pizza</li></h4>
					<table colspan="2">
							<tr>
								<td><input type="submit" onClick="self.location='AddDeleteEditPizza.jsp'" name="adminAddPizzaSubmit" value="Add, Delete or Edit Pizza" style="height:25px; width:200px"></td>
							</tr>
						</table>
						<h4><li>Add, Delete & Edit Location</li></h4>
						<table colspan="2">
							<tr>		
								<td><input type="submit" onClick="self.location='AddDeleteEditLocation.jsp'" name="adminAddLocationSubmit" value="Add, Delete or Edit Location" style="height:25px; width:200px"></td>
							</tr>
						</table>
							<h4><li>Add & Delete Employee Login</li></h4>
						<table colspan="2">
							<tr>
								<td><input type="submit" onClick="self.location='AddDeleteEmpLogin.jsp'" name="adminAddPizzaSubmit" value="Add & Delete Emp Login" style="height:25px; width:200px"></td>
							</tr>
						</table>
							<h4><li>Delete Customer</li></h4>
						<table colspan="2">
							<tr>
		<td><input type="submit" onClick="self.location='DeleteCustomer.jsp'" name="adminDeleteCustomerSubmit" value="Delete Customer" style="height:25px; width:200px"></td>
				</tr>
			</table>
					<h4><li>Generate Reports</li></h4>
				<table colspan="2">
				<tr>
				<td><input type="submit" onClick="self.location='LocationSalesReport.jsp'" name="adminLocationSalesReportSubmit" value="Location Sales Report" style="height:25px; width:200px"></td>
	
				<td><input type="submit" onClick="self.location='PizzaSalesReport.jsp'" name="adminPizzaSalesReportSubmit" value="Pizza Sales Report" style="height: 25px; width: 200px"></td>
	
				<td><input type="submit" onClick="self.location='CustomerSalesReport.jsp'" name="adminCustomerSalesReportSubmit" value="Customer Sales Report" style="height:25px; width:200px"></td>
				</tr>
</table>&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>
