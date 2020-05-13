package oop.polymorphism.overriding;


public class Toyota extends Car {

    @Override
    public void start(){

        System.out.println("Toyota has start feature");


    }
    @Override
    public void doRun(){

        System.out.println("Toyota can run");
    }

}
