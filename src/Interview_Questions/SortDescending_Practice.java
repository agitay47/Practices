package Interview_Questions;

import java.util.Arrays;

public class SortDescending_Practice {
    public static void main(String[] args) {

        int [] arr = {1,5,4,6,7,3,2,8,9,10};

        Arrays.sort(arr); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int [] descendingOrder = new int[arr.length]; //create new array for descending

        int k=arr.length-1; //it will count down from last index of arr
        for(int i=0; i<=arr.length-1; i++) {
            descendingOrder[i] = arr[k];
            k--;  //it will count down from last index of arr

        }

        System.out.println(Arrays.toString(descendingOrder)); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        System.out.println("=============================================================");

        int [] r = {10,20,40,50,30,70,60,80,90,100};

        Arrays.sort(r); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        //Lets create our new descending array

        int [] newDesc = new int[r.length];

        int n = r.length-1;
        for(int i=0; i<r.length; i++){
            newDesc[i] = r[n];
            n--;
        }
        System.out.println(Arrays.toString(newDesc)); //[100, 90, 80, 70, 60, 50, 40, 30, 20, 10]
    }
}
