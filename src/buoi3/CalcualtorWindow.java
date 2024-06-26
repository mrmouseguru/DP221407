package buoi3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcualtorWindow extends JFrame
        implements ActionListener {
    private JLabel jLabelInputRemote1,
            jLabelInputRemote2, jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1,
            jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote,
            mulButtonRemote, divButtonRemote;

    private Calculator calculatorRemote;

    CalcualtorWindow() {
        calculatorRemote = new Calculator();
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
        addButtonRemote.addActionListener(this);// Remote của object CalculatorWindow === this
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(this);

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        double num1 = Double.parseDouble(
                jTextFieldInputRemote1.getText());

        double num2 = Double.parseDouble(
                jTextFieldInputRemote2.getText());

        if (command.equals("ADD")) {
            calculatorRemote.add(num1, num2);
            jLabelOutputRemote.setText("" + calculatorRemote.getResult());

        } else if (command.equals("SUB")) {
            calculatorRemote.sub(num1, num2);
            jLabelOutputRemote.setText("" + calculatorRemote.getResult());
        }

    }

}
