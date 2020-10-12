package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class sorted {
    public static void main(String[] args) {
        double [] arr ={16.1, 12.3, 22.2, 14.4};
        System.out.println(isSorted(arr));

    }

    public static boolean isSorted (double [] arr){

       for(int i=0; i<arr.length-1; i++){
           if(arr[i]>arr[i+1]){
               return false;

           }
       }
        return true;

    }
}
