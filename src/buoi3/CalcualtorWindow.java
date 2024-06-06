package buoi3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcualtorWindow extends JFrame{
    private JLabel jLabelInputRemote1;
    private JTextField jTextFieldInputRemote1;
    private JPanel jPanelRemote;
    
    CalcualtorWindow(){

        jPanelRemote = new JPanel();

        jPanelRemote.setBackground(Color.PINK);

        jLabelInputRemote1 = new JLabel("input1");
        jTextFieldInputRemote1 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);

        add(jPanelRemote);

        setTitle("Frame Viewer");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

}
