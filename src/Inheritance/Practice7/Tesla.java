package Inheritance.Practice7;

public class Tesla {
    public String buyer;
    public String model;
    public int year;
    public double price;
    public String color;

    public static String brand;

    private String VIN;

    static {
        brand = "TESLA";
    }

    public Tesla(String buyer, String model, int year, double price, String color) { //constructor
        this.buyer = buyer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getVIN() { //we use getter to update value in another class
        return VIN;
    }

    public void engine() {
        System.out.println(brand + " has no engine");
    }

    public void setVIN(String VIN) { //we use setter to set value in another class
        this.VIN = VIN;
    }

    public void start() {
        System.out.println("You can start your " + brand + " " + model);
    }

    public void testDrive() {
        System.out.println(buyer + " can test the car before.");
    }

    public void leaseCar() {
        System.out.println(buyer + " has option to lease the car.");
    }

    public String toString() {
        return "Buyer: " + buyer + "\nModel: " + model + "\nYear: " + year + "\nPrice: $" + price + "\nColor: " + color;
    }
}
