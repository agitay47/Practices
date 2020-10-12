package Interface.Example1;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBank.min_bal);//call static veriable with classname
       // USBank.min_bal =200;  //Cannot assign a value to static variable 'min_bal'//its final in nature

        HSBCBank hs = new HSBCBank();//compile time polymorphism
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.educationLoan();
        hs.carLoan();

        System.out.println("==============================================");

        //dynamic polymorphism: child class object can be refer by parent Interface reference variable

        USBank b=new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();











    }
}
