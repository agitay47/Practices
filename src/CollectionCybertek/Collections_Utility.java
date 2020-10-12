package CollectionCybertek;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
        Collections.sort(list1);
        System.out.println(list1);//[4, 5, 6, 7, 8, 9, 10]

        System.out.println("===================================");
        //     1. write a program that can remove the duplicates for arraylist and print out in sorted asc order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        //1,2,3,4,5,6,7
        nums = new ArrayList<>(new TreeSet<>(nums));

        System.out.println(nums); //[50, 100, 200, 300, 2000]

        System.out.println("====================================");
        // 2. write a program that can removed the duplicates from an arraylist. DO NOT change the order
        //   [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 4));
        list = new ArrayList<>(new LinkedHashSet<>(list));//Java LinkedHashSet class contains unique elements only like HashSet.
        System.out.println(list); //[6, 5, 4]


        System.out.println("==================================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "B", "C", "B", "D"));

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result); //true


        System.out.println("=========================================");

        List<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,20,30,40,50,50));

        list2 = new ArrayList<>(new TreeSet<>(list2));

        System.out.println(list2);

        System.out.println("==========================================");

        List<String> letters2 = new ArrayList<>();

        letters2.addAll(Arrays.asList("A","A","B","C","C","D"));

        boolean result1 = Collections.frequency(letters2,"A")==1; //false

        letters2 = new ArrayList<>(new TreeSet<>(letters2));

      //  boolean result1 = Collections.frequency(letters2,"A")==1; //true

        System.out.println(result1);
        System.out.println(letters2); //[A, B, C, D]
    }
}