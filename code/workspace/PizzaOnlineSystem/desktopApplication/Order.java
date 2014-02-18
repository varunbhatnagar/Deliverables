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

public class Order extends JFrame {
    private JPanel welcomeNote = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JPanel orderPanel= new JPanel();
    
    
    private JButton homeButton = new JButton();
    private JButton menuButton = new JButton();
    private JButton contactButton = new JButton();
    private JButton locationButton = new JButton();
    private JButton orderButton = new JButton();
    private JButton feedbackButton = new JButton();
    private JButton aboutusButton = new JButton();
    private JButton logoutButton = new JButton();
    private GridLayout gridLayout1 = new GridLayout();
    
    
    private ImageIcon welcomeImg=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/welcome.jpg");
    private ImageIcon pizzaImg1=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg1.jpg");
    private ImageIcon pizzaImg2=new ImageIcon("C:/Documents and Settings/LEARNING/Desktop/pizzaImg2.jpg");
    private JLabel welcomeLabel = new JLabel(welcomeImg);
    
    
    // JFrame confirmFrame;
    //JPanel c1 ;
    //Panel1 order;
    
    
    private JCheckBox pizza1_jCheckBox = new JCheckBox();
    private JCheckBox pizza2_jCheckBox = new JCheckBox();
    private JCheckBox pizza3_jCheckBox = new JCheckBox();
    private JCheckBox pizza4_jCheckBox = new JCheckBox();
    private JCheckBox pizza5_jCheckBox = new JCheckBox();
    private JCheckBox pizza6_jCheckBox = new JCheckBox();
    private JCheckBox pizza7_jCheckBox = new JCheckBox();
    private JCheckBox pizza8_jCheckBox = new JCheckBox();
    private JCheckBox pizza9_jCheckBox = new JCheckBox();
    private JCheckBox pizza10_jCheckBox = new JCheckBox();
    private JCheckBox pizza11_jCheckBox = new JCheckBox();
    private JCheckBox pizza12_jCheckBox = new JCheckBox();
    private JCheckBox pizza13_jCheckBox = new JCheckBox();
    private JCheckBox pizza14_jCheckBox = new JCheckBox();
    private JCheckBox pizza15_jCheckBox = new JCheckBox();
    
    
    private JTextField pizza1_jTextField = new JTextField(null);
    private JTextField pizza2_jTextField = new JTextField(null);
    private JTextField pizza3_jTextField = new JTextField(null);
    private JTextField pizza4_jTextField = new JTextField(null);
    private JTextField pizza5_jTextField = new JTextField(null);
    private JTextField pizza6_jTextField = new JTextField(null);
    private JTextField pizza7_jTextField = new JTextField(null);
    private JTextField pizza8_jTextField = new JTextField(null);
    private JTextField pizza9_jTextField = new JTextField(null);
    private JTextField pizza10_jTextField = new JTextField(null);
    private JTextField pizza11_jTextField = new JTextField(null);
    private JTextField pizza12_jTextField = new JTextField(null);
    private JTextField pizza13_jTextField = new JTextField(null);
    private JTextField pizza14_jTextField = new JTextField(null);
    private JTextField pizza15_jTextField = new JTextField(null);
    
    
    private JLabel pizza1_jLabel = new JLabel();
    private JLabel pizza2_jLabel = new JLabel();
    private JLabel pizza3_jLabel = new JLabel();
    private JLabel pizza4_jLabel = new JLabel();
    private JLabel pizza5_jLabel = new JLabel();
    private JLabel pizza6_jLabel = new JLabel();
    private JLabel pizza7_jLabel = new JLabel();
    private JLabel pizza8_jLabel = new JLabel();
    private JLabel pizza9_jLabel = new JLabel();
    private JLabel pizza10_jLabel = new JLabel();
    private JLabel pizza11_jLabel = new JLabel();
    private JLabel pizza12_jLabel = new JLabel();
    private JLabel pizza13_jLabel = new JLabel();
    private JLabel pizza14_jLabel = new JLabel();
    private JLabel pizza15_jLabel = new JLabel();
   
    private JButton reset = new JButton();
    private JButton confirm = new JButton();
    
    
    private JLabel total = new JLabel();
    private JTextField totalField = new JTextField(null);
    
    
    // private ButtonGroup bG1=new ButtonGroup();
    // private JLabel jLabel1 = new JLabel();
    // private JButton jButton1 = new JButton();
    // private JButton goBack = new JButton();
    // private JRadioButton jRadioButton1 = new JRadioButton();
    // private JRadioButton jRadioButton2 = new JRadioButton();
    // private JTextArea jTextArea1 = new JTextArea();
    // private JLabel jLabel2 = new JLabel();
    // private JTextField pizza5_jTextField1 = new JTextField(null);
    
    
    private Label vegLabel = new Label();
    private Label nonVegPizzaLabel = new Label(); 
    private Label quantityLabel = new Label();
    private int totalQuantity=0;


    public Order() {  
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
        welcomeLabel.setBounds(new Rectangle(5, 10, 995, 150));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Tahoma", 1, 75));
        welcomeLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        // homeContent.setLineWrap(true);
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
                       
        locationButton.setText("LOCATIONS");
        locationButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        locationButton_actionPerformed(e);
                    }
                });
                       
        aboutusButton.setText("ABOUT US");
        aboutusButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        aboutusButton_actionPerformed(e);
                    }
                });
                      
        contactButton.setText("CONTACT");
        contactButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        contactButton_actionPerformed(e);
                    }
                });
                
        orderButton.setText("ORDER");
        orderButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        orderButton_actionPerformed(e);
                    }
                });
                
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        logoutButton_actionPerformed(e);
                    }
                });
                
        feedbackButton.setText("FEEDBACK");
        feedbackButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        feedbackButton_actionPerformed(e);
                    }
                });
                     
        orderPanel.setLayout( null );
        pizza1_jCheckBox.setBounds(new Rectangle(75, 20, 20, 20));
        //pizza1_jCheckBox.setToolTipText("Tick if you select this pizza");
        pizza1_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza1_jCheckBox_actionPerformed(e);
                }
        });
        pizza2_jCheckBox.setBounds(new Rectangle(75, 50, 20, 20));
        pizza2_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza2_jCheckBox_actionPerformed(e);
                }
        });
        pizza3_jCheckBox.setBounds(new Rectangle(75, 80, 20, 20));
        pizza3_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza3_jCheckBox_actionPerformed(e);
                }
        }); 
        pizza4_jCheckBox.setBounds(new Rectangle(75, 110, 20, 20));
        pizza4_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza4_jCheckBox_actionPerformed(e);
                }
        });
        pizza5_jCheckBox.setBounds(new Rectangle(75, 140, 20, 20));
        pizza5_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza5_jCheckBox_actionPerformed(e);
                }
        });
        pizza6_jCheckBox.setBounds(new Rectangle(75, 170, 20, 20));
        pizza6_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza6_jCheckBox_actionPerformed(e);
                }
        });
        pizza7_jCheckBox.setBounds(new Rectangle(75, 200, 20, 20));
        pizza7_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza7_jCheckBox_actionPerformed(e);
                }
        });
        pizza8_jCheckBox.setBounds(new Rectangle(75, 230, 20, 20));
        pizza8_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                       pizza8_jCheckBox_actionPerformed(e);
                }
        });
        pizza9_jCheckBox.setBounds(new Rectangle(75, 260, 20, 20));
        pizza9_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza9_jCheckBox_actionPerformed(e);
                }
        });
        pizza10_jCheckBox.setBounds(new Rectangle(75, 305, 20, 20));
        pizza10_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                       pizza10_jCheckBox_actionPerformed(e);
                }
        });
        pizza11_jCheckBox.setBounds(new Rectangle(75, 335, 20, 20));
        pizza11_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                       pizza11_jCheckBox_actionPerformed(e);
                }
        });
        pizza12_jCheckBox.setBounds(new Rectangle(75, 360, 20, 20));
        pizza12_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                       pizza12_jCheckBox_actionPerformed(e);
                }
        });
        pizza13_jCheckBox.setBounds(new Rectangle(75, 385, 20, 20));
        pizza13_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza13_jCheckBox_actionPerformed(e);
                }
        });
        pizza14_jCheckBox.setBounds(new Rectangle(75, 415, 20, 20));
        pizza14_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                        pizza14_jCheckBox_actionPerformed(e);
                }
        });
        pizza15_jCheckBox.setBounds(new Rectangle(75, 445, 20, 20));
        pizza15_jCheckBox.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e) {
                       pizza15_jCheckBox_actionPerformed(e);
                }
        });
        
        
        pizza1_jTextField.setBounds(new Rectangle(360, 20, 55, 20));
        pizza1_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza1_jTextField_keyReleased(e);
                }
        });
        pizza2_jTextField.setBounds(new Rectangle(360, 50, 55, 20));
        pizza2_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza2_jTextField_keyReleased(e);
                }
        });
        pizza3_jTextField.setBounds(new Rectangle(360, 80, 55, 20));
        pizza3_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza3_jTextField_keyReleased(e);
                }
        });
        pizza4_jTextField.setBounds(new Rectangle(360, 110, 55, 20));
        pizza4_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza4_jTextField_keyReleased(e);
                }
        });
        pizza5_jTextField.setBounds(new Rectangle(360, 140, 55, 20));
        pizza5_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza5_jTextField_keyReleased(e);
                }
        });
        pizza6_jTextField.setBounds(new Rectangle(360, 170, 55, 20));
        pizza6_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza6_jTextField_keyReleased(e);
                }
        });
        pizza7_jTextField.setBounds(new Rectangle(360, 200, 55, 20));
        pizza7_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza7_jTextField_keyReleased(e);
                }
        });
        pizza8_jTextField.setBounds(new Rectangle(360, 230, 55, 20));
        pizza8_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza8_jTextField_keyReleased(e);
                }
        });
        pizza9_jTextField.setBounds(new Rectangle(360, 260, 55, 20));
        pizza9_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                       pizza9_jTextField_keyReleased(e);
                }
        });
        pizza10_jTextField.setBounds(new Rectangle(360, 305, 55, 20));
        pizza10_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza10_jTextField_keyReleased(e);
                }
        });
        pizza11_jTextField.setBounds(new Rectangle(360, 335, 55, 20));
        pizza11_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza11_jTextField_keyReleased(e);
                }
        });
        pizza12_jTextField.setBounds(new Rectangle(360, 365, 55, 20));
        pizza12_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                       pizza12_jTextField_keyReleased(e);
                }
        });
        pizza13_jTextField.setBounds(new Rectangle(360, 395, 55, 20));
        pizza13_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza13_jTextField_keyReleased(e);
                }
        });
        pizza14_jTextField.setBounds(new Rectangle(360, 420, 55, 20));
        pizza14_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                        pizza14_jTextField_keyReleased(e);
                }
        });
        pizza15_jTextField.setBounds(new Rectangle(360, 445, 55, 20));
        pizza15_jTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                       pizza15_jTextField_keyReleased(e);
                }
        });
        
        
        pizza1_jLabel.setText("MARGHERITA Large Capcicum Price-200");
        pizza1_jLabel.setBounds(new Rectangle(100, 20, 240, 20));
        pizza1_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza2_jLabel.setText("MARGHERITA Medium Capsicum Price-150");
        pizza2_jLabel.setBounds(new Rectangle(100, 50, 245, 20));
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
        pizza6_jLabel.setText("SUPREME Small Capsicum Price-100");
        pizza6_jLabel.setBounds(new Rectangle(100, 170, 200, 20));
        pizza6_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza7_jLabel.setText("SCHEZWAN Large Garlic Price-200");
        pizza7_jLabel.setBounds(new Rectangle(100, 200, 230, 20));
        pizza7_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza8_jLabel.setText("SCHEZWAN Medium Garlic Price-150");
        pizza8_jLabel.setBounds(new Rectangle(100, 230, 225, 20));
        pizza8_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza9_jLabel.setText("SCHEZWAN Small Garlic Price-100");
        pizza9_jLabel.setBounds(new Rectangle(100, 260, 200, 20));
        pizza9_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza10_jLabel.setText("MAXICANA Large Egg Price-300");
        pizza10_jLabel.setBounds(new Rectangle(100, 305, 200, 20));
        pizza10_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza11_jLabel.setText("MAXICANA Medium Egg Price-250");
        pizza11_jLabel.setBounds(new Rectangle(100, 335, 200, 20));
        pizza11_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza12_jLabel.setText("MAXICANA Small Egg Price-200");
        pizza12_jLabel.setBounds(new Rectangle(100, 365, 200, 20));
        pizza12_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza13_jLabel.setText("PEPERONI Large Mushroom Price -300");
        pizza13_jLabel.setBounds(new Rectangle(100, 390, 230, 20));
        pizza13_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza14_jLabel.setText("PEPERONI Medium Mushroom Price -250");
        pizza14_jLabel.setBounds(new Rectangle(100, 415, 230, 20));
        pizza14_jLabel.setFont(new Font("Tahoma", 1, 11));
        pizza15_jLabel.setText("PEPERONI Small Mushroom Price -200");
        pizza15_jLabel.setBounds(new Rectangle(100, 445, 230, 20));
        pizza15_jLabel.setFont(new Font("Tahoma", 1, 11));
        
        
        reset.setText("RESET");
        reset.setBounds(new Rectangle(30, 480, 85, 20));
        reset.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        reset_actionPerformed(e);
                }
        });
        
        confirm.setText("CONFIRM");
        confirm.setBounds(new Rectangle(150, 480, 100, 20));
        confirm.setToolTipText("null");
        confirm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        confirm_actionPerformed(e);
                }
        });
        
        total.setText("Total");
        total.setBounds(new Rectangle(280, 480, 45, 25));
        
        totalField.setBounds(new Rectangle(360, 480, 70, 20));
        totalField.setToolTipText("Total Amount To Be paid");

        totalField.setEditable(false);
        totalField.setBackground(new Color(128, 156, 245));
        vegLabel.setText("VEG PIZZAS");
        vegLabel.setBounds(new Rectangle(410, 195, 135, 30));
        vegLabel.setAlignment(1);
        vegLabel.setFont(new Font("Tahoma", 1, 12));
        vegLabel.setBackground(new Color(0, 214, 0));
        
        nonVegPizzaLabel.setText("NON-VEG PIZZAS");
        nonVegPizzaLabel.setBounds(new Rectangle(160, 280, 135, 30));
        nonVegPizzaLabel.setAlignment(1);
        nonVegPizzaLabel.setFont(new Font("Tahoma", 1, 12));
        nonVegPizzaLabel.setBackground(new Color(148, 0, 0));
    
        quantityLabel.setText("QTY");
        quantityLabel.setBounds(new Rectangle(605, 205, 55, 20));
        quantityLabel.setAlignment(1);
        quantityLabel.setFont(new Font("Tahoma", 1, 11));
        
        
        orderPanel.setBounds(new Rectangle(245, 215, 490, 525));
        orderPanel.add(pizza6_jTextField, null);
        orderPanel.add(pizza15_jTextField, null);
        orderPanel.add(pizza14_jTextField, null);
        orderPanel.add(pizza13_jTextField, null);
        orderPanel.add(pizza12_jTextField, null);
        orderPanel.add(pizza11_jTextField, null);
        orderPanel.add(pizza10_jTextField, null);
        orderPanel.add(pizza9_jTextField, null);
        orderPanel.add(pizza8_jTextField, null);
        orderPanel.add(pizza7_jTextField, null);
        orderPanel.add(pizza15_jCheckBox, null);
        orderPanel.add(pizza14_jCheckBox, null);
        orderPanel.add(pizza13_jCheckBox, null);
        orderPanel.add(pizza12_jCheckBox, null);
        orderPanel.add(pizza11_jCheckBox, null);
        orderPanel.add(pizza10_jCheckBox, null);
        orderPanel.add(pizza15_jLabel, null);
        orderPanel.add(pizza14_jLabel, null);
        orderPanel.add(pizza13_jLabel, null);
        orderPanel.add(pizza12_jLabel, null);
        orderPanel.add(pizza11_jLabel, null);
        orderPanel.add(pizza10_jLabel, null);
        orderPanel.add(pizza9_jCheckBox, null);
        orderPanel.add(pizza8_jCheckBox, null);
        orderPanel.add(pizza7_jCheckBox, null);
        orderPanel.add(pizza9_jLabel, null);
        orderPanel.add(pizza8_jLabel, null);
        orderPanel.add(pizza7_jLabel, null);
        orderPanel.add(pizza6_jLabel, null);
       // orderPanel.add(pizza5_jTextField1, null);
        orderPanel.add(pizza6_jCheckBox, null);
        orderPanel.add(pizza5_jTextField, null);
        orderPanel.add(pizza4_jTextField, null);
        orderPanel.add(totalField, null);
        orderPanel.add(total, null);
        orderPanel.add(confirm, null);
        orderPanel.add(reset, null);
        orderPanel.add(pizza5_jLabel, null);
        orderPanel.add(pizza5_jCheckBox, null);
        orderPanel.add(pizza4_jLabel, null);
        orderPanel.add(pizza4_jCheckBox, null);
        orderPanel.add(pizza3_jLabel, null);
        orderPanel.add(pizza3_jTextField, null);
        orderPanel.add(pizza3_jCheckBox, null);
        orderPanel.add(pizza2_jLabel, null);
        orderPanel.add(pizza2_jTextField, null);
        orderPanel.add(pizza2_jCheckBox, null);
        orderPanel.add(pizza1_jLabel, null);
        orderPanel.add(pizza1_jTextField, null);
        orderPanel.add(pizza1_jCheckBox, null);
        orderPanel.add(nonVegPizzaLabel, null);
        
        welcomeNote.add(welcomeLabel, null);
        
        buttonPanel.add(homeButton, null);
        buttonPanel.add(menuButton, null);
        buttonPanel.add(locationButton, null);
        buttonPanel.add(aboutusButton, null);
        buttonPanel.add(contactButton, null);
        buttonPanel.add(orderButton, null);
        buttonPanel.add(logoutButton, null);
        buttonPanel.add(feedbackButton, null);
        
        this.getContentPane().add(quantityLabel, null);
        this.getContentPane().add(vegLabel, null);
        this.getContentPane().add(buttonPanel, null);
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
        /*this.setVisible(false);
            Order order= new Order();
            order.setVisible(true);*/
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
    private void aboutusButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        LoginMenu loginmenu= new LoginMenu();
        loginmenu.setVisible(true);
    }
    private void locationButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        LoginMenu loginmenu= new LoginMenu();
        loginmenu.setVisible(true);
    }
    private void contactButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        LoginMenu loginmenu= new LoginMenu();
        loginmenu.setVisible(true);
    }
    private void feedbackButton_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        LoginMenu loginmenu= new LoginMenu();
        loginmenu.setVisible(true);
    }
    
    private void confirm_actionPerformed(ActionEvent e) {
    	//creating a order StingBuffer
          
            StringBuffer orderString=new StringBuffer();
            if(pizza1_jCheckBox.isSelected()){
            	orderString.append(pizza1_jLabel.getText()+"("+pizza1_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza1_jTextField.getText());
            }
            if(pizza2_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza2_jLabel.getText()+"("+pizza2_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza2_jTextField.getText());
            }
            if(pizza3_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza3_jLabel.getText()+"("+pizza3_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza3_jTextField.getText());
            }
            	
            if(pizza4_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza4_jLabel.getText()+"("+pizza4_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza4_jTextField.getText());
            }
            if(pizza5_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza5_jLabel.getText()+"("+pizza5_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza5_jTextField.getText());
            	}
            	
            if(pizza6_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza6_jLabel.getText()+"("+pizza6_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza6_jTextField.getText());
            }
            if(pizza7_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza7_jLabel.getText()+"("+pizza7_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza7_jTextField.getText());
            }
            if(pizza8_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza8_jLabel.getText()+"("+pizza8_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza8_jTextField.getText());
            }
            if(pizza9_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza9_jLabel.getText()+"("+pizza9_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza9_jTextField.getText());
            }
            if(pizza10_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza10_jLabel.getText()+"("+pizza10_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza10_jTextField.getText());
            }
            if(pizza11_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza11_jLabel.getText()+"("+pizza11_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza11_jTextField.getText());
            }
            if(pizza12_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza12_jLabel.getText()+"("+pizza12_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza12_jTextField.getText());
            }
            if(pizza13_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza13_jLabel.getText()+"("+pizza13_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza13_jTextField.getText());
            }
            if(pizza14_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza14_jLabel.getText()+"("+pizza14_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza14_jTextField.getText());
            }
            if(pizza15_jCheckBox.isSelected()){
            	orderString.append("\n"+pizza15_jLabel.getText()+"("+pizza15_jTextField.getText()+")");
            	totalQuantity+=Integer.parseInt(pizza15_jTextField.getText());
            }
            System.out.println(orderString);
            this.setVisible(false);
            Confirm confirm= new Confirm();
            confirm.setOrder(orderString.toString(),totalField.getText(),totalQuantity,this);
            confirm.setVisible(true);
            
            }

    private void reset_actionPerformed(ActionEvent e) {
            pizza1_jTextField.setText(null);
            pizza2_jTextField.setText(null);
            pizza3_jTextField.setText(null);
            totalField.setText(null);
            pizza4_jTextField.setText(null);
            pizza5_jTextField.setText(null);
            pizza1_jCheckBox.setSelected(false);
            pizza2_jCheckBox.setSelected(false);
            pizza3_jCheckBox.setSelected(false);
            pizza4_jCheckBox.setSelected(false);
            pizza5_jCheckBox.setSelected(false);
    }





    private void pizza1_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza1_jCheckBox.isSelected()){
                    String Stotal=pizza1_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza1_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza1_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza1_jCheckBox.isSelected()) {

                    if(pizza1_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza1_jTextField.getText());
                            pizza1_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*200);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza1_jCheckBox.isSelected()){
                    String Stotal=pizza1_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza1_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }

    private void pizza2_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza2_jCheckBox.isSelected()){

                    String Stotal=pizza2_jTextField.getText();
                    if(Stotal.equals(null)){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza2_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza2_jCheckBox_actionPerformed(ActionEvent e) {
            int total=0;
            int value=0;
            if(!pizza2_jCheckBox.isSelected()) {
                    //      String Stotal=pizza2_jTextField.getText();
                    if(pizza2_jTextField.getText().equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza2_jTextField.getText());
                            pizza2_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch2  "+total);
                            total=total-(value*150);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza2_jCheckBox.isSelected()){

                    String Stotal=pizza2_jTextField.getText();
                    if(Stotal.equals(null)){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza2_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza3_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza3_jCheckBox.isSelected()){
                    String Stotal=pizza3_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza3_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza3_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza3_jCheckBox.isSelected()) {

                    if(pizza3_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza3_jTextField.getText());
                            pizza3_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*100);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza3_jCheckBox.isSelected()){
                    String Stotal=pizza3_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza3_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza4_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza4_jCheckBox.isSelected()){
                    String Stotal=pizza4_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza4_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza4_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza4_jCheckBox.isSelected()) {

                    if(pizza4_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza4_jTextField.getText());
                            pizza4_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*200);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza4_jCheckBox.isSelected()){
                    String Stotal=pizza4_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza4_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza5_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza5_jCheckBox.isSelected()){
                    String Stotal=pizza5_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza5_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza5_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza5_jCheckBox.isSelected()) {

                    if(pizza5_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza5_jTextField.getText());
                            pizza5_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*150);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza5_jCheckBox.isSelected()){
                    String Stotal=pizza5_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza5_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza6_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza6_jCheckBox.isSelected()){
                    String Stotal=pizza6_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza6_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza6_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza6_jCheckBox.isSelected()) {

                    if(pizza6_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza6_jTextField.getText());
                            pizza6_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*100);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza6_jCheckBox.isSelected()){
                    String Stotal=pizza6_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza6_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza7_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza7_jCheckBox.isSelected()){
                    String Stotal=pizza7_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza7_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza7_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza7_jCheckBox.isSelected()) {

                    if(pizza7_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza7_jTextField.getText());
                            pizza7_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*200);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza7_jCheckBox.isSelected()){
                    String Stotal=pizza7_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza7_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza8_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza8_jCheckBox.isSelected()){
                    String Stotal=pizza8_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza8_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza8_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza8_jCheckBox.isSelected()) {

                    if(pizza8_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza8_jTextField.getText());
                            pizza8_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*150);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza8_jCheckBox.isSelected()){
                    String Stotal=pizza8_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza8_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(150*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza9_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza9_jCheckBox.isSelected()){
                    String Stotal=pizza9_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza9_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza9_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza9_jCheckBox.isSelected()) {

                    if(pizza9_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza9_jTextField.getText());
                            pizza9_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*100);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza9_jCheckBox.isSelected()){
                    String Stotal=pizza9_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza9_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(100*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza10_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza10_jCheckBox.isSelected()){
                    String Stotal=pizza10_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza10_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(300*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza10_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza10_jCheckBox.isSelected()) {

                    if(pizza10_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza10_jTextField.getText());
                            pizza10_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*300);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza10_jCheckBox.isSelected()){
                    String Stotal=pizza10_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza10_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(300*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza11_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza11_jCheckBox.isSelected()){
                    String Stotal=pizza11_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza11_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(250*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza11_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza11_jCheckBox.isSelected()) {

                    if(pizza11_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza11_jTextField.getText());
                            pizza11_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*250);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza11_jCheckBox.isSelected()){
                    String Stotal=pizza11_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza11_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(250*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza12_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza12_jCheckBox.isSelected()){
                    String Stotal=pizza12_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza12_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza12_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza12_jCheckBox.isSelected()) {

                    if(pizza12_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza12_jTextField.getText());
                            pizza12_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*200);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza12_jCheckBox.isSelected()){
                    String Stotal=pizza12_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza12_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza13_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza13_jCheckBox.isSelected()){
                    String Stotal=pizza13_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza13_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(300*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza13_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza13_jCheckBox.isSelected()) {

                    if(pizza13_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza13_jTextField.getText());
                            pizza13_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*300);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza13_jCheckBox.isSelected()){
                    String Stotal=pizza13_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza13_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(300*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza14_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza14_jCheckBox.isSelected()){
                    String Stotal=pizza14_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza14_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(250*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza14_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza14_jCheckBox.isSelected()) {

                    if(pizza14_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza14_jTextField.getText());
                            pizza14_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*250);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza14_jCheckBox.isSelected()){
                    String Stotal=pizza14_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza14_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(250*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
    private void pizza15_jTextField_keyReleased(KeyEvent e) {
            //System.out.println("keyreleased");
            int total=0;
            int value=0;
            if(pizza15_jCheckBox.isSelected()){
                    String Stotal=pizza15_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza15_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }
    }
    private void pizza15_jCheckBox_actionPerformed(ActionEvent e){
            int total=0;
            int value=0;
            System.out.println("clicked");
            if(!pizza15_jCheckBox.isSelected()) {

                    if(pizza15_jTextField.getText().equals("")){
                            System.out.println("hi");
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza15_jTextField.getText());
                            pizza15_jTextField.setText("");
                            total=Integer.parseInt(totalField.getText());
                            System.out.println("in ch1  "+total);
                            total=total-(value*200);
                            totalField.setText(Integer.toString(total));
                    }

            }
            else if(pizza15_jCheckBox.isSelected()){
                    String Stotal=pizza15_jTextField.getText();
                    if(Stotal.equals("")){
                            value=0;  
                    }
                    else{
                            value=Integer.parseInt(pizza15_jTextField.getText());
                            if(!totalField.getText().equals("")){
                                    total=Integer.parseInt(totalField.getText());}
                            total=total+(200*value);
                            totalField.setText(Integer.toString(total));
                    }
            }

    }
}
