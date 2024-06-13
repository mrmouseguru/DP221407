package buoi4.ecb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
public class CalculatorControl implements ActionListener {

    //field
    private CalculatorEntity calculatorEntityRemote = null;
    private CalcualtorBoundary calcualtorBoundaryRemote = null;

    CalculatorControl(CalcualtorBoundary calcualtorBoundaryRemote){
        calculatorEntityRemote = new CalculatorEntity();
        this.calcualtorBoundaryRemote = calcualtorBoundaryRemote;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        double num1 = Double.parseDouble(
                calcualtorBoundaryRemote.getjTextFieldInputRemote1()
                .getText());

        double num2 = Double.parseDouble(
                calcualtorBoundaryRemote
                .getjTextFieldInputRemote2().getText());

        if (command.equals("ADD")) {
            calculatorEntityRemote.add(num1, num2);
            calcualtorBoundaryRemote.getjLabelOutputRemote()
            .setText("" + calculatorEntityRemote.getResult());

        } else if (command.equals("SUB")) {
            calculatorEntityRemote.sub(num1, num2);
            calcualtorBoundaryRemote.getjLabelOutputRemote()
            .setText("" + calculatorEntityRemote.getResult());
        }

    }
}
