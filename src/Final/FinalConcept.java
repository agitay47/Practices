package Final;

public class FinalConcept {
    public static void main(String[] args) {

        final int i = 10;  //constant values / we can not modify value of final variable
        //i = 20;
        //i = 30;
        //  System.out.println(i); //10
        // test1();//inside test1 method
        //inside catch block
        // inside finally block
        // test2();
        division();


    }

    public static void test1() {

        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        } catch (Exception e) {
            System.out.println("inside catch block");
        } finally {//it always execute//always use with try - catch blocks
            System.out.println("inside finally block");
        }
    }

    public static void test2() {
        try {
            System.out.println("inside test2");
        } finally { //it will execute always
            System.out.println("finally code in test2 method");
        }
    }

    public static void division() {
        int i = 20;
        try {
            System.out.println("inside try block");
            int k = i / 0;
        } catch (RuntimeException e) {
            System.out.println("inside catch block");
            System.out.println("divide by zero error");
        } finally {
            System.out.println("execute this code even after any exception");
        }

    }
}
/* final: is a Keyword
1. final can be used to mark a variable "unchangeable".
2. final can also make a method not "overrideable"
3. final can also make a class not "inheritable". i.e. the class can not be subclassed.

finally: is a Block
finally is used in a try/catch statement to execute code "always".

finalize: is a Method
finalize is called when an object is garbage collected. You rarely need to override it.
*/
