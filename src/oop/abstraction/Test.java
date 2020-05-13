package oop.abstraction;

public class Test {

    public static void main(String[] args) {


        Ford rashFord = new Ford();
        String rashCarModelName = rashFord.modelName;
        System.out.println(rashCarModelName);

        rashFord.gear();
        rashFord.pushStart();
        rashFord.start();
        rashFord.steering();
        rashFord.cruzControl();
        rashFord.mirror();

        BMW ronyBMW = new BMW();

        ronyBMW.camera();
        ronyBMW.gprs();
        ronyBMW.autoGear();
        ronyBMW.cruzControl();
        ronyBMW.selfParkingFeature();



    }


    public void cruzControl() {

    }


    public void selfParkingFeature() {

    }
}




