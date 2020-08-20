package QueuePrograms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //inserting elements in Queue
        queue.add("Apple");
        queue.add("Samsung");
        queue.add("OnePlus");
        queue.add("Asus");
        queue.add("RealMe");

        System.out.println(queue);

        for (String str:queue) System.out.println(str);
    }
}
