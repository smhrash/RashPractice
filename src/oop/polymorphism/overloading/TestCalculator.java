package oop.polymorphism.overloading;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator =new Calculator();
        calculator.doSummation();

        calculator.doSummation(34,54,86);
    }

}
