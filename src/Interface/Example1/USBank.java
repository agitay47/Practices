package Interface.Example1;

public interface USBank {

    int min_bal = 100;

    public void credit();

    public void debit();

    public void transferMoney();

    //only method declaration
    //no method body--only method prototype
    //in interface, we can declare the variables, variables are by default static in nature
    //variables value will not be change
    //no static method in interface
    //no main method
    //we cannot create object of interface
    //interface is abstract in nature//incomplete


}
