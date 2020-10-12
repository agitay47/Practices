package Inheritance.Practice3;

public class BMW extends Car{ //grandkids class //has-a relationship

    //when method is present in parent class as well as in child class with the same name and same number of argument,
    // is called Method Overriding
    public void start(){ // overridden method
        System.out.println("BMW---start");
    }

    public void theftSafety(){
        System.out.println("BMW----theftSafety");
    }


}
