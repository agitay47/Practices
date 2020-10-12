package ExceptionHandling;

public class ThrowsKeyword {

    public static void main(String[] args)/*throws ArithmeticException*/ {
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.sum();
        System.out.println("ABC");

    }

    public void sum() /*throws throws ArithmeticException*/{
       try {
           div();
       }catch (ArithmeticException e){

       }
    }

    public void div() throws ArithmeticException{
        int i = 9/0; //exception line
    }

    //Throwable is supper class of "Error" and "Exception"



}
