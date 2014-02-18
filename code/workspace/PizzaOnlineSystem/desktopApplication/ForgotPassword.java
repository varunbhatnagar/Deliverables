package desktopApplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class ForgotPassword extends JFrame {
    private JPanel jPanel2 = new JPanel();
    private JLabel jlbluserid = new JLabel();
    private JTextField jtxtuserid = new JTextField();
    private JButton jbtnsubmit = new JButton();
    private JButton jbtnreset = new JButton();

    public ForgotPassword() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        Color vio_blue = new Color(153,153,255);
        jPanel2.setBackground(vio_blue);
        jPanel2.setBounds(new Rectangle(0, 0, 395, 275));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        jPanel2.setAutoscrolls(true);
        jPanel2.setFont(new Font("Comic Sans MS", 0, 12));
        jPanel2.setLayout(null);
        jlbluserid.setText("Enter your user ID :");
        jlbluserid.setBounds(new Rectangle(65, 90, 120, 20));
        jlbluserid.setFont(new Font("Comic Sans MS", 0, 12));
        jtxtuserid.setBounds(new Rectangle(190, 90, 140, 20));
        jtxtuserid.setFont(new Font("Times New Roman", 0, 11));
        jbtnsubmit.setText("Submit");
        jbtnsubmit.setBounds(new Rectangle(70, 140, 85, 20));
        jbtnsubmit.setFont(new Font("Comic Sans MS", 0, 12));
        jbtnsubmit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jbtnsubmit_actionPerformed(e);
                    }
                });
        jbtnreset.setText("Reset");
        jbtnreset.setBounds(new Rectangle(235, 140, 85, 20));
        jbtnreset.setFont(new Font("Comic Sans MS", 0, 12));
        jbtnreset.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jbtnreset_actionPerformed(e);
                    }
                });
        jPanel2.add(jbtnreset, null);
        jPanel2.add(jbtnsubmit, null);
        jPanel2.add(jtxtuserid, null);
        jPanel2.add(jlbluserid, null);
        this.getContentPane().add(jPanel2, null);
        setVisible(true);
        this.setTitle("FORGOT PASSWORD");
    }
    public static void main(String []args){
        new ForgotPassword();

    }

    private void jbtnreset_actionPerformed(ActionEvent e) {
		jtxtuserid.setText(null);
    }

    private void jbtnsubmit_actionPerformed(ActionEvent e) {
    	this.setVisible(false);
    	JOptionPane.showMessageDialog(null,"Your password has been sent to your mobile");
    	
    }
}
