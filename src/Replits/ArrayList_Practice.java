package Replits;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(twoTimes(arr));

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer>arr){
        ArrayList<Integer> newarr = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            newarr.add(arr.get(i));
            newarr.add(arr.get(i));
        }
        return newarr;
    }
}
