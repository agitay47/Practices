package ExceptionHandling;

public class SampleExection {
    public static void main(String[] args) {
      //  String str= null;
       // System.out.println(str.length());

        try{
            int a=30, b=0;
            int c=a/b;
            System.out.println("result ="+c);
        }catch (ArithmeticException e){
            System.out.println("Cant divide a number by zero");
        }

        try{
        int num = Integer.parseInt("Edureka");
        System.out.println(num);}catch (NumberFormatException e){
            System.out.println("Number Format Exception");
        }

        try {
            int a[] = new int[5];
            a[7] = 9;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds");
        }
    }
}
