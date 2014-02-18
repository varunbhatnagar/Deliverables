package desktopApplication;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Rectangle;

import java.awt.TextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Payment extends JFrame {
	private JPanel welcomeNote = new JPanel();
	private JPanel PaymentPanel = new JPanel();
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

	private JLabel header = new JLabel();
	private JLabel cardNo = new JLabel();
	private JLabel holderName = new JLabel();
	private JLabel bankName = new JLabel();
	private JLabel validUpto = new JLabel();
	private JTextField cardNoText = new JTextField("");
	//private JTextField jTextField2 = new JTextField();
	private JTextField bankNameText = new JTextField("");
	// private JTextField jTextField4 = new JTextField();
	private JTextField holderNameText = new JTextField("");
	private JLabel cardType = new JLabel();
	private String type[]={"VISA","MASTER","MAESTRO"};
	private JComboBox cardTypeBox = new JComboBox(type);
	private JButton reset = new JButton();
	private JButton submit = new JButton();
	private String monthList[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
	private JComboBox month = new JComboBox(monthList); 
	private JTextField year = new JTextField("");
	private JLabel yyyy = new JLabel();
	private JLabel mm = new JLabel();


	public Payment() {  
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
		jLabel1.setBounds(new Rectangle(5, 10, 995, 150));
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Tahoma", 1, 75));
		jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
		PaymentPanel.setLayout( null );
		PaymentPanel.setSize(new Dimension(553, 404));
		header.setText("Payment Details");
		header.setBounds(new Rectangle(140, 10, 260, 45));
		header.setFont(new Font("Tahoma", 0, 30));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		cardNo.setText("Card no :");
		cardNo.setBounds(new Rectangle(20, 90, 135, 25));
		cardNo.setFont(new Font("Tahoma", 0, 18));
		cardNo.setHorizontalAlignment(SwingConstants.CENTER);
		holderName.setText("Holder name :");
		holderName.setBounds(new Rectangle(20, 125, 135, 25));
		holderName.setFont(new Font("Tahoma", 0, 18));
		holderName.setHorizontalAlignment(SwingConstants.CENTER);
		bankName.setText("Bank name :");
		bankName.setBounds(new Rectangle(20, 165, 135, 25));
		bankName.setFont(new Font("Tahoma", 0, 18));
		bankName.setHorizontalAlignment(SwingConstants.CENTER);
		validUpto.setText("Valid upto:");
		validUpto.setBounds(new Rectangle(20, 240, 135, 25));
		validUpto.setFont(new Font("Tahoma", 0, 18));
		validUpto.setHorizontalAlignment(SwingConstants.CENTER);
		cardNoText.setBounds(new Rectangle(170, 90, 235, 25));
		// jTextField2.setBounds(new Rectangle(170, 160, 235, 25));
		bankNameText.setBounds(new Rectangle(170, 160, 235, 25));
		//jTextField4.setBounds(new Rectangle(170, 125, 235, 25));
		holderNameText.setBounds(new Rectangle(170, 125, 235, 25));
		cardType.setText("Card Type :");
		cardType.setBounds(new Rectangle(25, 200, 135, 25));
		cardType.setFont(new Font("Tahoma", 0, 18));
		cardType.setHorizontalAlignment(SwingConstants.CENTER);
		cardTypeBox.setBounds(new Rectangle(170, 200, 235, 25));
		cardTypeBox.setSelectedIndex(-1);
		cardTypeBox.setBackground(Color.white);
		reset.setText("RESET");
		reset.setBounds(new Rectangle(305, 305, 110, 25));
		reset.setFont(new Font("Tahoma", 1, 11));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset_actionPerformed(e);
			}
		});
		submit.setText("SUBMIT");
		submit.setBounds(new Rectangle(150, 305, 110, 25));
		submit.setFont(new Font("Tahoma", 1, 11));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submit_actionPerformed(e);
			}
		});
		month.setBounds(new Rectangle(205, 240, 90, 20));
		month.setSelectedIndex(-1);
		month.setBackground(Color.white);
		year.setBounds(new Rectangle(360, 240, 70, 20));
		yyyy.setText("YYYY");
		yyyy.setBounds(new Rectangle(320, 240, 30, 20));
		yyyy.setFont(new Font("Tahoma", 1, 11));
		mm.setText("MM");
		mm.setBounds(new Rectangle(175, 240, 25, 20));
		mm.setFont(new Font("Tahoma", 1, 11));
		//PaymentPanel.getContentPane().add(jTextField4, null);
		//PaymentPanel.getContentPane().add(jTextField2, null);
		PaymentPanel./*getContentPane().*/add(mm, null);
		PaymentPanel.add(yyyy, null);
		PaymentPanel.add(year, null);
		PaymentPanel.add(month, null);
		PaymentPanel.add(submit, null);
		PaymentPanel.add(reset, null);
		PaymentPanel.add(cardTypeBox, null);
		PaymentPanel.add(cardType, null);
		PaymentPanel.add(holderNameText, null);
		PaymentPanel.add(bankNameText, null);
		PaymentPanel.add(cardNoText, null);
		PaymentPanel.add(validUpto, null);
		PaymentPanel.add(bankName, null);
		PaymentPanel.add(holderName, null);
		PaymentPanel.add(cardNo, null);
		PaymentPanel.add(header, null);
		PaymentPanel.setVisible(true);
		//homeContent.setLineWrap(true);
		//homeContent.setLineWrap(true);
		//homeContent.setLineWrap(true);
		// homeContent.a
		PaymentPanel.setBounds(new Rectangle(275, 260, 553, 404));
		PaymentPanel.setBackground(new Color(245, 184, 141));
		PaymentPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		jPanel1.setBounds(new Rectangle(15, 160, 995, 30));
		jPanel1.setLayout(gridLayout1);
		homeButton.setText("HOME");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeButton_actionPerformed(e);
			}
		});
		menuButton.setText("MENU");
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuButton_actionPerformed(e);
			}
		});
		contactButton.setText("CONTACT");
		contactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactButton_actionPerformed(e);
			}
		});
		locationButton.setText("LOCATIONS");
		locationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationButton_actionPerformed(e);
			}
		});
		orderButton.setText("ORDER");
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderButton_actionPerformed(e);
			}
		});
		feedbackButton.setText("FEEDBACK");
		feedbackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedbackButton_actionPerformed(e);
			}
		});
		aboutusButton.setText("ABOUT US");
		aboutusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutusButton_actionPerformed(e);
			}
		});
		logoutButton.setText("LOGOUT");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutButton_actionPerformed(e);
			}
		});
		welcomeNote.add(jLabel1, null);
		jPanel1.add(homeButton, null);
		jPanel1.add(menuButton, null);
		jPanel1.add(locationButton, null);
		jPanel1.add(aboutusButton, null);
		jPanel1.add(contactButton, null);
		jPanel1.add(orderButton, null);
		jPanel1.add(logoutButton, null);
		jPanel1.add(feedbackButton, null);
		this.getContentPane().add(jPanel1, null);
		this.getContentPane().add(welcomeNote, null);
		//this.setVisible(true);
		this.getContentPane().add(PaymentPanel,null);
		this.setSize(new Dimension(1024, 768));
		this.setTitle("Payment");
		this.setBackground(Color.white);
	}
	public static void main(String args[]) {
		Payment h1=new Payment();
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
		HomeOrder h1= new HomeOrder();
		h1.setVisible(true);
	}

	private void menuButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		LoginMenu loginmenu= new LoginMenu();
		loginmenu.setVisible(true);
	}
	private void aboutusButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		AboutUs aboutus= new AboutUs();
		aboutus.setVisible(true);
	}
	private void contactButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Contact contact= new Contact();
		contact.setVisible(true);
	}
	private void locationButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Location location= new Location();
		location.setVisible(true);
	}
	private void feedbackButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		FeedBack feedback= new FeedBack();
		feedback.setVisible(true);
	}





	private void submit_actionPerformed(ActionEvent e) {    }

	private void reset_actionPerformed(ActionEvent e) {
	}

	private void month_actionPerformed(ActionEvent e) {    }
	public void setValues(String orderStr,float totalfloat,int totalQuantity){
	}
}

