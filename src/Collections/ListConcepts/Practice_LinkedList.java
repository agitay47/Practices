package Collections.ListConcepts;

import java.util.*;

public class Practice_LinkedList {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.addAll(Arrays.asList("Ahmet","Suleyman","Murat","Abdullah"));

        Collections.sort(names);

        for(String each : names){
            System.out.print(each+" : ");
        }
        System.out.println();

        names.remove(1);
        names.remove("Murat");
        System.out.println(names.isEmpty());//false
        System.out.println(names);//[Abdullah, Suleyman]

        System.out.println("===============================================");

        ArrayList<Integer> numbers = new ArrayList<>();//can add duplicate elements
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,10,9,11,13,12,1,2,3,4,5,6,6));

        System.out.println(numbers);

        numbers.removeIf(p->p<7);

        Collections.sort(numbers);

        numbers.remove(6);
        numbers.remove(0);


        System.out.println(numbers);
        System.out.println(numbers.size());//5

        System.out.println("=======================================================");

        LinkedList<String> ll = new LinkedList<>();

        //add:
        ll.add("test");
        ll.add("qtbp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        System.out.println(ll);//[test, qtbp, selenium, RPA, RFT]

        //addfirst:
        ll.addFirst("Agit");
        //addlast
        ll.addLast("Sipel");

        System.out.println(ll);//[Agit, test, qtbp, selenium, RPA, RFT, Sipel]

        //get:
        System.out.println(ll.get(0));//Agit

        //set:
        ll.set(0,"Tom");
        System.out.println(ll.get(0)); //Tom

        //remove first and last element

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); //[test, qtbp, selenium, RPA, RFT]

        ll.remove(2);
        System.out.println(ll);//[test, qtbp, RPA, RFT]


        //how to print all the value of LinkedList:
        //for loop
        System.out.println("Using for loop");
        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }


        //advance for loop
        System.out.println("Using advance for loop");

        for(String str : ll){
            System.out.println(str);
        }

        //iterator

        System.out.println("using iterator");

        Iterator<String> it = ll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("using while loop");
        //while loop
        int num=0;
        while (ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }
















    }
}
