package src.collections_03_feb;

import java.util.PriorityQueue;
import java.util.Queue;

public class lab194 {
    public static void main(String[] args) {
        Queue pq1 = new PriorityQueue();
        pq1.offer(89);
        pq1.offer(20);
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(40);
        //pq1.offer(null);

        pq1.add(90);
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);
        System.out.println(pq1.offer(34));
        System.out.println(pq1);

    }
}
