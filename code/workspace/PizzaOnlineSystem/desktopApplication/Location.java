package desktopApplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Location extends JFrame {
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
     private JPanel locationPanel = new JPanel();
	    private JPanel pTitle= new JPanel();
		private JPanel pContents= new JPanel();
		private JPanel pContIndex= new JPanel();
		private JPanel pContDetail= new JPanel();
		private JList listLocation =new JList( new String[] {"Bangalore","Chennai","Delhi","KolKata","Mumbai"});
		private JLabel lLocationDetail = new JLabel("Outlet Details");
		private JTextArea taAddress[] = new JTextArea[10];
		private ListSelectionModel listSelectionModel;


    public Location() {  
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
        
                locationPanel.setLayout(null);
		locationPanel.setSize(new Dimension(1024, 760));
		for(int i=0;i<10;i++){
			taAddress[i]=new JTextArea("");
		}
		listLocation.setBounds(100,50,100,100);
		listLocation.setBackground( Color.darkGray);
		listLocation.setForeground(Color.white);
		listLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listLocation.addListSelectionListener(new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent e)  {   
                                Object src = e.getSource();
                                if(src instanceof JList) {
                                        JList ls = (JList) src;
                                        if(ls == listLocation) {                                        
                                                String selected = (String) listLocation.getSelectedValue();
                                                if(selected.equals("Bangalore")){       
                                                        taAddress[0].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Bangalore");
                                                        taAddress[0].setLineWrap(true);

                                                        taAddress[1].setText("Amarjyoti Colony, Domlur Village,"+
                                                                        "Koramangla Intermediate Ring Road"+
                                                        "Bangalore ");
                                                        taAddress[1].setLineWrap(true);


                                                        taAddress[2].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Bangalore");
                                                        taAddress[2].setLineWrap(true);

                                                        taAddress[3].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Bangalore");
                                                        taAddress[3].setLineWrap(true);

                                                        taAddress[4].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Bangalore");
                                                        taAddress[4].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        pContDetail.add(taAddress[1]);  
                                                        pContDetail.add(taAddress[2]);  
                                                        pContDetail.add(taAddress[3]);  

                                                }
                                                else if(listLocation.getSelectedIndex()==1){

                                                        taAddress[0].setText("#6,Sir Thiyagaraya Road"+
                                                                        "T Nagar (Opp Kasi Arcade)"+
                                                        "Chennai ");
                                                        taAddress[0].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[1].setText("87, Arcot Road,"+
                                                        "Virgumbakkam, Chennai");
                                                        taAddress[1].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[2].setText("#6,Sir Thiyagaraya Road"+
                                                                        "T Nagar (Opp Kasi Arcade)"+
                                                        "Chennai ");
                                                        taAddress[2].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[3].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Chennai");
                                                        taAddress[3].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[4].setText("# 2469, 21st Cross "+
                                                                        "Velacheri"+
                                                        "Chennai");
                                                        taAddress[4].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        pContDetail.add(taAddress[1]);  
                                                        pContDetail.add(taAddress[2]);  
                                                        pContDetail.add(taAddress[3]);  

                                                }
                                                else if(listLocation.getSelectedIndex()==2){
                                                        taAddress[0].setText("#6,Sir Thiyagaraya Road"+
                                                                        "T Nagar (Opp Kasi Arcade)"+
                                                        "Delhi ");
                                                        taAddress[0].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[1].setText("87, Arcot Road,"+
                                                        "Virgumbakkam, Delhi");
                                                        taAddress[1].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[2].setText("#6,Sir Thiyagaraya Road"+
                                                                        "T Nagar (Opp Kasi Arcade)"+
                                                        "Delhi ");
                                                        taAddress[2].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[3].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Banashankari 2nd Stage Delhi");
                                                        taAddress[3].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[4].setText("# 2469, 21st Cross "+
                                                                        "Velacheri"+
                                                        "Delhi");
                                                        taAddress[4].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        pContDetail.add(taAddress[1]);  
                                                        pContDetail.add(taAddress[2]);  
                                                        pContDetail.add(taAddress[3]);  

                                                }
                                                else if(listLocation.getSelectedIndex()==3){
                                                        taAddress[0].setText("Karol Bagh "+
                                                                        "6/85 Padam Singh Road,"+
                                                                        "Karol Bagh,"+
                                                        "Kolkata  ");
                                                        taAddress[0].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[1].setText("Shop no 19, 20, Grandlay Complex,"+
                                                                        "New Friends Colony,"+
                                                        "Kolkata " );
                                                        taAddress[1].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[2].setText("12, Community Centre,"+
                                                                        "Saket,"+
                                                        "Kolkata  ");
                                                        taAddress[2].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[3].setText("# 2469, 21st Cross "+
                                                                        "Near BDA Complex"+
                                                        "Kolkata ");
                                                        taAddress[3].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[4].setText("# 2469, 21st Cross "+
                                                                        "Star Bazzar"+
                                                        "Kolkata ");
                                                        taAddress[4].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        pContDetail.add(taAddress[1]);  
                                                        pContDetail.add(taAddress[2]);  
                                                        pContDetail.add(taAddress[3]);  

                                                }
                                                else if(listLocation.getSelectedIndex()==4){
                                                        taAddress[0].setText("Ground Floor,Shop no 1,Tandon Mall,"+
                                                                        "Andheri Kurla Road, Andheri(East),"+
                                                                        "Mumbai ");
                                                        taAddress[0].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[1].setText("Restaurant No 2, 2nd floor, Inorbit Mall, Chincholi Bhandar,"+
                                                                        "New Link Road, Malad (W),"+
                                                                        "Mumbai ");
                                                        taAddress[1].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[2].setText("883/1 Juhu Tara Road, Next to J 49 Juhu,"+
                                                                                        "Vile Parle (West)"+
                                                                                        "Mumbai  ");
                                                        taAddress[2].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[3].setText("Eureka Towers, Mindspace,"+
                                                                                                        "Malad Link Road, Malad (W),"+
                                                                                                        "Mumbai ");
                                                        taAddress[3].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        taAddress[4].setText("# 2469, 21st Cross "+
                                                                                                                        "Velacheri"+
                                                                                                        "Mumbai");
                                                        taAddress[4].setLineWrap(true);
                                                        pContDetail.add(taAddress[0]);  
                                                        pContDetail.add(taAddress[1]);  
                                                        pContDetail.add(taAddress[2]);  
                                                        pContDetail.add(taAddress[3]);  

                                                }
                                        }
                                }
                        }

                }
                );

		//listLocation.addListSelectionListener((ListSelectionListener)locationPanel);

        listLocation.setBounds(new Rectangle(200, 355, 100, 175));
        pTitle.add(lLocationDetail);
		pTitle.setBounds(300,50,100,25);
		pTitle.setBackground( Color.red);

		pContDetail.setLayout(new GridLayout(10,1));
        pContDetail.setBounds(new Rectangle(300, 355, 550, 325));
       // pContDetail.setBounds(300,75,450,300);

        locationPanel.add(listLocation);
        locationPanel.add(pTitle);
        //locationPanel.setVisible(true);
        locationPanel.add(pContDetail);
        welcomeNote.add(jLabel1, null);
        jPanel1.add(homeButton, null);
        jPanel1.add(menuButton, null);
        jPanel1.add(locationButton, null);
        jPanel1.add(aboutusButton, null);
        jPanel1.add(contactButton, null);
        jPanel1.add(registerButton, null);
        jPanel1.add(loginButton, null);
        jPanel1.add(feedbackButton, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(welcomeNote, null);
        this.getContentPane().add(locationPanel, null);
        
        this.setTitle("HOME");
        this.setBackground(Color.white);
        this.setVisible(true);
    }
    public static void main(String args[]) {
        Location location=new Location();
        location.setVisible(true);
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
