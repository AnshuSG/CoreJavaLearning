package src.collections_03_feb;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab195196 {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();
        pq1.offer(90);
        pq1.offer(12);
        pq1.offer(67);
        pq1.offer(40);
        pq1.offer(50);
//        pq1.offer(null);
        System.out.println(pq1);


        Queue integerQueue = new PriorityQueue<>();
        integerQueue.add("A");
        integerQueue.add("B");
        integerQueue.add("C");
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);
        Iterator it = integerQueue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }


    }
}
