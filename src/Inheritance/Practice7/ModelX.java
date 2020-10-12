package Inheritance.Practice7;

public class ModelX extends Tesla {
    public int totalSeat;
    public String range;

    public ModelX(String buyer, String model, int year, double price, String color, int totalSeat, String range) {
        super(buyer, model, year, price, color);
        this.totalSeat = totalSeat;
        this.range = range;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("You can give a command with your voice");
    }

    public void charge() {
        System.out.println(brand + " " + model + " recharge in 15 minutes");
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
        return "ModelX{" +
                "totalSeat=" + totalSeat +
                ", range='" + range + '\'' +
                ", buyer='" + buyer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
