package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class quiz {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));

        //int a=1; //index [1, 3]
        Integer a=1; //object [2, 3]
        list1.remove(a);

        boolean r1 = list1.remove(a);
        System.out.println(list1); //[1, 3]
        System.out.println(r1); //false

        System.out.println("===============================================================");
        String [] names = {"Rob","Bran","Rick","Bran"};

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        if(nameList.remove("Bran")){
            nameList.remove("John");
        }


        System.out.println(nameList);

        System.out.println("===============================================================");

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Green","Red","Blue","Yellow"));
        colors.add(3,"Cyan");

        System.out.println(colors); //[Green, Red, Blue, Cyan, Yellow]

        System.out.println("==================================================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));

      //  list2.set(0,list2.get(4));
       // list2.set(4,list2.get(0)); //[5, 2, 3, 4, 5]

        Collections.swap(list2,0,list2.size()-1);

        System.out.println(list2); //[5, 2, 3, 4, 1]


        System.out.println("===========================================================================");

        ArrayList<Character> list = new ArrayList<>();
        for(char i='a'; i<='z'; i++){
            list.add(i);
        }

        System.out.println(list);//[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]

        boolean result = list.containsAll(Arrays.asList('a','c','D'));

        System.out.println(result); //false

        list.removeAll(Arrays.asList('g','l','r','s'));

        System.out.println(list); //[a, b, c, d, e, f, h, i, j, k, m, n, o, p, q, t, u, v, w, x, y, z]




    }
}
