package Polymorphism.Phone;
/*
    5. create a class named iPhone that can inherit from AppleApps and Phone
            actions that every iphone can do: texting(),selfie(), calling(), faceTiming()
 */

public final class iPhone extends Phone implements AppleApps {
    static{//static block
        brand = "Apple";
    }

    public iPhone(String model, double price, String size) {//constructor
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download() {

    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }
    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is face-timing to "+phoneNumber);
    }

    public void selfie(){
        System.out.println(model+ " takes a great selfie");
    }

}
