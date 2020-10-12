package Inheritance.Practice3;

public class TestCar {
    public static void main(String[] args) {

        //static polymorphism==> compile- time polymorphism
        BMW b = new BMW();
        b.start();
        b.stop(); //overriden
        b.refuel();//overriden
        b.theftSafety();//static polymorphism or compile time polymorphism
        b.engine();//from grandparent class////overriden

        System.out.println("==========================================");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
       // c.theftSafety(); parent class can not inherit from child class

        System.out.println("==========================================");

        //Top Casting//dynamic polymorphism
        Car c1 = new BMW(); //child class object can be referred by parent class reference variable--dynamic polymorphism
        //or Run-time polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
        // c.theftSafety(); we can not call child class method in Dynamic Polymorphism

        //Down Casting  is possible but it gives us //ClassCastException// runtime exception

        BMW b1 = (BMW)new Car(); //usually we can not assign parent class to child class but we can down casting to use it



    }
}
