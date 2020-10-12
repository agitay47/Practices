package Abstraction.AbstractionConcept;

public class TestBank {


    public static void main(String[] args) {

        Chase cb = new Chase(); // we can create object of child class

        cb.credit();//override //from abstract class
        cb.debit();//override //from abstract class
        cb.loan();//override //from abstract class
        cb.funds();//not override //it comes from child class

        Bank b = new Chase();//is called dynamic polymorphism
        b.loan();//override
        b.credit();//override
        b.debit();//override
        //b.funds(); we can not call it because it is not from parent class//it is from child class//not override

      //  Bank bnk = new Bank(); //we can not create the object of abstract classes

        BofA account = new BofA();
        account.moneyTransfer();
        account.loan(); //override method



    }
}
