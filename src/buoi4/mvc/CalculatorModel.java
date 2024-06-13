package buoi4.mvc;

import buoi4.mvc.observer.Publisher;

public class CalculatorModel extends Publisher {
    private double result;

    public void add(double num1, double num2) {
        this.result = num1 + num2;
        //notifySubcribers()
        changeState();
    }

    public void sub(double num1, double num2) {
        this.result = num1 - num2;
        changeState();
    }

    public double getResult() {
        return result;
    }

    private void changeState() {
        notifySubcribers();//thừa kế từ cha tao
    }

}
