package oop.abstraction;

public class Ford extends ModernCar implements Car{


    String modelName = "M-20";

    public void start(){

        System.out.println("Ford has start Feature");
    }

    @Override
    public void PushStart() {

    }

    @Override
    public void twinTurbo() {

    }

    @Override
    public void cruzControl() {

    }

    @Override
    public void selfParkingFeature() {

    }

    public void pushStart(){

        System.out.println("Ford has pushStart Feature");

    }public void steering(){

        System.out.println("Ford has steering Feature");
    }

    @Override
    public void wheel() {

    }

    @Override
    public void mirror() {

    }

    @Override
    public void rim() {

    }

    @Override
    public void driverSeat() {

    }

    public void gear(){

        System.out.println("Ford has gear Feature");
    }


}
