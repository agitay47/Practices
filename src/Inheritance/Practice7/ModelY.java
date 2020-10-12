package Inheritance.Practice7;

public class ModelY extends Tesla {

    public ModelY(String buyer, String model, int year, double price, String color) {
        super(buyer, model, year, price, color);
    }

    @Override
    public void engine() {
        super.engine();
        System.out.println(brand + " " + model + " has two engines");
    }


    @Override
    public void start() {
        System.out.println(model + " can start with remote control");
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
        return "ModelY{" +
                "buyer='" + buyer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
