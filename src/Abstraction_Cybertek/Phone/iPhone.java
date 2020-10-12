package Abstraction_Cybertek.Phone;

public final class iPhone extends Phone {

    static {
        brand = "iPhone";

    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void calling(long phoneNumber) {
        System.out.println(phoneNumber + " is calling");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(phoneNumber + " is texting");
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("iPhone is face-timing with " + phoneNumber);
    }
}
