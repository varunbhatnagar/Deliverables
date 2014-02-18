<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  This JSP is processing the order setting some of the session variables and retreiving the pizza catalogue
 * 	from the DATABASE COMPLETE DYNAMIC PAGE
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


	
	<link rel="stylesheet" type="text/css"
		href="plusimageviewer.css" />
		<style>
<!--
#verticaltext {
writing-mode: tb-rl;
filter: flipv fliph;
background-color:#DC143C;

}
-->
</style> 
<!-- JavaScript -->
	<script type="text/javascript" src="jquery.js"></script>
	<script  type="text/javascript" src="plusimageviewer.js"> </script>
	
		<!-- Script for creating the order string,total amount,total quantity,sales string with certain tokens  -->
		<script type="text/javascript">
		function Check1(){
		var alltags=document.getElementsByTagName("input");
		var notags=(alltags.length-5);
		var total=0;
		var order;
		var sales;
		var first=0;
		var totalquant=0;
		var status=false;
		for(i=0;i<notags;i+=2){
						
						if(alltags[i].checked==true){
						if(alltags[i+1].value===""){
							alert("You have Checked the Pizza!!! Enter Quantity");
							alltags[i+1].focus(); 
							status=false;
								return status;
						}
						else if(!isFinite(alltags[i+1].value)){
						alert("Enter Valid Number in the Text Field");
							alltags[i+1].focus(); 
							status=false;
								return status;
						}
						status=true;
						totalquant=totalquant+parseInt(alltags[i+1].value);
							var length=((alltags[i].value).length);
							length1=(alltags[i].value).lastIndexOf(':');
							rate=parseFloat((alltags[i].value).substring(length1+1,length));
							total=total+((parseFloat(alltags[i+1].value))*rate);
							if(first==0){
							order=(alltags[i].value)+"  Quantity:"+parseInt(alltags[i+1].value);
							first=1;
							sales=parseInt(alltags[i+1].value);
							
							}
							else if(first>0){
							order=order+"@"+(alltags[i].value)+"  Quantity:"+parseInt(alltags[i+1].value);
							sales=sales+"@"+parseInt(alltags[i+1].value);}
						
						}
						else{
								if(first==0){
											first=1;
											sales="0";
											}
								else if(first>0){
								sales=sales+"@"+"0";
								}
							}					
							}
						
					if(status==true){
					<!-- Setting the values of hidden fields  -->
					document.order.order.value=order; 
					document.order.total.value=total; 
					document.order.totalQuant.value=totalquant; 
					document.order.sales.value=sales; 
					}
					return status;
					}
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
								<!--JSP FOR ORDER MODULE -->
<% 	
					// If Session Expires go to logout 
           		 	System.out.print(session.getId());
           		 	if(session.isNew()==true){%>
           		 		<jsp:forward page="LogOut.jsp" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
           		 	 <% }%>
		<%! String s[]=new String[100]; //order string array
				int code[]=new int[100];// pizza code string array
				String discount;
				String movingText;
				int j=0;
		%>
		
		<%String noOfTrans1=(String)(session.getAttribute("noOfTransaction"));
			System.out.println("hi"+noOfTrans1);
			int noOfTrans=Integer.parseInt(noOfTrans1);
			System.out.println(noOfTrans);
			String type=(String)(session.getAttribute("type"));
			System.out.println(type);
			if((type.equals("Regular")&& (noOfTrans>3))){
				discount="10";// setting the discount according to the business rules
			movingText=	"ENJOY ORDERING!!!!! YOU WILL GET 10% DISCOUNT!!!! YIPPIEEEE";
			session.setAttribute("discount",discount);
			}
			else if(type.equals("Corporate")){
				discount="0";//setting the discount according to the business rules
				movingText=	"WELCOME!!! Corporate user!!! ORDER MORE THAN 50 PIZZA TO GET 20 % DISCOUNT";
				session.setAttribute("discount",discount);
			}
			else{
				discount="0";
				session.setAttribute("discount",discount);// setting the discount value in  session variable
				movingText=	"WELCOME!!! ORDER MORE TO GET DISCOUNT";
			}
	%>
	<!-- Creating table having action as Confirm order -->
<form  action="ConfirmOrder.jsp" method=post name="order">
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
				<table width="843" height="710" border="1">
				 <tr bgcolor="#FFCC66">
        		<td height="42" ><marquee behavior="alternate"><%=movingText %></marquee>&nbsp;</td>
      	</tr>
      

	<%! // global variable to retrieve values from facade method
		ArrayList catalogue=new ArrayList();
		Iterator catalogueItr;  
		PizzaCatlogue pc= new PizzaCatlogue();
		PizzaCatlogue pc1= new PizzaCatlogue();
		PizzaCatlogue pc2= new PizzaCatlogue();
		%>
<%	
	Facade f1=new Facade();
	catalogue=f1.catchCatalogue();// calling facade method which return whole menu as arraylist
	catalogueItr=catalogue.iterator();%>
	
	<!-- Dynamicaly generating the Order tyable -->
	<%for(int i=0;catalogueItr.hasNext();i+=3){
		pc=((PizzaCatlogue)catalogueItr.next());
		s[i]=""+pc.getName()+";Size:"+pc.getSize()+";Toppings:"+pc.getToppings()+";Type:"+pc.getType()+";Price:"+pc.getRate();
		code[i]=pc.getPizzaCode();
		pc1=((PizzaCatlogue)catalogueItr.next());
		s[i+1]=""+pc1.getName()+";Size:"+pc1.getSize()+";Toppings:"+pc1.getToppings()+";Type:"+pc1.getType()+";Price:"+pc1.getRate();
		code[i+1]=pc1.getPizzaCode();
		pc2=((PizzaCatlogue)catalogueItr.next());
		s[i+2]=""+pc2.getName()+";Size:"+pc2.getSize()+";Toppings:"+pc2.getToppings()+";Type:"+pc2.getType()+";Price:"+pc2.getRate();
		code[i+2]=pc2.getPizzaCode();
		System.out.println(code[i]+"  "+code[i+1]+"   "+code[i+2]);
		
%>
<!--Dynamicaly generating the rows -->
   <tr>
        <td height="177"><table width="836" height="172" border="1">
          <tr>
            <td width="34" bgcolor="#DC143C"><div id="verticaltext"><%=pc.getName()+"  "+pc.getType() %></div>&nbsp;</td>
            <td width="221"><img  src=<%=pc.getPath()+"_small"+".JPG"%> style="width:200px height:200px" alt=<%=(pc.getName()+"  "+
			pc.getSize()+"   "+pc.getToppings()+"   "+pc.getType())%>
			data-plusimage=<%=pc.getPath()+".jpg"%>
			data-plussize="500,400" /></td>
            <td width="556"><table width="573" height="171" border="1">
              <tr>
                <td width="93" height="55"><center><input type="checkbox" name="checkbox" value=<%=s[i] %> ></center></td>
               <td width="228"><center><label>LARGE PRICE:<%=pc.getRate() %></label></center>&nbsp;</td>
                <td width="230"><center><input type="text" name="textfield" maxlength="5" size="10"></center></td>
              </tr>
              <tr>
                <td height="62"><center><input type="checkbox" name="checkbox" value=<%=s[i+1] %> ></center></td>
                <td><center><label>MEDIUM PRICE:<%=pc1.getRate() %></label></center>&nbsp;</td>
                <td><center><input type="text" name="textfield2" maxlength="5" size="10"></center></td>
              </tr>
              <tr>
                <td><center><input type="checkbox" name="checkbox" value=<%=s[i+2] %> ></center></td>
               <td><center><label>SMALL PRICE:<%=pc2.getRate() %></label></center>&nbsp;</td>
                <td><center><input type="text" name="textfield3" maxlength="5" size="10"></center></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      
    

<%} %>
<tr>
	<!-- creating hidden values to forward them to next page -->
  	<td width="273"><center><input type="submit" name="Submit" value="Confirm Order" onClick="return Check1()"></center>
  	<input type="hidden" name="order"><input type="hidden" name="total"><input type="hidden" name="totalQuant"><input type="hidden" 	name="sales"></td>
 </tr><td>
</table></td>
  </tr>


</table>
</form>
</body>
</html>
