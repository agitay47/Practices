package Group10;
/* 3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}*/

import java.util.ArrayList;
import java.util.Arrays;

public class Interview {
    public static void main(String[] args) {


        int [] numbers = {1,1,2,3,3,4,5,5};

       unique(numbers);

        //1. create a method that can print out the unique numbers from an array of integer




    }
    public static void unique(int [] nums){

        for(int each : nums){
            int count=0;
            for(int in : nums){

                if(each==in){
                    count++;
                }
                
            }
            if(count==1){

                System.out.println(each);
            }

        }

        System.out.println("======================================================================");


        System.out.println("===================================");
        String str = "jav34ajs4jk6";
        int sum=0;
        for(char ch: str.toCharArray() ){
            if( Character.isDigit(ch) ){
                sum+=Integer.parseInt(""+ch);
            }
        }
        System.out.println(sum);
    }






}

