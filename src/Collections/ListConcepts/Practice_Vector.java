package Collections.ListConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Practice_Vector {
    public static void main(String[] args) {
        //Practice_Vector implements a dynamic array. It is similar to ArrayList, but with two differences −
        //Practice_Vector is synchronized.
        //Practice_Vector contains many legacy methods that are not part of the collections framework.

        //Practice_Vector proves to be very useful if you don't know the size of the array in advance or you just need one that can change sizes over the lifetime of a program

        Vector<Integer> nums = new Vector<>();
        nums.addAll(Arrays.asList(10,10,20,20,40,50,60));
        System.out.println(nums);

        System.out.println(Collections.frequency(nums,10));//2

        System.out.println("==================================================");

        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        Vector v1 = new Vector(4,5);

        v1.add("Agit");
        v1.add("Ahmet");
        v1.add("mehmet");
        v1.add("nuri");
        v1.add("xalo");
        v1.add("cihat");
        v1.add("nuri");
        v1.add("xalo");
        v1.add("cihat");
        v1.add("xalo");
        v1.add("cihat");

        System.out.println(v1.size());
        System.out.println(v1.capacity());







    }
}
