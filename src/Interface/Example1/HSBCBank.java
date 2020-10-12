package Interface.Example1;

public class HSBCBank implements USBank, BrazilBank {//we are achiving multiple inheretance
    //is-a relationship-->interface


    //if a class is implementing any interface, then it is mandatory to define/ override all methods of Interface
    //overriding from USBank
    @Override
    public void credit() {
        System.out.println("hsbc---credit");//implemantation
    }

    @Override
    public void debit() {
        System.out.println("hsbc---debit");//implemantation
    }

    @Override
    public void transferMoney() {
        System.out.println("hsbc---transfer money");//implemantation
    }

    //seperate mathed of HSBCBank
    public void educationLoan() {
        System.out.println("hsbc---eduloan");
    }

    public void carLoan() {
        System.out.println("hsbc---Car loan");
    }

    //overriding from brazilBank Interface
    @Override
    public void mutualFund() {//overriding from brazilBank Interface
        System.out.println("hsbc---mutualFund");
    }
}
