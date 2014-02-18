package desktopApplication;

import catchBean.LoginBean;
import facade.SwingFacade;
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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Login extends JFrame {
	private JPanel welcomeNote = new JPanel();

	private JPanel buttonPanel = new JPanel();
	private JButton homeButton = new JButton();
	private GridLayout gridLayout1 = new GridLayout();
	private JButton menuButton = new JButton();
	private JButton contactButton = new JButton();
	private JButton locationButton = new JButton();
	private JButton registerButton = new JButton();
	private JButton feedbackButton = new JButton();
	private JButton aboutusButton = new JButton();
	private JButton loginButton = new JButton();
	private ImageIcon welcomeImg=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/welcome.jpg");
	private ImageIcon pizzaImg1=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg1.jpg");
	private ImageIcon pizzaImg2=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg2.jpg");
	private JLabel jLabel1 = new JLabel(welcomeImg);
	private JPanel jPanel1 = new JPanel();
	private JLabel jlbllogin = new JLabel();
	private JLabel jlblpwd = new JLabel();
	private JTextField jtxtlogin = new JTextField();
	private JPasswordField jpwdfield = new JPasswordField();
	private ButtonGroup rdbtngroup= new ButtonGroup();
	private JRadioButton jradiobtn1 = new JRadioButton();
	private JRadioButton jradiobtn2 = new JRadioButton();
	private JRadioButton jradiobtn3 = new JRadioButton();
	private JButton jbtnsignin = new JButton();
	private JButton jbtnforgotpwd = new JButton();
	private JLabel jlblusertype = new JLabel();

	public Login() {  
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

		//homeContent.setLineWrap(true);
		// homeContent.a
		buttonPanel.setBounds(new Rectangle(15, 160, 995, 30));
		buttonPanel.setLayout(gridLayout1);
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
		registerButton.setText("REGISTER");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerButton_actionPerformed(e);
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
		loginButton.setText("LOGIN");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginButton_actionPerformed(e);
			}
		});
		welcomeNote.add(jLabel1, null);
		buttonPanel.add(homeButton, null);
		buttonPanel.add(menuButton, null);
		buttonPanel.add(locationButton, null);
		buttonPanel.add(aboutusButton, null);
		buttonPanel.add(contactButton, null);
		buttonPanel.add(registerButton, null);
		buttonPanel.add(loginButton, null);
		buttonPanel.add(feedbackButton, null);

		//loginPanel.setTitle("Login");
		Color vio_blue = new Color(153,153,255);
		jPanel1.setBounds(new Rectangle(305, 275, 395, 310));
		jPanel1.setAutoscrolls(true);
		jPanel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		jPanel1.setLayout(null);
		jPanel1.setBackground(new Color(247, 247, 247));
		jPanel1.setFont(new Font("Comic Sans MS", 0, 12));
		jlbllogin.setText("Login Id");
		jlbllogin.setBounds(new Rectangle(85, 60, 80, 15));
		jlbllogin.setFont(new Font("Comic Sans MS", 0, 12));
		jlbllogin.setBackground(Color.red);
		jlbllogin.setForeground(Color.black);
		jlblpwd.setText("Password");
		jlblpwd.setBackground(Color.red);
		jlblpwd.setForeground(Color.black);
		jlblpwd.setBounds(new Rectangle(85, 90, 80, 15));
		jlblpwd.setFont(new Font("Comic Sans MS", 0, 12));
		jtxtlogin.setBounds(new Rectangle(175, 55, 115, 20));
		jtxtlogin.setFont(new Font("Times New Roman", 0, 12));
		jtxtlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField1_actionPerformed(e);
			}
		});
		jpwdfield.setBounds(new Rectangle(175, 85, 115, 20));
		jpwdfield.setFont(new Font("Times New Roman", 0, 12));
		jpwdfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jPasswordField1_actionPerformed(e);
			}
		});
		rdbtngroup.add(jradiobtn1);
		jradiobtn1.setText("Regular User");
		jradiobtn1.setBounds(new Rectangle(175, 120, 115, 20));
		jradiobtn1.setFont(new Font("Comic Sans MS", 0, 12));
		jradiobtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jRadioButton1_actionPerformed(e);
			}
		});
		rdbtngroup.add(jradiobtn2);
		jradiobtn2.setText("Corporate User");
		jradiobtn2.setBounds(new Rectangle(175, 150, 115, 20));
		jradiobtn2.setFont(new Font("Comic Sans MS", 0, 12));
		jradiobtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jRadioButton2_actionPerformed(e);
			}
		});
		rdbtngroup.add(jradiobtn3);
		jradiobtn3.setText("Employee");
		jradiobtn3.setBounds(new Rectangle(175, 180, 115, 20));
		jradiobtn3.setFont(new Font("Comic Sans MS", 0, 12));
		jbtnsignin.setText("Sign In");
		jbtnsignin.setBounds(new Rectangle(60, 220, 110, 20));
		jbtnsignin.setFont(new Font("Comic Sans MS", 0, 12));
		jbtnforgotpwd.setText("Forgot Password");
		jbtnforgotpwd.setBounds(new Rectangle(215, 220, 125, 20));
		jbtnforgotpwd.setFont(new Font("Comic Sans MS", 0, 12));
		jbtnforgotpwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButton2_actionPerformed(e);
			}
		});
		jbtnsignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signin_actionPerformed(e);
			}
		});

		jlblusertype.setText("User Type");
		jlblusertype.setBounds(new Rectangle(85, 120, 75, 20));
		jlblusertype.setFont(new Font("Comic Sans MS", 0, 12));
		jPanel1.add(jlblusertype, null);
		jPanel1.add(jbtnforgotpwd, null);
		jPanel1.add(jbtnsignin, null);
		jPanel1.add(jradiobtn3, null);
		jPanel1.add(jradiobtn2, null);
		jPanel1.add(jradiobtn1, null);
		jPanel1.add(jpwdfield, null);
		jPanel1.add(jtxtlogin, null);
		jPanel1.add(jlblpwd, null);
		jPanel1.add(jlbllogin, null);
		jPanel1.setBackground(vio_blue);
		// setVisible(true);






		this.getContentPane().add(buttonPanel, null);
		this.getContentPane().add(welcomeNote, null);
		//this.setVisible(true);
		this.getContentPane().add(jPanel1, null);
		this.setTitle("LOGIN PAGE");
		this.setBackground(Color.white);
	}
	public static void main(String args[]) {
		Login l1=new Login();
		l1.setVisible(true);
	}

	private void loginButton_actionPerformed(ActionEvent e) {

	}
	private void jTextField1_actionPerformed(ActionEvent e) {
	}

	private void jRadioButton3_actionPerformed(ActionEvent e) {

	}

	private void jPasswordField1_actionPerformed(ActionEvent e) {
	}


	private void jRadioButton1_actionPerformed(ActionEvent e) {
	}

	private void jRadioButton2_actionPerformed(ActionEvent e) {

	}
	private void jButton2_actionPerformed(ActionEvent e) {
		setVisible(false);
		ForgotPassword frame3= new  ForgotPassword();


	}
	private void signin_actionPerformed(ActionEvent e) {
		String type;
		if((!jtxtlogin.getText().equals(""))&&(!jpwdfield.getText().equals(""))){
			String userName=jtxtlogin.getText();
			String password=jpwdfield.getText();
			if(jradiobtn1.isSelected()){
				type=jradiobtn1.getText();
			}
			else if(jradiobtn2.isSelected()){
				type=jradiobtn2.getText();
			}
			else {
				type=jradiobtn3.getText();
			}
			//creating a bean class object 
			LoginBean lb=new LoginBean();
			lb.setPassword(password);
			lb.setType(type);
			lb.setUserName(userName);
			SwingFacade sf=new SwingFacade();
			int status=sf.catchLogin(lb);
			if(status==1){
				JOptionPane.showMessageDialog(null,"SORRY!!!! \n Login id does not exist"  ,"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			if(status==3){
				JOptionPane.showMessageDialog(null,"SORRY!!!! \n Password Invalid"  ,"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			if(status==2){
				System.out.println("hi!!!!"+userName+" Welcome to the pizza Corner ");
			this.setVisible(false);
			HomeOrder order= new HomeOrder();
			order.setLabel("hi!!!!  "+userName+"  Welcome to the pizza Corner ");
			order.setVisible(true);
			}
		}
	}

	private void homeButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Home h1= new Home();
		h1.setVisible(true);
	}

	private void menuButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		 Menu menu= new Menu();
		menu.setVisible(true);
	}

	private void locationButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		 Location location= new Location();
		location.setVisible(true);
	}

	private void aboutusButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		// AboutUS aboutus= new AboutUS();
		//aboutus.setVisible(true);
	}

	private void contactButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		  Contact contact= new  Contact();
		contact.setVisible(true);
	}

	private void feedbackButton_actionPerformed(ActionEvent e) {
	}

	private void registerButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Registration registration= new Registration();
		registration.setVisible(true);
	}
}
