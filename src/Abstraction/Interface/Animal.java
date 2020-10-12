package Abstraction.Interface;


//Another way to achieve abstraction in Java, is with interfaces.
//
//An interface is a completely "abstract class" that is used to group related methods with empty bodies:

//Notes on Interfaces:
//Like abstract classes, interfaces cannot be used to create objects
//
//Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)
//An abstract class can contain a constructor( i think)

//Why And When To Use Interfaces?
//1) To achieve security - hide certain details and only show the important details of an object (interface).
//
//2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
// However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma




// interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}


// Pig "implements" the Animal interface
class Pig implements Animal {//implements keyword
    public void animalSound() {//added implementation
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {
        System.out.println("Pig can not run fast");
    }

    public void sleep() { //newly added method
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.run();
    }
}

