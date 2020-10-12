package CollectionCybertek;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice {
    /*
    Tasks:
 1. write a program that can remove the duplicated characters from String and store them into variable
 2. write a program that can identify if two strings are build out of the same letters
 		ex:
 			str1 = "abababa";  //ab ==> ab
 			str2 ="baba";     // ba ==> ab
 			output: true
     */

    public static void main(String[] args) {
//        String str = "ABABABCDEF";// ABCDEF
//        String[] arr = str.split("");
//        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(", ", "");
//        System.out.println(str); //[ABCDEF]


        String str = "ABABABCDEF";// ABCDEF
        String[] arr = str.split("");
        str = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(arr))) {
            str += each;
        }
        System.out.println(str); //ABCDEF
        //    System.out.println(Arrays.asList(str)); //[ABCDEF]



        /*
        String str = "ABABABCDEF";// ["A", "B", "C", 'D', 'E', 'F']
        String[] arr = str.split("");
        LinkedHashSet<String> ls = new LinkedHashSet<>( Arrays.asList(arr) );
        System.out.println( ls );
        //ABCDEF
        String result ="";
        for(String each  : ls  ){
            result += each;
        }
        System.out.println(result);
        */


        System.out.println("============================================");
        /*
        String str1 = "ababababC";
        String str2 = "baba";
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        TreeSet<String> t1 = new TreeSet( Arrays.asList(arr1) );
        TreeSet<String> t2 = new TreeSet( Arrays.asList(arr2) );
        System.out.println(t1);
        System.out.println(t2);
        str1 = t1.toString();
        str2 = t2.toString();
        System.out.println( str1.equals(str2) );
         */

        String str1 = "ababababC"; // abC
        String str2 = "baba";  // ab

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));

        System.out.println("===================Practice_ArrayList=====================================");

        String s = "KLKLKLMNMNMN";   //remove duplicates
        String[] arr2 = s.split("");

        s = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(arr2))) {
            s += each;
        }
        System.out.println(s); //KLMN

        System.out.println("===============================================");

        String s2 = "AAAAAAAAAABBBBBB";
        String[] arr3 = s2.split("");

        s2 = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(arr3))) {

            s2 += each;
        }
        System.out.println(s2); //AB

        System.out.println("====================================================");

        String s3 = "1111112222222222333";
        String [] arr4 = s3.split("");

        s3="";

        for(String each : new LinkedHashSet<>(Arrays.asList(arr4))){
            s3 +=each;
        }
        System.out.println(s3); //123

        System.out.println("================================================================================");

        String st1 = "abcabc";
        String st2 = "cab";

        st1 = new TreeSet<>(Arrays.asList(st1.split(""))).toString();
        st2 = new TreeSet<>(Arrays.asList(st2.split(""))).toString();

        System.out.println(st1.equals(st2)); //true

        System.out.println("======================================================================");

        String a = "xyxxyxzzz";
        String b = "xxxxxxxxxyz";

        a = new TreeSet<>(Arrays.asList(a.split(""))).toString();//will choose only unique
        b = new TreeSet<>(Arrays.asList(b.split(""))).toString();// will choose only unique

        System.out.println(a.equals(b)); //true


    }


}
