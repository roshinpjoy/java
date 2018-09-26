package Collections;

import java.util.PriorityQueue;

public class Prque {
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue();

        pq.offer(10);
        pq.offer(5);
        pq.offer(6);
        pq.offer(8);
        pq.offer(1);


        for (Integer q:pq)
        {
            System.out.println(q);
        }

        Integer i=pq.poll();
        System.out.println(i);

        System.out.println("after pol");

        for (Integer s:pq)
        {
            System.out.println(s);
        }


        System.out.println("-------------------");
        Integer p=pq.peek();
        System.out.println(p);

        System.out.println("after peek");

        for (Integer sp:pq)
        {
            System.out.println(sp);
        }


    }


}
