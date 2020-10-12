package Abstraction.Tesla;


public abstract class Tesla {
    public String buyer;
    public String model;
    final public int year;
    public double price;
    public String color;

    final public String brand ="Tesla";
    final public String VIN = "5YJYGDEF2LFR00942 ";



    public Tesla(String buyer, String model, int year, double price, String color) { //Abstract class can have constructor
        this.buyer = buyer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getVIN() { //we use getter to update value in another class
        return VIN;
    }

    public abstract void engine();

    public abstract void start();



}