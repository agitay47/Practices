package Abstraction;

public class ICICIBank implements USBank, RBI{


    @Override//RBI interface
    public void educationLoan() {
        System.out.println("ICICI--Edu Loan");//subclass providies body and new implementation

    }

    @Override//RBI interface
    public void homeLoan() {
        System.out.println("ICICI--Home Loan");
    }

    @Override//RBI interface
    public void carLoan() {
        System.out.println("ICICI--Car Loan");
    }

    @Override//USBank interface
    public void debit() {
        System.out.println("USBank--Debit");
    }

    @Override//USBank interface
    public void credit() {
        System.out.println("USBank--Credit");
    }

    @Override//USBank interface
    public void transferMoney() {
        System.out.println("USBank--Transfer Money");
    }

    @Override//USBank interface
    public void trading() {
        System.out.println("USBank--Trading");
    }

    //ICICI Bank class methods:
    public void mutualFunds(){
        System.out.println("ICICI--mutual funds");
    }
    //ICICI Bank class methods:
    public void insurance(){
        System.out.println("ICICI--insurance");
    }
}
