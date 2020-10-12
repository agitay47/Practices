package Abstraction.AbstractionConcept;

public class BofA extends Bank{
    @Override
    public void loan() {
        System.out.println("Bank Of America provide low interest rate for home loans");
    }

    public void moneyTransfer(){
        System.out.println("Bank Of America has zelle program to transfer money");
    }
}
