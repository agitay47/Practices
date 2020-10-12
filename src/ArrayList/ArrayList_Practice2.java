package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,5,3,7));
        System.out.println(numbers);

        ArrayList<Integer> twice = new ArrayList<>();

        twice.set(numbers.size(),numbers.size()*2);

        System.out.println(twice);

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers){

        for(int i=0; i<numbers.size(); i++){
            numbers.set(i,i);
        }

        return numbers;


    }

}
