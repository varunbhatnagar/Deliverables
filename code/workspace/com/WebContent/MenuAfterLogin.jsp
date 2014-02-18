<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  This JSP is taking care of Menu after Login 
 * 	Dynamic page taking data from Database
 * 
 **/%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="facade.Facade"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="catchBean.PizzaCatlogue"%>
<title>Order</title>
<link rel="stylesheet" type="text/css" href="plusimageviewer.css" />
<style>
<!--
	#verticaltext {
		writing-mode: tb-rl;
		filter: flipv fliph;
		background-color:#DC143C;
	}
	.style1 {
		font-family: "Comic Sans MS"
	}
	.style2 {
		color: #000000;
		font-weight: bold;
	}
-->
</style>
<!-- JavaScript -->
	<script type="text/javascript" src="jquery.js"></script>
	<script  type="text/javascript" src="plusimageviewer.js"> </script>
	<script type="text/javascript">
	function clickhome(){
				
							document.order.action="HomeAfterLogin.jsp";
							document.order.submit();
				
						}
						function clickLogout(){
				
							document.order.action="LogOut.jsp";
								document.order.submit();
				
						}
	</script>
	
</head>
<body background="C:/Documents and Settings/Administrator/workspace1/com/images/bg_main01.jpg" >
	<form  action="" method=post name="order">
	<table width="853" height="1300" border="1" align="center" bordercolor="#003333" >
		<tr>
    		<td width="843" height="163"><img src="images/welcome.jpg" width="843" height="159" /></td>
  		</tr>
  		<tr>
			<td height="93"  ><table width="849" border="0">
    <tr>
      <td width="155"><input type="button" name="home" value="HOME" onClick="clickhome()"></td>
      <td width="480">&nbsp;</td>
      <td width="189"><input type="button" name="logout" value="LOGOUT"  onClick="clickLogout()"></td>
    </tr>
  </table></td>
  		</tr>
  		<tr>
    		<td height="716">
		<table width="843" height="1011" border="1">
		 	<tr bgcolor="#FFCC66">
        		<td height="42" >
					<span class="style2">
						<marquee behavior="alternate">
							<span class="style1"><a href="Order.jsp">GO TO ORDER AND ENJOY ORDERING</a></span>
						</marquee>
					</span>
        		</td>
      		</tr>
      		
			<%! //global variables
				ArrayList catalogue=new ArrayList();
				Iterator catalogueItr;
				PizzaCatlogue pc= new PizzaCatlogue();
				PizzaCatlogue pc1= new PizzaCatlogue();
				PizzaCatlogue pc2= new PizzaCatlogue();
			%>
			<%
				Facade f1=new Facade();
				catalogue=f1.catchCatalogue();// method in facade for getting catalogue returns a arraylist
				catalogueItr=catalogue.iterator();// craeting iterator for getting values
			%>
			<%! String s[]=new String[100];// creating order sequence 
				float rate[]=new float[100];
			%>
			<%	for(int i=0;catalogueItr.hasNext();i+=3){
				pc=((PizzaCatlogue)catalogueItr.next());
				// creating menu string
				s[i]="Size:"+pc.getSize()+"    Toppings:"+pc.getToppings()+"   Type:"+pc.getType()+"    Price:"+pc.getRate();
		
				pc1=((PizzaCatlogue)catalogueItr.next());
				s[i+1]="Size:"+pc1.getSize()+"    Toppings:"+pc1.getToppings()+"   Type:"+pc1.getType()+"    Price:"+pc1.getRate();
		
				pc2=((PizzaCatlogue)catalogueItr.next());
				s[i+2]="Size:"+pc2.getSize()+"    Toppings:"+pc2.getToppings()+"   Type:"+pc2.getType()+"    Price:"+pc2.getRate();
		
			%>
		<!-- Dynamicaly gerating the rows according to the catalogue values -->
   		<tr>
        	<td height="177">
				<table width="836" height="172" border="1">
          		  <tr>
            		<td width="34" bgcolor="#DC143C"><div id="verticaltext"><%=pc.getName()+"  "+pc.getType() %></div>&nbsp;</td>
            		<td width="221"><img  src=<%=pc.getPath()+"_small"+".JPG"%> style="width:200px height:200px" alt=<%=(pc.getName()+"  "+pc.getSize()+"   "+pc.getToppings()+"   "+pc.getType())%>
						data-plusimage=<%=pc.getPath()+".jpg"%>
						data-plussize="500,400" /></td>
            		<td width="563">
						<table width="563" height="157" border="0" bgcolor="#FFCC66">
              				<tr>
                				<td><%=s[i]%>&nbsp;</td>
              				</tr>
              				<tr>
                				<td><%=s[i+1]%>&nbsp;</td>
              				</tr>
              				<tr>
                				<td><%=s[i+2]%>&nbsp;</td>
              				</tr>
 						</table>
					</td>
       			  </tr>
 				</table>
			</td>
      	</tr>
<%} %>
		<tr>
		</table></td>
  		</tr>
</table>
</form>
</body>
</html>
