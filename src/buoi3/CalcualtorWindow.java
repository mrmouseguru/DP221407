package buoi3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcualtorWindow extends JFrame{
    private JLabel jLabelInputRemote1, 
    jLabelInputRemote2, jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1,
    jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote,
    mulButtonRemote, divButtonRemote;
    
    CalcualtorWindow(){
        buildPanel();
        

        add(jPanelRemote);

        setTitle("Frame Viewer");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public void buildPanel() {
        jPanelRemote = new JPanel();

        //jPanelRemote.setBackground(Color.PINK);

        jLabelInputRemote1 = new JLabel("input1");
        jTextFieldInputRemote1 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);
        jLabelInputRemote2 = new JLabel("input2");
        jTextFieldInputRemote2 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote2);
        jPanelRemote.add(jTextFieldInputRemote2);
        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelOutputRemote);
        addButtonRemote = new JButton("ADD");
        subButtonRemote = new JButton("SUB");

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);
    }

}
