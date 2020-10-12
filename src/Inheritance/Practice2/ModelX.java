package Inheritance.Practice2;

public class ModelX extends Tesla {

    public int totalSeat;
    public String range;

    public ModelX(String buyer, String model, int year, double price, String color, int totalSeat, String range) {
        setInfo(buyer, model, year, price, color);
        this.totalSeat = totalSeat;
        this.range = range;
    }

    public void charge() {
        System.out.println(brand + " " + model + " recharge in 15 minutes");
    }

    public void oilChange() {
        System.out.println(brand + " " + model + " does not need oil");
    }

}
