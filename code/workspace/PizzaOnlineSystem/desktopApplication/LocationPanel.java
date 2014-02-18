package desktopApplication;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class LocationPanel extends JPanel implements ListSelectionListener {

	/**
	 * @param args
	 */
	private JPanel pTitle= new JPanel();
	private JPanel pContents= new JPanel();
	private JPanel pContIndex= new JPanel();
	private JPanel pContDetail= new JPanel();
	private JList listLocation =new JList( new String[] {"Bangalore","Chennai","Delhi","KolKata","Mumbai"});
	private JLabel lLocationDetail = new JLabel("Outlet Details");
	private JTextArea taAddress[] = new JTextArea[10];

	private ListSelectionModel listSelectionModel;



	LocationPanel(){
		locInit();
	}

	public void locInit()  {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(1000,1000));
		for(int i=0;i<10;i++){
			taAddress[i]=new JTextArea("");
		}
		listLocation.setBounds(100,50,100,100);
		listLocation.setBackground( Color.darkGray);
		listLocation.setForeground(Color.white);
		listLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listLocation.addListSelectionListener(this);

//		listLocation.addListSelectionListener(this);

		pTitle.add(lLocationDetail);
		pTitle.setBounds(300,50,100,25);
		pTitle.setBackground( Color.red);

		pContDetail.setLayout(new GridLayout(10,1));
		pContDetail.setBounds(300,75,450,300);

		this.add(listLocation);
		this.add(pTitle);
		this.add(pContDetail);
		this.setVisible(true);
	}	



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
	public static void main(String args[]){
		JFrame j1= new JFrame();
		LocationPanel ob= new LocationPanel();
		j1.add(ob);
		ob.setSize(600,650);
		j1.setVisible(true);
	}
}








