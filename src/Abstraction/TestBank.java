package Abstraction;

public class TestBank {
    public static void main(String[] args) {

        ICICIBank ic = new ICICIBank();//we can create object of subclass
        ic.educationLoan();
        ic.homeLoan();
        ic.carLoan();
        System.out.println();
        ic.credit();
        ic.debit();
        ic.transferMoney();
        ic.trading();
        System.out.println();
        ic.insurance();//from childclass
        ic.mutualFunds();//from childclass

        System.out.println(USBank.min_bal);//100

        USBank us = new ICICIBank();//dynamic polymorphism
        us.credit();
        us.debit();
        us.trading();
        us.transferMoney();

        RBI rb = new ICICIBank();//dynamic polymorphism
        rb.carLoan();
        rb.educationLoan();
        rb.homeLoan();







    }
}
