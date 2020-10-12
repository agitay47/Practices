package Abstraction;

public interface USBank {

    int min_bal = 100;

    public void debit();

    public void credit();

    public void transferMoney();

    public void trading();

    //Data abstraction is the process of hiding certain details and showing only essential information to the user.
    //Abstraction can be achieved with either abstract classes or interfaces

    //The abstract keyword is a non-access modifier, used for classes and methods:
    //Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    //An abstract class can have both abstract and regular methods:

    //To access the abstract class, it must be inherited from another class.

    //no method body, only method declaration
    //method prototype
    //can not create the object of interface
    //no static method
    //but interface variables are static in nature by default
    //abstraction--100%


    //Why And When To Use Abstract Classes and Methods?
    //To achieve security - hide certain details and only show the important details of an object.
    //
    //Note: Abstraction can also be achieved with Interfaces,


}
