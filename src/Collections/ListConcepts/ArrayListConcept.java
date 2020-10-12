package Collections.ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        int[] a = new int[3]; //static array//size is fixed

        //dynamic array---ArrayList
        //-->it can contain duplicate values/elements
        //-->2.it maintains insertion order
        //-->3.it is Synchronized (means slow)//it is not Thread safe
        //-->4.it allows random access to fetch the element because it stores the values on the basis od indexes

        ArrayList ar = new ArrayList(); // non generic arrayList

        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);

        System.out.println(ar.size()); //4

        ar.add(50);
        ar.add(60);
        ar.add(60);
        ar.add(12.33);
        ar.add("Test");
        ar.add('a');
        ar.add(true);

        System.out.println(ar.size()); //7 //size of arrayList

        System.out.println(ar.get(4)); //50 //to get value from an index

        //to print all the values from arrayList  :
        // 1.for loop
        //2.using iterator

        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }

        System.out.println();

        //non generic VS generics:


        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(100);
        //  ar1.add("sos"); you can not define string in Integer // because it is generic ArrayList


        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Agit");
        //  ar2.add(100);you can not define  Integer  in string  // because it is generic ArrayList
        ar2.add("muho");

        // ArrayList<E>ar3 = new ArrayList();

        //Employee class objects:
        Employee e1 = new Employee("Agit", 30, "QA");
        Employee e2 = new Employee("Muho", 20, "Tester");
        Employee e3 = new Employee("Veso", 30, "QA");


        //create arrayList:

        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //iterator to traverse the values:

//        Iterator<Employee> it = ar4.iterator();
//        while (it.hasNext()) {
//            Employee emp = it.next();
//            System.out.println(emp.name);
//            System.out.println(emp.age);
//            System.out.println(emp.department);
//        }

        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext()){
            System.out.println(it.next().name);

        }

        System.out.println("==============");

        for(Employee emp : ar4){
            System.out.println("inside enhanced for loop "+emp.name);
            System.out.println("inside enhanced for loop "+emp.age);
            System.out.println("inside enhanced for loop "+emp.department);
        }


        System.out.println("===========================================================");
        //***************************************
        //addAll()

        ArrayList<String> ar5 = new ArrayList<>();
        ar5.add("dev");
        ar5.add("Java");
        ar5.add("JavaScript");

       ArrayList<String> ar6 = new ArrayList<>();
       ar6.add("test");
       ar6.add("test Cases");
       ar6.add("AC");

       ar5.addAll(ar6);

       for(int i=0; i<ar5.size(); i++){
           System.out.println(ar5.get(i));
       }
        System.out.println("=================");
       //removeAll

        ar5.removeAll(ar6);

        for(int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));
        }

        System.out.println("=========================");

        //retainAll
        ArrayList<String> ar7 = new ArrayList<>();
        ar7.add("test");
        ar7.add("Java");
        ar7.add("JavaScript");

        ArrayList<String> ar8 = new ArrayList<>();
        ar8.add("test");
        ar8.add("Cases");
        ar8.add("AC");

        ar7.retainAll(ar8);

        for(int i=0; i<ar7.size(); i++){
            System.out.println(ar7.get(i));
        }



    }
}
