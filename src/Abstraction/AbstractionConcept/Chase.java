package Abstraction.AbstractionConcept;

public class Chase extends Bank{


    @Override
    public void loan() {
        System.out.println("Chase bank has different loan options");//new implementation
    }

    public void funds(){//non asbtract method
        System.out.println("Chase bank have Funds department");
    }



}
