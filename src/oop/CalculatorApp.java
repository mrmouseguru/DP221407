package oop;

public class CalculatorApp {
    public static void main(String[] args) {
        
        Calculator calculatorRemote = new Calculator();
        int result =  calculatorRemote.multiply();//message
        System.out.println("Result is: " + result);
    }

}
