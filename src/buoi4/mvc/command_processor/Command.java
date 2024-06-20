package buoi4.mvc.command_processor;

import buoi4.mvc.CalculatorModel;

public abstract class Command {
    //field
    protected CalculatorModel calculatorModelRemote = null;

    //method

    public Command(CalculatorModel calculatorModelRemote){
        this.calculatorModelRemote = calculatorModelRemote;
    }

    public abstract void execute();

}
