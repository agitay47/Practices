package MethodOverloading;
/* Assignments:
tasks2:
    1. create a method that can combine 2 arrays of integers
    2. create a method that can combine 2 arrays of double
    3. create a method that can combine 2 arrays of String
    4. create a method that can combine 2 arrays of char
    first solution: DO NOT use method overloading
    second solution: apply method overloading
*/

public class Combine2Arrays_WithoutOverloading {
    public static void main(String[] args) {



    }
    public static int[] combine2ArraysInts(int[] arr1, int[] arr2){
        int[] combinedArray = new int[arr1.length + arr2.length];

        int i=0;
        for(int each : arr1){
            combinedArray[i] = each;
            i++;
        }
        for( int each : arr2){
            combinedArray[i] = each;
            i++;
        }
        return combinedArray;
    }

    public static double[] combine2ArraysDouble(double[] arr1, double[] arr2){
        double[] combinedArray = new double[arr1.length + arr2.length];

        int i=0;
        for(double each : arr1){
            combinedArray[i] = each;
            i++;
        }
        for( double each : arr2){
            combinedArray[i] = each;
            i++;
        }
        return combinedArray;
    }
    public static String[] combine2ArraysString(String[] arr1, String[] arr2){
        String[] combinedArray = new String[arr1.length + arr2.length];

        int i=0;
        for(String each : arr1){
            combinedArray[i] = each;
            i++;
        }
        for( String each : arr2){
            combinedArray[i] = each;
            i++;
        }
        return combinedArray;
    }
    public static char[] combine2ArraysChars(char[] arr1, char[] arr2){
        char[] combinedArray = new char[arr1.length + arr2.length];

        int i=0;
        for(char each : arr1){
            combinedArray[i] = each;
            i++;
        }
        for( char each : arr2){
            combinedArray[i] = each;
            i++;
        }
        return combinedArray;
    }
}
