package Collections.QueueConcept;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public static void main(String[] args) {

        //Java Queue interface orders the element in FIFO(First In First Out) manner.
        // In FIFO, first element is removed first and last element is removed at last.
        //Accept duplicates
        //does not have index number
        //poll(); removes the first object that's inserted

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        q1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(q1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int firstObject = q1.poll();

        System.out.println(q1);//[2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        q1.poll();

        System.out.println(q1);//[3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        //  q1.get(2); // queue has no index numbers

        System.out.println("===============================================");

        Queue<String> queue=new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println(queue); //[Amit, Jai, Karan, Vijay, Rahul]

        queue.poll();

        System.out.println(queue); //[Jai, Rahul, Karan, Vijay]

        queue.poll();

        System.out.println(queue); //[Karan, Rahul, Vijay]

        queue.remove("Vijay");

        System.out.println(queue); //[Karan, Rahul]

        queue.add("Agit");

        System.out.println(queue); //[Agit, Rahul, Karan]

        System.out.println("==========================================================");

        Queue<Integer> c1 = new ArrayDeque<>();

        c1.addAll(Arrays.asList(100,200,300,400,500));

        System.out.println(c1);

        c1.poll();
        System.out.println(c1); //[200, 300, 400, 500]

        c1.poll();
        System.out.println(c1);//[300, 400, 500]

        c1.add(600);
        System.out.println(c1);//[300, 400, 500, 600]

        c1.poll();
        System.out.println(c1);//[400, 500, 600]





    }
}
