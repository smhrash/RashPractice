package oop.encapsultion;

public class TestMobile {

    public static void main(String[] args) {



        Mobile rashMobile= new Mobile("Samung","11 S");
        System.out.println(rashMobile.branName);
        System.out.println(rashMobile.modelName);

        rashMobile.setMobilePrize(1300.00);
        System.out.println(rashMobile.getMobilePrize());
        rashMobile.setMobileSize(5);
        System.out.println(rashMobile.getMobileSize());
        rashMobile.setMobileType("5g");
        System.out.println(rashMobile.getMobileType());






    }
}
