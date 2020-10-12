package Replits;

public class Replit_Array {
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(minValue(arr)); //should print -3
    }
    public static int minValue(int[] arr)
    {
     int min=arr[0];
     for(int i=0; i<arr.length; i++){
         if(arr[i]<min){
             min=arr[i];
         }
     }
     return min;
    }
}
