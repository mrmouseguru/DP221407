package buoi4.mvc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi4.mvc.command_processor.AddCommand;
import buoi4.mvc.command_processor.Command;
import buoi4.mvc.command_processor.CommandProcessor;
import buoi4.mvc.observer.Subcriber;

public class CalcualtorView extends JFrame implements Subcriber
         {
    private JLabel jLabelInputRemote1,
            jLabelInputRemote2, jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1,
            jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote,
            mulButtonRemote, divButtonRemote;
    private JMenuBar menuBarRemote = null;

    private CalculatorController calculatorControlRemote;
    private MenuController menuControllerRemote = null;
    private CalculatorModel calculatorModelRemote;
    private CommandProcessor commandProcessorRemote = null;

   
    CalcualtorView() {
        commandProcessorRemote = CommandProcessor.makeCommandProcessor();
        calculatorModelRemote = new CalculatorModel();//publisher
        //đăng ký view - subcriber với publisher
        calculatorModelRemote.subcribe(this);
        calculatorControlRemote = new CalculatorController();
        menuControllerRemote = new MenuController();
        buildPanel();
        buildMenu();

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

    public void buildMenu() {
        menuBarRemote = new JMenuBar();

        //đưa thanh Menu vào trong cửa sổ
        setJMenuBar(menuBarRemote);
        //Menu
        JMenu calcualtorMenuRemote = new JMenu("Calculator");
        //đặt Menu vào trong Menu Bar
        menuBarRemote.add(calcualtorMenuRemote);
        //Menu Itm
        JMenuItem addMenuItemRemote = new JMenuItem("ADD");
        addMenuItemRemote.addActionListener(menuControllerRemote);
        //đặt item vào trong Menu
        calcualtorMenuRemote.add(addMenuItemRemote);
    }
    class CalculatorController implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            double num1 = Double.parseDouble(
                    jTextFieldInputRemote1.getText());
            double num2 = Double.parseDouble(
                    jTextFieldInputRemote2.getText());
    
            if (command.equals("ADD")) {
                calculatorModelRemote.add(num1, num2);
                
                //jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
    
            } else if (command.equals("SUB")) {
                calculatorModelRemote.sub(num1, num2);
                //jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
            }
    
        }
    }

    class MenuController implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            double num1 = Double.parseDouble(
                    jTextFieldInputRemote1.getText());
            double num2 = Double.parseDouble(
                    jTextFieldInputRemote2.getText());
    
            Command commandRemote = null;
            if (command.equals("ADD")) {
                //calculatorModelRemote.add(num1, num2);
                commandRemote = new AddCommand(calculatorModelRemote, num1, num2);
                commandProcessorRemote.execute(commandRemote);
                
                //jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
    
            } else if (command.equals("SUB")) {
                calculatorModelRemote.sub(num1, num2);
                //jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
            }
        }
        
    }
    @Override
    public void update() {
        double result = calculatorModelRemote.getResult();
        jLabelOutputRemote.setText("" + result);

    }
    

}
