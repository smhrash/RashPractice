package oop.inheritance;

public class Test {

    public static void main(String[] args) {

        Father myFather = new Father();
        myFather.education();
        myFather.drive();

        GrandFather myGrandFather = new Father();
        myGrandFather.hobby();
        myFather.height();
        ((Father)myGrandFather).hobby();


        Son rash = new Son();
        rash.eyeColor();
        rash.getFavoriteFood();
        rash.drive();
        rash.hobby();

        Father fr= new Son();

    }
}
