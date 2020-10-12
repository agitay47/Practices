package Abstraction.AbstractionConcept;

public class TestCar {
    public static void main(String[] args) {

        BMW b = new BMW(); // we can create object of child class
        b.start();//overridden
        b.stop();//overridden
        b.refuel();//overridden
        b.theftSafety();//from child class

        Car c = new BMW(); //dynamic polymorphism
        c.refuel();
        c.start();
        c.stop();
       // c.theftSafety();//only available in BMW//Child class //not overridden




    }
}
