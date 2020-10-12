package Abstraction.AbstractionConcept;

public abstract class Bank {
    //partial abstraction(0-100%)
    //hiding the implementation logic---is called Abstraction(OOP concept)
    //abstract class can have abstract methods and non abstract methods
    //we can not create the object of abstract classes
    //we use "extends" keyword to extend parent class


    int amount = 100;
    final int rate=10;
    static int loanRate = 5;



    public abstract void loan(); //abstract method // no body

    //non abstract methods
    public void credit(){
        System.out.println("Bank credit");
    }

    //non abstract methods
    public void debit(){
        System.out.println("Bank debit");
    }

}
