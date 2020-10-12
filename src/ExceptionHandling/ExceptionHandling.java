package ExceptionHandling;

public class ExceptionHandling {
    int a=10;
    public static void main(String[] args) {
     //   int i = 9/0;  //uncaught exception // unchecked // we dont know if it will compile or not
      //  System.out.println(i);

        //caught exception:
      //  Thread.sleep(2000); // it gives compile error so we can caught it// checked

        //int a = 10;
      //  ExceptionHandling obj = null;
       // ExceptionHandling obj = new ExceptionHandling();
     //   obj = null;
        //System.out.println(obj.a); //NullPointerException

        //1. try - catch block :
        try {
            int i = 9 / 0; //this code throw an exception
        }
        catch(ArithmeticException e){//instead of ArithmeticException I can write Throwable or Exception
          e.printStackTrace();//java.lang.ArithmeticException: / by zero
           // at ExceptionHandling.ExceptionHandling.main(ExceptionHandling.java:20)
            //it used when we have to report something/ problem / bugs
            System.out.println(e.getMessage());/// by zero
            System.out.println("hey---this/ by zero error");
        }

        System.out.println("ABC");

        //Throwable is supper class of "Error" and "Exception"







    }
}
