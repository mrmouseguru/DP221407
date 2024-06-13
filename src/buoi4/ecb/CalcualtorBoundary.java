package buoi4.ecb;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcualtorBoundary extends JFrame
         {
    private JLabel jLabelInputRemote1,
            jLabelInputRemote2, jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1,
            jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote,
            mulButtonRemote, divButtonRemote;

    private CalculatorControl calculatorControlRemote;

    public JTextField getjTextFieldInputRemote1() {
        return jTextFieldInputRemote1;
    }
    public JTextField getjTextFieldInputRemote2() {
        return jTextFieldInputRemote2;
    }
    public JLabel getjLabelOutputRemote() {
        return jLabelOutputRemote;
    }
    CalcualtorBoundary() {
        calculatorControlRemote = new CalculatorControl(this);
        buildPanel();

        add(jPanelRemote);

        setTitle("Frame Viewer");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public void buildPanel() {
        jPanelRemote = new JPanel();

        // jPanelRemote.setBackground(Color.PINK);

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
        // đăng ký CalculatorWindow Object với ADD nút
        addButtonRemote.addActionListener(calculatorControlRemote);// Remote của object CalculatorWindow === this
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(calculatorControlRemote);

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);
    }

   

}
