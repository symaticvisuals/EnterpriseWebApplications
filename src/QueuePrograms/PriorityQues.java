package QueuePrograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(999);
        queue.add(584);
        queue.add(108);
        queue.add(855);
        queue.add(120);

        System.out.println(queue);

        System.out.println(queue.poll());

        //Iteration over the Priority Queue
        for (Integer integer : queue) System.out.print(integer+" ");

        System.out.println();
        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

        PriorityQueue<String>pqueue = new PriorityQueue<>();
        pqueue.add("John");
        pqueue.add("Ram");
        pqueue.add("Harry");
        pqueue.add("Anuj");
        pqueue.add("Kartik");
        pqueue.add("Anjali");
        System.out.println();
        System.out.println(pqueue);

    }
}
