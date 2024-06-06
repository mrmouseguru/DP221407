package buoi3;

public class Calculator {
    private double result;

    public void add(double num1, double num2) {
        this.result = num1 + num2;
    }

    public void sub(double num1, double num2) {
        this.result = num1 - num2;
    }

    public double getResult() {
        return result;
    }

}
