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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginMenu extends JFrame {
    private JPanel welcomeNote = new JPanel();
    
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
    
    
   // JFrame confirmFrame;
    private JPanel orderPanel= new JPanel();
    JPanel c1 ;
    //Panel1 order;
    private JLabel pizza1_jLabel = new JLabel();
    private JLabel pizza2_jLabel = new JLabel();
    private JLabel pizza3_jLabel = new JLabel();
    private JLabel pizza4_jLabel = new JLabel();
    private JLabel pizza5_jLabel = new JLabel();
    private ButtonGroup bG1=new ButtonGroup();
   // private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton goBack = new JButton();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JTextArea jTextArea1 = new JTextArea();
    private JLabel jLabel2 = new JLabel();
    private Label label1 = new Label();
    private JLabel pizza5_jLabel1 = new JLabel();
    private JLabel pizza5_jLabel2 = new JLabel();
    private JLabel pizza5_jLabel3 = new JLabel();
    private JLabel pizza5_jLabel4 = new JLabel();
    private Label label2 = new Label();
    private JLabel pizza5_jLabel5 = new JLabel();
    private JLabel pizza5_jLabel6 = new JLabel();
    private JLabel pizza5_jLabel7 = new JLabel();
    private JLabel pizza5_jLabel8 = new JLabel();
    private JLabel pizza5_jLabel9 = new JLabel();
    private JLabel pizza5_jLabel10 = new JLabel();


    public LoginMenu() {  
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
        jPanel1.setBounds(new Rectangle(15, 160, 995, 30));
        jPanel1.setLayout(gridLayout1);
        homeButton.setText("HOME");
        menuButton.setText("MENU");
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
                
                
                
        orderPanel.setLayout( null );


        pizza1_jLabel.setText("MARGHERITA Large Capcicum Price-200");
        pizza1_jLabel.setBounds(new Rectangle(100, 20, 240, 20));
        pizza1_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza2_jLabel.setText("MARGHERITA Medium Capsicum Price-150");
        pizza2_jLabel.setBounds(new Rectangle(100, 50, 245, 20));
        pizza2_jLabel.setToolTipText("null");
        pizza2_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza3_jLabel.setText("MARGHERITA Small Capsicum Price-100");
        pizza3_jLabel.setBounds(new Rectangle(100, 80, 245, 20));
        pizza3_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza4_jLabel.setText("SUPREME Large Cheese Price-200");
        pizza4_jLabel.setBounds(new Rectangle(100, 110, 230, 20));
        pizza4_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel.setText("SUPREME Medium Cheese Price-150");
        pizza5_jLabel.setBounds(new Rectangle(100, 140, 230, 20));
        pizza5_jLabel.setFont(new Font("Tahoma", 1, 11));
        label1.setText("VEG PIZZAS");
        label1.setBounds(new Rectangle(410, 195, 135, 30));
        label1.setAlignment(1);
        label1.setFont(new Font("Tahoma", 1, 12));
        pizza5_jLabel1.setText("SUPREME Small Capsicum Price-100");
        pizza5_jLabel1.setBounds(new Rectangle(100, 170, 200, 20));
        pizza5_jLabel1.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel2.setText("SCHEZWAN Large Garlic Price-200");
        pizza5_jLabel2.setBounds(new Rectangle(100, 200, 230, 20));
        pizza5_jLabel2.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel3.setText("SCHEZWAN Medium Garlic Price-150");
        pizza5_jLabel3.setBounds(new Rectangle(100, 230, 225, 20));
        pizza5_jLabel3.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel4.setText("SCHEZWAN Small Garlic Price-100");
        pizza5_jLabel4.setBounds(new Rectangle(100, 260, 200, 20));
        pizza5_jLabel4.setFont(new Font("Tahoma", 1, 11));
        label2.setText("NON-VEG PIZZAS");
        label2.setBounds(new Rectangle(160, 280, 135, 30));
        label2.setAlignment(1);
        label2.setFont(new Font("Tahoma", 1, 12));
        pizza5_jLabel5.setText("MAXICANA Large Egg Price-300");
        pizza5_jLabel5.setBounds(new Rectangle(100, 305, 200, 20));
        pizza5_jLabel5.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel6.setText("MAXICANA Medium Egg Price-250");
        pizza5_jLabel6.setBounds(new Rectangle(100, 335, 200, 20));
        pizza5_jLabel6.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel7.setText("MAXICANA Small Egg Price-200");
        pizza5_jLabel7.setBounds(new Rectangle(100, 365, 200, 20));
        pizza5_jLabel7.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel8.setText("PEPERONI Large Mushroom Price -300");
        pizza5_jLabel8.setBounds(new Rectangle(100, 390, 230, 20));
        pizza5_jLabel8.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel9.setText("PEPERONI Medium Mushroom Price -250");
        pizza5_jLabel9.setBounds(new Rectangle(100, 415, 230, 20));
        pizza5_jLabel9.setFont(new Font("Tahoma", 1, 11));
        pizza5_jLabel10.setText("PEPERONI Small Mushroom Price -200");
        pizza5_jLabel10.setBounds(new Rectangle(100, 445, 230, 20));
        pizza5_jLabel10.setFont(new Font("Tahoma", 1, 11));
        orderPanel.setBounds(new Rectangle(245, 215, 490, 525));
        orderPanel.add(pizza5_jLabel10, null);
        orderPanel.add(pizza5_jLabel9, null);
        orderPanel.add(pizza5_jLabel8, null);
        orderPanel.add(pizza5_jLabel7, null);
        orderPanel.add(pizza5_jLabel6, null);
        orderPanel.add(pizza5_jLabel5, null);
        orderPanel.add(pizza5_jLabel4, null);
        orderPanel.add(pizza5_jLabel3, null);
        orderPanel.add(pizza5_jLabel2, null);
        orderPanel.add(pizza5_jLabel1, null);
        orderPanel.add(pizza5_jLabel, null);
        orderPanel.add(pizza4_jLabel, null);
        orderPanel.add(pizza3_jLabel, null);
        orderPanel.add(pizza2_jLabel, null);
        orderPanel.add(pizza1_jLabel, null);


        orderPanel.add(label2, null);
        welcomeNote.add(jLabel1, null);
        jPanel1.add(homeButton, null);
        jPanel1.add(menuButton, null);
        jPanel1.add(locationButton, null);
        jPanel1.add(aboutusButton, null);
        jPanel1.add(contactButton, null);
        jPanel1.add(orderButton, null);
        jPanel1.add(logoutButton, null);
        jPanel1.add(feedbackButton, null);
        this.getContentPane().add(label1, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(welcomeNote, null);
        this.getContentPane().add(orderPanel, null);
        //this.setVisible(true);
        this.setTitle("ORDER");
        this.setBackground(Color.white);
    }
    public static void main(String args[]) {
        HomeOrder h1=new HomeOrder();
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
       
}
