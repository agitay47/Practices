package Collections.SetConcept;
/* Java HashSet
Java HashSet class hierarchy
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
Difference between List and Set
A list can contain duplicate elements whereas Set contains unique elements only.*/

import java.util.*;

public class HahSetPractice {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println(set);

        System.out.println("=======================================");

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(20, 30, 10, 50, 40, 60));

        numbers.removeIf(integer -> integer > 50);

        System.out.println(numbers);

        System.out.println("============================================");

        //Creating HashSet and adding elements
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ravi");
        set1.add("Ajay");
        set1.add(null);
        //Traversing elements
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        System.out.println("=====================================================");

        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        h.remove("Australia");
        System.out.println(h);//[South Africa, India]

//        Iterator<String> it = h.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        for(String each : h){
            System.out.println(each);
        }

        System.out.println("==============================================================");

        HashSet<String> hs = new HashSet<String>();

        // Elements are added using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Print the contents on the console
        System.out.println("Initial HashSet " + hs);

        // Removing the element B
        hs.remove("B");

        // Print the contents on the console
        System.out.println("After removing element " + hs);

        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                + hs.remove("AC"));

//        Iterator<String> iterator = hs.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+","); //A,Geek,For,Geeks,Z,
//        }

        //or

        for(String each : hs){
            System.out.print(each+", "); //A, Geek, For, Geeks, Z,
        }
        System.out.println();

        System.out.println("=========================================================");

        // Instantiate an object of HashSet
        HashSet<ArrayList> set2 = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set2.add(list1);
        set2.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set2.size()); //1


        System.out.println("==================================================");

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); //[Volvo, Mazda, Ford, BMW]

        System.out.println("===================================================");

        Set<String> cars1 = new HashSet<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("BMW");
        cars1.add("Mazda");
        System.out.println(cars1); //[Volvo, Mazda, Ford, BMW]

        System.out.println("===================================================");
        Set<String> cars2 = new LinkedHashSet<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("BMW");
        cars2.add("Mazda");
        System.out.println(cars2); //[Volvo, BMW, Ford, Mazda]

        System.out.println("====================================================");

        Set<String> cars3 = new TreeSet<>();//
        cars3.add("Volvo");
        cars3.add("BMW");
        cars3.add("Ford");
        cars3.add("BMW");
        cars3.add("Mazda");
        System.out.println(cars3); //[BMW, Ford, Mazda, Volvo]


        for(String each : cars){//HashSet
            System.out.print(each+", ");//Volvo, Mazda, Ford, BMW,
        }
        System.out.println();
        System.out.println("=======================================");

        for(String each : cars1){//HashSet
            System.out.print(each+", ");//Volvo, Mazda, Ford, BMW,
        }
        System.out.println();
        System.out.println("=======================================");

        for(String each : cars2){//LinkedSet
            System.out.print(each+", ");//Volvo, BMW, Ford, Mazda,
        }
        System.out.println();
        System.out.println("=======================================");

        for(String each : cars3){//TreeSet
            System.out.print(each+", ");//BMW, Ford, Mazda, Volvo,
        }
        System.out.println();
        System.out.println("=======================================");














    }
}