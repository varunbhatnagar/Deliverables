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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import catchBean.Customer;
import facade.SwingFacade;

public class Registration extends JFrame {
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
    private JLabel welcomeImgLabel = new JLabel(welcomeImg);
    private JPanel jRoot = new JPanel();
    private JPanel jPanel3 = new JPanel();
        private JLabel jLabel1 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
        private JTextField jTextField1 = new JTextField();
        private JButton jButton1 = new JButton();
        private JPasswordField jPasswordField1 = new JPasswordField();
        private JLabel jLabel5 = new JLabel();
        private JPasswordField jPasswordField2 = new JPasswordField();
        private JLabel jLabel6 = new JLabel();
        private JRadioButton jRadioButton1 = new JRadioButton();
        private JRadioButton jRadioButton2 = new JRadioButton();
    private JLabel jLabel8 = new JLabel();
        private JTextField jTextField2 = new JTextField();
        private JLabel jLabel9 = new JLabel();
        private JTextField jTextField3 = new JTextField();
        private JLabel jLabel10 = new JLabel();
        private JTextField jTextField4 = new JTextField();
        private JLabel jLabel11 = new JLabel();
        private JTextField jTextField5 = new JTextField();
        private JLabel jLabel12 = new JLabel();
    private JList jList2 = new JList();
        private JButton jButton2 = new JButton();
        private JButton jButton3 = new JButton();
        private JButton submitButton = new JButton();
    private ButtonGroup bg=new ButtonGroup();
    private JTextField jTextField6 = new JTextField();
    private JLabel jLabel13 = new JLabel();
    private JTextField jTextField7 = new JTextField();
    private JLabel jLabel14 = new JLabel();
    private JTextField jTextField8 = new JTextField();
    //private JScrollPane register = new JScrollPane(jRoot);

    public Registration() {  
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(1024, 768));
        jRoot.setLayout( null );
                jRoot.setSize(new Dimension(1024, 760));
                jRoot.setBackground(Color.pink);
                //jRoot.setTitle("Registration form");
                jRoot.setVisible(true);
                //jRoot.setResizable(false);
                jRoot.setFont(new Font("Dialog", 1, 12));
                jRoot.setForeground(new Color(255, 165, 165));
                jRoot.setBackground(Color.white);
                jRoot.setBounds(new Rectangle(10, 10, 1024, 760));
                jPanel3.setBounds(new Rectangle(100, 180, 815, 550));
                jPanel3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jPanel3.setLayout(null);
                jPanel3.setBackground(Color.white);
                jPanel3.setAutoscrolls(true);
                jLabel1.setText("Registration form");
                jLabel1.setBounds(new Rectangle(5, 5, 215, 30));
                jLabel1.setFont(new Font("Verdana", 0, 24));
                jLabel1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jLabel3.setText("User Id :");
                jLabel3.setBounds(new Rectangle(10, 75, 140, 25));
                jLabel3.setFont(new Font("Tahoma", 1, 12));
                jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel4.setText("Password :");
                jLabel4.setBounds(new Rectangle(10, 125, 140, 25));
                jLabel4.setFont(new Font("Tahoma", 1, 12));
                jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField1.setBounds(new Rectangle(185, 70, 260, 25));
                jButton1.setText("Check Availability");
                jButton1.setBounds(new Rectangle(465, 70, 115, 20));
                jButton1.setFont(new Font("Tahoma", 0, 10));
                jPasswordField1.setBounds(new Rectangle(185, 115, 260, 25));
                jLabel5.setText("Confirm Password :");
                jLabel5.setBounds(new Rectangle(20, 170, 135, 25));
                jLabel5.setFont(new Font("Tahoma", 1, 12));
                jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
                jPasswordField2.setBounds(new Rectangle(185, 160, 260, 25));
                jLabel6.setText("Type of User :");
                jLabel6.setBounds(new Rectangle(20, 205, 135, 25));
                jLabel6.setFont(new Font("Tahoma", 1, 12));
                jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
                jRadioButton1.setText("Regular User");
                jRadioButton1.setBounds(new Rectangle(185, 205, 115, 25));
                jRadioButton1.setBackground(Color.white);
                jRadioButton2.setText("Corporate");
                jRadioButton2.setBounds(new Rectangle(315, 205, 115, 25));
                jRadioButton2.setBackground(Color.white);
        bg.add(jRadioButton1);
                bg.add(jRadioButton2);
        jLabel8.setText("Name :");
                jLabel8.setBounds(new Rectangle(10, 240, 140, 25));
                jLabel8.setFont(new Font("Tahoma", 1, 12));
                jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField2.setBounds(new Rectangle(185, 235, 265, 25));
                jLabel9.setText("Ph/mobile no :");
                jLabel9.setBounds(new Rectangle(20, 280, 135, 25));
                jLabel9.setFont(new Font("Tahoma", 1, 12));
                jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField3.setBounds(new Rectangle(185, 275, 265, 25));
                jLabel10.setText("Address Line 1 :");
                jLabel10.setBounds(new Rectangle(20, 315, 125, 25));
                jLabel10.setFont(new Font("Tahoma", 1, 12));
                jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField4.setBounds(new Rectangle(185, 315, 265, 25));
                jLabel11.setText("Address Line 2 :");
                jLabel11.setBounds(new Rectangle(20, 355, 125, 25));
                jLabel11.setFont(new Font("Tahoma", 1, 12));
                jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField5.setBounds(new Rectangle(185, 355, 265, 25));
                jLabel12.setText("City :");
                jLabel12.setBounds(new Rectangle(30, 395, 115, 30));
                jLabel12.setFont(new Font("Tahoma", 1, 12));
                jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jList2.setBounds(new Rectangle(330, 515, 0, 0));
                jButton2.setText("BACK");
                jButton2.setBounds(new Rectangle(385, 520, 120, 30));
                jButton2.setFont(new Font("Tahoma", 1, 12));
                jButton3.setText("RESET");
                /*homeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        homeButton_actionPerformed(e);
                    }
                });*/
                jButton3.setBounds(new Rectangle(240, 520, 120, 30));
                jButton3.setFont(new Font("Tahoma", 1, 12));
                submitButton.setText("SUBMIT");
                submitButton.setBounds(new Rectangle(100, 520, 120, 30));
                submitButton.setFont(new Font("Tahoma", 1, 12));
                submitButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	submitButton_actionPerformed(e);
                    }
                });
        jTextField6.setBounds(new Rectangle(185, 395, 265, 25));
        jLabel13.setText("PIN code :");
        jLabel13.setBounds(new Rectangle(30, 435, 115, 30));
        jLabel13.setFont(new Font("Tahoma", 1, 12));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField7.setBounds(new Rectangle(185, 435, 265, 25));
        jLabel14.setText("State :");
        jLabel14.setBounds(new Rectangle(30, 480, 115, 30));
        jLabel14.setFont(new Font("Tahoma", 1, 12));
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField8.setBounds(new Rectangle(185, 475, 265, 25));
        jRoot.add(jPanel3, null);
        jPanel3.add(jTextField8, null);
        jPanel3.add(jLabel14, null);
        jPanel3.add(jTextField7, null);
        jPanel3.add(jLabel13, null);
        jPanel3.add(jTextField6, null);
        jPanel3.add(submitButton, null);
        jPanel3.add(jButton3, null);
        jPanel3.add(jButton2, null);
        jPanel3.add(jList2, null);
        jPanel3.add(jLabel12, null);
        jPanel3.add(jTextField5, null);
        jPanel3.add(jLabel11, null);
        jPanel3.add(jTextField4, null);
        jPanel3.add(jLabel10, null);
        jPanel3.add(jTextField3, null);
        jPanel3.add(jLabel9, null);
        jPanel3.add(jTextField2, null);
        jPanel3.add(jLabel8, null);
        jPanel3.add(jRadioButton2, null);
        jPanel3.add(jRadioButton1, null);
        jPanel3.add(jLabel6, null);
        jPanel3.add(jPasswordField2, null);
        jPanel3.add(jLabel5, null);
        jPanel3.add(jPasswordField1, null);
        //jPanel3.add(register,null);


        jPanel3.add(jButton1, null);
        jPanel3.add(jTextField1, null);
        jPanel3.add(jLabel4, null);
        jPanel3.add(jLabel3, null);
        jPanel3.add(jLabel1, null);
        welcomeNote.setBounds(new Rectangle(10, 10, 1000, 180));
        welcomeNote.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        welcomeNote.setLayout(null);
        welcomeNote.setBackground(new Color(255, 198, 132));
        welcomeImgLabel.setBounds(new Rectangle(5, 10, 995, 150));
        welcomeImgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeImgLabel.setFont(new Font("Tahoma", 1, 75));
        welcomeImgLabel.setHorizontalTextPosition(SwingConstants.CENTER);

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
        welcomeNote.add(welcomeImgLabel, null);
        buttonPanel.add(homeButton, null);
        buttonPanel.add(menuButton, null);
        buttonPanel.add(locationButton, null);
        buttonPanel.add(aboutusButton, null);
        buttonPanel.add(contactButton, null);
        buttonPanel.add(registerButton, null);
        buttonPanel.add(loginButton, null);
        buttonPanel.add(feedbackButton, null);
        this.getContentPane().add(buttonPanel, null);
        this.getContentPane().add(welcomeNote, null);
        this.getContentPane().add(jRoot, null);
        //this.setVisible(true);
        this.setTitle("HOME");
        this.setBackground(Color.white);
    }
    public static void main(String args[]) {
        Registration h1=new Registration();
        h1.setVisible(true);
    }

    private void menuButton_actionPerformed(ActionEvent e) {
    this.setVisible(false);
        Menu menu= new Menu();
        menu.setVisible(true);
    }

    private void registerButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
            Registration registration= new Registration();
            registration.setVisible(true);
    }
    private void homeButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        Home h1= new Home();
        h1.setVisible(true);
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

    private void aboutusButton_actionPerformed(ActionEvent e) {
        
        this.setVisible(false);
            AboutUs aboutus= new AboutUs();
            aboutus.setVisible(true);
        }

    private void loginButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
            Login login= new Login();
            login.setVisible(true);
        }
    private void submitButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        Customer customer=new Customer();
        customer.setName(jTextField2.getText());
		customer.setAddLine1(jTextField4.getText());
		customer.setAddLine2(jTextField5.getText());
		customer.setCity(jTextField6.getText());
		customer.setState(jTextField8.getText());
		customer.setPhNo(jTextField3.getText());
		customer.setPinCode(jTextField7.getText());
		customer.setPassword(jPasswordField1.getText());
		customer.setUserId(jTextField1.getText());
		if(jRadioButton1.isSelected()){
		customer.setType(jRadioButton1.getText());
		}
		else if(jRadioButton2.isSelected()){
		customer.setType(jRadioButton2.getText());
		}
		SwingFacade sf=new SwingFacade();
		int status=sf.catchCustomer(customer);   
        }

}
