package MethodOverloading;

public class Combine2Arrays_WithOverloading {
    public static void main(String[] args) {

    }
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] combArray = new int[arr1.length + arr2.length];

        int k = 0;
        for (int each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (int each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2Arrays(double[] arr1, double[] arr2) {
        double[] combArray = new double[arr1.length + arr2.length];

        int k = 0;
        for (double each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (double each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2Arrays(String[] arr1, String[] arr2) {
        String[] combArray = new String[arr1.length + arr2.length];

        int k = 0;
        for (String each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (String each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2Arrays(char[] arr1, char[] arr2) {
        char[] combArray = new char[arr1.length + arr2.length];

        int k = 0;
        for (char each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (char each : arr2) {
            combArray[k] = each;
            k++;
        }
    }
}