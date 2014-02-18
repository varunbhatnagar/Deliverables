package desktopApplication;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import catchBean.OrderPizza;
import facade.SwingFacade;

public class Confirm extends JFrame {
    private JPanel welcomeNote = new JPanel();
    private JPanel confirmPanel = new JPanel();
    private JPanel jPanel1 = new JPanel();
    private JButton homeButton = new JButton();
    private GridLayout gridLayout1 = new GridLayout();
    private JButton menuButton = new JButton();
    private JButton contactButton = new JButton();
    private JButton locationButton = new JButton();
    private JButton orderButton = new JButton();
    private JButton feedbackButton = new JButton();
    private JButton aboutusButton = new JButton();
    private JButton logoutButton = new JButton();
    private ImageIcon welcomeImg=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/welcome.jpg");
    private ImageIcon pizzaImg1=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg1.jpg");
    private ImageIcon pizzaImg2=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg2.jpg");
    private JLabel jLabel1 = new JLabel(welcomeImg);
    private JLabel welcomeLabel = new JLabel();
    private Order orderFrame=new Order();
    String orderStr;
    String totalStr;
    int totalQuant=0;
    float totalFloat=0;
    
            private ButtonGroup bG1=new ButtonGroup();
    private JButton  payButton = new JButton();
            private JButton goBack = new JButton();
            private JRadioButton cashRadioButton = new JRadioButton();
            private JRadioButton cardRadioButton = new JRadioButton();
            private JTextArea jTextArea1 = new JTextArea();
            private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel(welcomeImg);

    public Confirm() {  
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(1024, 768));
        welcomeNote.setBounds(new Rectangle(10, 10, 1000, 180));
        welcomeNote.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        welcomeNote.setLayout(null);
        welcomeNote.setBackground(new Color(255, 198, 132));

        //homeContent.setLineWrap(true);
       // homeContent.a
        welcomeLabel.setBounds(new Rectangle(510, 210, 495, 40));
        jPanel1.setBounds(new Rectangle(15, 160, 995, 30));
        jPanel1.setLayout(gridLayout1);
        homeButton.setText("HOME");
        menuButton.setText("MENU");
        menuButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        menuButton_actionPerformed(e);
                    }
                });
        contactButton.setText("CONTACT");
        locationButton.setText("LOCATIONS");
        orderButton.setText("ORDER");
        orderButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        orderButton_actionPerformed(e);
                    }
                });
        feedbackButton.setText("FEEDBACK");
        aboutusButton.setText("ABOUT US");
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        logoutButton_actionPerformed(e);
                    }
                });
                
                
       confirmPanel.setLayout( null );
       confirmPanel.setSize(new Dimension(516, 300));
        confirmPanel.setBounds(new Rectangle(260, 260, 516, 300));
        confirmPanel.setBackground(new Color(231, 180, 96));
        payButton.setText("Pay");
        payButton.setBounds(new Rectangle(280, 255, 85, 25));
        payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payButton_actionPerformed(e);
			}
		});
        goBack.setText("Go Back");
        goBack.setBounds(new Rectangle(380, 255, 85, 25));
        goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBack_actionPerformed(e);
			}
		});
        cashRadioButton.setText("CASH");
        cashRadioButton.setBounds(new Rectangle(20, 260, 110, 15));
        cardRadioButton.setText("CARD");
        cardRadioButton.setBounds(new Rectangle(135, 260, 120, 15));
        bG1.add(cashRadioButton);
        bG1.add(cardRadioButton);
        jTextArea1.setBounds(new Rectangle(65, 75, 415, 135));
        jTextArea1.setBackground(new Color(255, 191, 122));
        jTextArea1.setText("hi this is your order");
        jTextArea1.setEditable(false);
        jLabel2.setText("PaymentMode");
        jLabel2.setBounds(new Rectangle(20, 215, 130, 25));
        jLabel2.setBackground(new Color(135, 95, 39));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setFont(new Font("Tahoma", 1, 14));
        jLabel3.setBounds(new Rectangle(5, 10, 995, 150));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setFont(new Font("Tahoma", 1, 75));
        jLabel3.setHorizontalTextPosition(SwingConstants.CENTER);
        confirmPanel.add(jLabel2, null);
        confirmPanel.add(jTextArea1, null);
        confirmPanel.add(cardRadioButton, null);
        confirmPanel.add(cashRadioButton, null);
        confirmPanel.add( payButton, null);
        confirmPanel.add(goBack, null);
        jPanel1.add(homeButton, null);
        jPanel1.add(menuButton, null);
        jPanel1.add(locationButton, null);
        jPanel1.add(aboutusButton, null);
        jPanel1.add(contactButton, null);
        jPanel1.add(orderButton, null);
        jPanel1.add(logoutButton, null);
        jPanel1.add(feedbackButton, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(welcomeLabel, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(welcomeNote, null);


        //this.setVisible(true);
        this.getContentPane().add(confirmPanel, null);
        this.setTitle("CONFIRM");
        this.setBackground(Color.white);
    }
    public static void main(String args[]) {
        Confirm h1=new Confirm();
        h1.setVisible(true);
    }

    private void logoutButton_actionPerformed(ActionEvent e) {
    this.setVisible(false);
        Home logout= new Home();
        logout.setVisible(true);
    }

    private void orderButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
            Order order= new Order();
            order.setVisible(true);
    }
    private void homeButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        Home h1= new Home();
        h1.setVisible(true);
        }

    private void menuButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        LoginMenu loginmenu= new LoginMenu();
        loginmenu.setVisible(true);
    }
    private void goBack_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        orderFrame.setVisible(true);
       
    }
    private void payButton_actionPerformed(ActionEvent e) {
    	this.dispose();
        if(cardRadioButton.isSelected()){
        	Payment payment=new Payment();
        	payment.setVisible(true);
        	OrderPizza op= new OrderPizza();
        	//op.setCustomerId(customerId);
        	op.setOrder(orderStr);
        	//op.setOutletId(outletId);
        	op.setTotalAmount(totalFloat);
        	op.setTotalQuantity(totalQuant);
        	op.setPaymode("card");
        	//op.setTransactionId();
        	 this.dispose();
        	payment.setValues(orderStr,totalFloat,totalQuant);
        
        }
        else if(cashRadioButton.isSelected()){
        	//change cash values
        	totalFloat=(float)(totalFloat*1.02);
        	System.out.println("u will pay by cash");
        	OrderPizza op= new OrderPizza();
        	//op.setCustomerId(customerId);
        	op.setOrder(orderStr);
        	//op.setOutletId(outletId);
        	op.setTotalAmount(totalFloat);
        	op.setTotalQuantity(totalQuant);
        	//op.setTransactionId();
        	op.setPaymode("cash");
        	SwingFacade sf=new SwingFacade();
    		int status=sf.catchOrder(op); 
    		System.out.println(status);
        	HomeOrder h1=new HomeOrder();
        	h1.setVisible(true);
        	JOptionPane.showMessageDialog(null,"Your Order is Confirmed\n"+"YOU HAVE TO PAY:"+totalFloat+"\n  Thanks for Ordering With Us"  ,"THANX",JOptionPane.PLAIN_MESSAGE);
        	 //this.dispose();
        }
        
    }
    public void setOrder(String orderString,String totalField,int totalQuantity,Order o1){
    	orderStr=orderString;
    	totalStr=totalField;
    	totalQuant=totalQuantity;
    	totalFloat=Float.parseFloat(totalStr);
    	jTextArea1.setText("YOUR ORDER IS:\n\n"+orderString+"\n\n"+"TOTAL:"+totalField);
    	orderFrame=o1;
    	
    	
    }
}
