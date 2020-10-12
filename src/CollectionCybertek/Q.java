package CollectionCybertek;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>(); // FIFO
        q.add("D");
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);

        String str =  q.poll(); //A
        System.out.println(str );

        System.out.println(q);

        //System.out.println(q.get(0));



    }
}