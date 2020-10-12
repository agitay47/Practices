package Inheritance.Practice7;

import static Inheritance.Practice7.Tesla.brand;

public class Model3 extends Tesla {
    public String range;
    public boolean hasDualMotor;

    public Model3(String buyer, String model, int year, double price, String color, String range, boolean hasDualMotor) {
        super(buyer, model, year, price, color);
        this.range = range;
        this.hasDualMotor = hasDualMotor;
    }

    public Model3(String buyer, String model, int year, double price, String color) {
        super(buyer, model, year, price, color);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("You can click start button");
    }

    public void engine() {
        System.out.println(brand + " " + model + " has no engine");
    }

    public void oilChange() {
        System.out.println(brand + " " + model + " does not need oil");
    }

    @Override
    public void testDrive() {
        super.testDrive();
    }

    @Override
    public void leaseCar() {
        super.leaseCar();
    }

    @Override
    public String toString() {
        return "Model3{" +
                "range='" + range + '\'' +
                ", hasDualMotor=" + hasDualMotor +
                ", buyer='" + buyer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
