package Abstraction.AbstractionConcept;
//we can only have abstract methods in interface
//no methods body in interface
public interface Car {
    //only final and static we can define in interface
    final int wheels = 4; //by default final and static will be define
    static String ssn = "!22222";



    //always define only abstract methods
    //no  method body
    //only method declaration
    //we achieve 100 % abstraction
    //we can not create the object of interface
    //we use "implements" keyword to extend parent class

    public void start();
    public void stop();
    public void refuel();







}
