package oop.abstraction;

public class BMW extends ModernCar implements Car{

    public void gprs(){

        System.out.println("BMW has gprs");

    }
    public void camera() {

        System.out.println("BMW has camera");

    }
    public void autoGear(){

        System.out.println("BMW has auto gear");
    }

    @Override
    public void start() {
        System.out.println("BMW has start button");

    }

    @Override
    public void PushStart() {
        System.out.println("BMW has push start button");

    }

    @Override
    public void gear() {
        System.out.println("BMW has gear");

    }

    @Override
    public void steering() {
        System.out.println("BMW has steering");

    }

    @Override
    public void wheel() {
        System.out.println("BMW has wheel");

    }

    @Override
    public void mirror() {
        System.out.println("BMW has mirror");

    }

    @Override
    public void rim() {
        System.out.println("BMW has rim");

    }

    @Override
    public void driverSeat() {
        System.out.println("BMW has driver seat");

    }

    @Override
    public void twinTurbo() {
        System.out.println("BMW has Twin turbo");

    }

    @Override
    public void cruzControl() {
        System.out.println("BMW has cruz control");

    }

    @Override
    public void selfParkingFeature() {
        System.out.println("BMW has self parking feature");

    }
}
