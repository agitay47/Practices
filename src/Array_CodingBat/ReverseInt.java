package Array_CodingBat;

import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {

        int [] nums = {1,2,3};

        int[] myArray = new int[3];

        myArray[0] = nums[2];

        myArray[1] = nums[1];

        myArray[2] = nums[0];

        System.out.println(Arrays.toString(myArray)); //[3, 2, 1]

        System.out.println("=============================================");

        int [] numbers = {1,2,3,4,5,6,7};

        String s= ""+numbers;
        String reverse="";

        for(int i=numbers.length-1; i>=0; i--){
            reverse +=numbers[i];
        }

        System.out.println(Arrays.toString(new String[]{reverse}));


    }

}
