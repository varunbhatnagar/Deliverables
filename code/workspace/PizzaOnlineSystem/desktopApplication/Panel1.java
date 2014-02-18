package desktopApplication;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Panel1 extends JPanel {
	JFrame frame= new JFrame("ORDER PIZZA");
	JFrame confirmFrame;
	JPanel c1 ;
	Panel1 order;
	private JCheckBox pizza1_CheckBox = new JCheckBox();
	private JTextField pizza1_jTextField = new JTextField(null);
	private JLabel pizza1_jLabel = new JLabel();
	private JCheckBox pizza2_jCheckBox = new JCheckBox();
	private JTextField pizza2_jTextField = new JTextField(null);
	private JLabel pizza2_jLabel = new JLabel();
	private JCheckBox pizza3_jCheckBox = new JCheckBox();
	private JTextField pizza3_jTextField = new JTextField(null);
	private JLabel pizza3_jLabel = new JLabel();
	private JCheckBox pizza4_jCheckBox = new JCheckBox();
	private JLabel pizza4_jLabel = new JLabel();
	private JTextField pizza4_jTextField = new JTextField(null);
	private JCheckBox pizza5_jCheckBox = new JCheckBox();
	private JLabel pizza5_jLabel = new JLabel();
	private JTextField pizza5_jTextField = new JTextField(null);
	private JButton reset = new JButton();
	private JButton confirm = new JButton();
	private JLabel total = new JLabel();
	private JTextField totalField = new JTextField(null);
	private ButtonGroup bG1=new ButtonGroup();
	private JLabel jLabel1 = new JLabel();
	private JButton jButton1 = new JButton();
	private JButton goBack = new JButton();
	private JRadioButton jRadioButton1 = new JRadioButton();
	private JRadioButton jRadioButton2 = new JRadioButton();
	private JTextArea jTextArea1 = new JTextArea();
	private JLabel jLabel2 = new JLabel();



	public Panel1() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		this.setLayout( null );
		pizza1_CheckBox.setText("pizza1_CheckBox");
		pizza1_CheckBox.setBounds(new Rectangle(25, 25, 74, 18));
		pizza1_CheckBox.setToolTipText("Tick if you select this pizza");
		pizza1_CheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pizza1_CheckBox_actionPerformed(e);
			}
		});
		pizza1_jTextField.setBounds(new Rectangle(100, 25, 30, 20));

		pizza1_jTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				pizza1_jTextField_keyReleased(e);
			}
		});

		pizza1_jLabel.setText("Magarita Large Capcicum Price-150");
		pizza1_jLabel.setBounds(new Rectangle(140, 25, 210, 20));
		pizza2_jCheckBox.setText("pizza2_jCheckBox");
		pizza2_jCheckBox.setBounds(new Rectangle(25, 55, 74, 18));
		pizza2_jCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pizza2_jCheckBox_actionPerformed(e);
			}
		});
		pizza2_jTextField.setBounds(new Rectangle(100, 55, 30, 20));
		pizza2_jTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				pizza2_jTextField_keyReleased(e);
			}
		});
		pizza2_jLabel.setText("Magarita small onion Price-100");
		pizza2_jLabel.setBounds(new Rectangle(140, 55, 200, 20));
		pizza2_jLabel.setToolTipText("null");
		pizza3_jCheckBox.setText("pizza3_jCheckBox");
		pizza3_jCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pizza3_jCheckBox_actionPerformed(e);
			}
		});
		pizza3_jCheckBox.setBounds(new Rectangle(25, 85, 74, 18));
		pizza3_jTextField.setBounds(new Rectangle(100, 85, 30, 20));
		pizza3_jTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				pizza3_jTextField_keyReleased(e);
			}
		});
		pizza3_jLabel.setText("pizza3_jLabel");
		pizza3_jLabel.setBounds(new Rectangle(140, 85, 170, 20));
		pizza4_jCheckBox.setText("pizza4_jCheckBox");
		pizza4_jCheckBox.setBounds(new Rectangle(25, 115, 74, 18));
		pizza4_jCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pizza4_jCheckBox_actionPerformed(e);
			}
		});
		pizza4_jLabel.setText("pizza4_jLabel");
		pizza4_jLabel.setBounds(new Rectangle(140, 115, 195, 20));
		pizza5_jCheckBox.setText("pizza5_jCheckBox");
		pizza5_jCheckBox.setBounds(new Rectangle(25, 150, 74, 18));
		pizza5_jCheckBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pizza5_jCheckBox_actionPerformed(e);
			}
		});
		pizza5_jLabel.setText("pizza5_jLabel");
		pizza5_jLabel.setBounds(new Rectangle(140, 145, 200, 20));
		reset.setText("RESET");
		reset.setBounds(new Rectangle(15, 270, 85, 25));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset_actionPerformed(e);
			}
		});
		confirm.setText("CONFIRM");
		confirm.setBounds(new Rectangle(110, 270, 100, 25));
		confirm.setToolTipText("null");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirm_actionPerformed(e);
			}
		});
		total.setText("Total");
		total.setBounds(new Rectangle(285, 270, 45, 25));
		totalField.setBounds(new Rectangle(340, 270, 50, 20));
		totalField.setToolTipText("Total Amount To Be paid");
		pizza4_jTextField.setBounds(new Rectangle(100, 115, 30, 20));
		pizza4_jTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				pizza4_jTextField_keyReleased(e);
			}
		});
		pizza5_jTextField.setBounds(new Rectangle(100, 145, 30, 20));
		pizza5_jTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				pizza5_jTextField_keyReleased(e);
			}
		});
		this.add(pizza5_jTextField, null);
		this.add(pizza4_jTextField, null);
		this.add(totalField, null);
		this.add(total, null);
		this.add(confirm, null);
		this.add(reset, null);
		this.add(pizza5_jLabel, null);
		this.add(pizza5_jCheckBox, null);
		this.add(pizza4_jLabel, null);
		this.add(pizza4_jCheckBox, null);
		this.add(pizza3_jLabel, null);
		this.add(pizza3_jTextField, null);
		this.add(pizza3_jCheckBox, null);
		this.add(pizza2_jLabel, null);
		this.add(pizza2_jTextField, null);
		this.add(pizza2_jCheckBox, null);
		this.add(pizza1_jLabel, null);
		this.add(pizza1_jTextField, null);
		this.add(pizza1_CheckBox, null);
	}



	private void confirm_actionPerformed(ActionEvent e) {
		System.out.println("hi");
		
		// create the string 
		//String createOrder=new String()
		c1= ConfirmPanel();
		frame.setVisible(false);
		confirmFrame = new JFrame("Order Pizza");
		confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add content to the window.
		confirmFrame.add(c1, BorderLayout.CENTER);

		//Display the window.
		//   frame.pack();
		confirmFrame.setBounds(0,0,1024,768);
		confirmFrame.setVisible(true);



	}

	private void reset_actionPerformed(ActionEvent e) {
		pizza1_jTextField.setText(null);
		pizza2_jTextField.setText(null);
		pizza3_jTextField.setText(null);
		totalField.setText(null);
		pizza4_jTextField.setText(null);
		pizza5_jTextField.setText(null);
		pizza1_CheckBox.setSelected(false);
		pizza2_jCheckBox.setSelected(false);
		pizza3_jCheckBox.setSelected(false);
		pizza4_jCheckBox.setSelected(false);
		pizza5_jCheckBox.setSelected(false);
	}





	private void pizza1_jTextField_keyReleased(KeyEvent e) {
		//System.out.println("keyreleased");
		int total=0;
		int value=0;
		if(pizza1_CheckBox.isSelected()){
			String Stotal=pizza1_jTextField.getText();
			if(Stotal.equals("")){
				value=0;  
			}
			else{
				value=Integer.parseInt(pizza1_jTextField.getText());
				if(!totalField.getText().equals("")){
					total=Integer.parseInt(totalField.getText());}
				total=total+(150*value);
				totalField.setText(Integer.toString(total));
			}
		}
	}
	private void pizza1_CheckBox_actionPerformed(ActionEvent e){
		int total=0;
		int value=0;
		System.out.println("clicked");
		if(!pizza1_CheckBox.isSelected()) {

			if(pizza1_jTextField.getText().equals("")){
				System.out.println("hi");
				value=0;  
			}
			else{
				value=Integer.parseInt(pizza1_jTextField.getText());
				pizza1_jTextField.setText("");
				total=Integer.parseInt(totalField.getText());
				System.out.println("in ch1  "+total);
				total=total-(value*150);
				totalField.setText(Integer.toString(total));
			}

		}
		else if(pizza1_CheckBox.isSelected()){
			String Stotal=pizza1_jTextField.getText();
			if(Stotal.equals("")){
				value=0;  
			}
			else{
				value=Integer.parseInt(pizza1_jTextField.getText());
				if(!totalField.getText().equals("")){
					total=Integer.parseInt(totalField.getText());}
				total=total+(150*value);
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
			//	String Stotal=pizza2_jTextField.getText();
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
				total=total+(150*value);
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
				total=total-(value*150);
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
				total=total+(150*value);
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
				total=total+(150*value);
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
				total=total-(value*150);
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
				total=total+(150*value);
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
	public static void main(String[] args) {
		Panel1 order= new Panel1();
		order.createGUI(order);
	}
		
		
		public void createGUI(JPanel p1){
		
		//Create and set up the window.
		//frame = new JFrame("Order Pizza");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add content to the window.
		frame.add(p1, BorderLayout.CENTER);

		//Display the window.
		//   frame.pack();
		frame.setBounds(0,0,1024,768);
		frame.setVisible(true);
	}
	public JPanel ConfirmPanel() {
		JPanel conPanel= new JPanel();
		System.out.println("hi confirm");
		conPanel.setLayout( null );
		jLabel1.setText("conPanel IS YOUR ORDER");
		jLabel1.setBounds(new Rectangle(0, 0, 395, 40));
		jLabel1.setBackground(new Color(203, 217, 85));
		jButton1.setText("Pay");
		jButton1.setBounds(new Rectangle(280, 255, 85, 25));
		goBack.setText("Go Back");
		goBack.setBounds(new Rectangle(380, 255, 85, 25));
		jRadioButton1.setText("Cash");
		jRadioButton1.setBounds(new Rectangle(20, 260, 110, 15));
		jRadioButton2.setText("CARD");
		jRadioButton2.setBounds(new Rectangle(135, 260, 120, 15));
		bG1.add(jRadioButton1);
		bG1.add(jRadioButton2);
		jTextArea1.setBounds(new Rectangle(0, 80, 400, 105));
		jTextArea1.setBackground(new Color(160, 135, 17));
		jTextArea1.setText("hi this is your order");
		jTextArea1.setEditable(false);
		jLabel2.setText("PaymentMode");
		jLabel2.setBounds(new Rectangle(0, 215, 130, 25));
		jLabel2.setBackground(new Color(135, 95, 39));
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBack_actionPerformed(e);
			}
		});
		conPanel.add(jLabel2, null);
		conPanel.add(jTextArea1, null);
		conPanel.add(jRadioButton2, null);
		conPanel.add(jRadioButton1, null);
		conPanel.add(jButton1, null);
		conPanel.add(goBack, null);
		conPanel.add(jLabel1, null);
		return conPanel;
	}
	private void goBack_actionPerformed(ActionEvent e) {

		confirmFrame.setVisible(false);
		frame.setVisible(true);



	}
}
