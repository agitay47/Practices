package CollectionCybertek;

import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");//will add
        names.add("Ozgur");//wont add
        names.add("Ozgur");//wont add
        names.add("Ozgur");//wont add

        System.out.println(names);//[Sha, Zuura, Saban, Ozgur]

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1); //[A, C, B]

        //  System.out.println( set1.get(1) );

        System.out.println("=========================================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);//[5, 6, 7, 8, 9, 10]

        System.out.println("==========================");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet); //[null]

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);





    }

}
