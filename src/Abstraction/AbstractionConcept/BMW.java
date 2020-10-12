package Abstraction.AbstractionConcept;

public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW can start"); //new implementation
    }

    @Override
    public void stop() {
        System.out.println("BMW can stop");//new implementation
    }

    @Override
    public void refuel() {
        System.out.println("BMW gets refuel");//new implementation
    }

    //non overriden method:
    public void theftSafety(){ //new object of child class
        System.out.println("BMW---theftSafety");//new implementation
    }
}
