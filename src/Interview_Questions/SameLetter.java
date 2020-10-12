package Interview_Questions;

import java.util.Arrays;

public class SameLetter {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abd";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        String a1="";
        String a2="";

        for(char each: ch1){

            a1 +=each;
        }

        for(char each: ch2){

            a2 +=each;
        }
        // System.out.println(a1==a2); //false
        System.out.println(a1.equalsIgnoreCase(a2)); //false


    }
}
