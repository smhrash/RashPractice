package oop.polymorphism.overloading;

public class Calculator {
    public void doSummation() {
        int number = 44;
        int number1 = 55;
        int summation = number + number1;

        System.out.println(summation);
    }
    public void doSummation(int num1, int num2, int num3){
        int number= num1;
        int number1= num2;
        int number2= num3;

        int summation= num1+num2+num3;

        System.out.println(summation);


    }
}
