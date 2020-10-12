package Abstraction_Cybertek.Phone;

public class Samsung extends Phone {

    static {
        brand = "Samsung";
    }


    public Samsung(String model, double price, String size) {//abstract method can have constructor
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override //from parent class
    public void calling(long phoneNumber) {
        System.out.println(phoneNumber + " is calling");
    }

    @Override //from parent class
    public void texting(long phoneNumber) {
        System.out.println(phoneNumber + " is texting");
    }

    public void freezing() { //new method
        System.out.println("Samsung is freezing  when using ");
    }
}
