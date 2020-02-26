package lab9;

public class Mobile {

    private int MobileiID;
    private String Brand;
    private String Generation;
    private Double Price;
    private String System;

//constructor

    public Mobile(int mobileiID, String brand, String generation, Double price, String system) {
        MobileiID = mobileiID;
        Brand = brand;
        Generation = generation;
        Price = price;
        System = system;
    }

//getter and setter

    public int getMobileiID() {
        return MobileiID;
    }

    public void setMobileiID(int mobileiID) {
        MobileiID = mobileiID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGeneration() {
        return Generation;
    }

    public void setGeneration(String generation) {
        Generation = generation;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

//to String

    @Override
    public String toString() {
        return "Mobile{" +
                "MobileiID=" + MobileiID +
                ", Brand='" + Brand + '\'' +
                ", Generation='" + Generation + '\'' +
                ", Price=" + Price +
                ", System='" + System + '\'' +
                '}';
    }
}
