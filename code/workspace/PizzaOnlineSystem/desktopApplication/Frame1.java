package desktopApplication;

import java.awt.Dimension;

import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Frame1 extends JFrame {
    private JPanel jPanel1 = new JPanel();

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(1024, 768));
        jPanel1.setBounds(new Rectangle(5, 0, 1015, 60));
        jPanel1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        this.getContentPane().add(jPanel1, null);
    }
}
