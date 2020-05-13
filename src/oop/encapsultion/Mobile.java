package oop.encapsultion;

public class Mobile {

    public String branName ;
    public String modelName = "11 Max Pro";
    private String mobileType = "5g";
    private int mobileSize;
    private double mobilePrize;


    public Mobile(String branName, String modelName) {
        this.branName = branName;
        this.modelName = modelName;
    }

    public Mobile(String branName, String modelName, String mobileType, int mobileSize, double mobilePrize) {
        this.branName = branName;
        this.modelName = modelName;
        this.mobileType = mobileType;
        this.mobileSize = mobileSize;
        this.mobilePrize = mobilePrize;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public int getMobileSize() {
        return mobileSize;
    }

    public void setMobileSize(int mobileSize) {
        this.mobileSize = mobileSize;
    }

    public double getMobilePrize() {
        return mobilePrize;
    }

    public void setMobilePrize(double mobilePrize) {
        this.mobilePrize = mobilePrize;
    }
}
