package Abstraction.OOP;

public class Dog extends Animal{
    // & 100 of abstraction is interface


    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();




    }

    @Override //if we have abstract method, we must override it
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
