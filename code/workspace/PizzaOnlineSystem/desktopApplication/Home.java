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
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Home extends JFrame {
    private JPanel welcomeNote = new JPanel();
    
    private JPanel jPanel1 = new JPanel();
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
    private JLabel homePic1 = new JLabel(pizzaImg1);
    private JLabel homePic2 = new JLabel(pizzaImg2);
    private JEditorPane aboutUsContent = new JEditorPane();

    public Home() {  
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
        homePic1.setBounds(new Rectangle(10, 205, 315, 110));
        homePic2.setText("label1");
        homePic2.setBounds(new Rectangle(705, 590, 300, 150));

        //homeContent.setLineWrap(true);
       // homeContent.a
        aboutUsContent.setBounds(new Rectangle(200, 345, 615, 225));
        aboutUsContent.setText("\t           ONLINE PIZZA ORDER SYSTEM\n\n\t\t TEAM 1\n\n\t AMIT SAXENA  \n\t LAKHAA\n\t RAHUL JAIN\n\t PRAVEEN KUMAR K  ");
        aboutUsContent.setEditable(false);
        aboutUsContent.setBorder(BorderFactory.createLineBorder(Color.black, 2));aboutUsContent.setFont(new Font("Tahoma", 1, 18));
        aboutUsContent.setBackground(new Color(255, 211, 157));
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
        jPanel1.add(homeButton, null);
        jPanel1.add(menuButton, null);
        jPanel1.add(locationButton, null);
        jPanel1.add(aboutusButton, null);
        jPanel1.add(contactButton, null);
        jPanel1.add(registerButton, null);
        jPanel1.add(loginButton, null);
        jPanel1.add(feedbackButton, null);
        this.getContentPane().add(aboutUsContent, null);
        this.getContentPane().add(homePic2, null);
        this.getContentPane().add(homePic1, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(welcomeNote, null);
        //this.setVisible(true);
        this.setTitle("HOME");
        this.setBackground(Color.white);
    }
    public static void main(String args[]) {
        Home h1=new Home();
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

	

}
