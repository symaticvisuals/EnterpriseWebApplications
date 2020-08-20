package LinkedListQues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ques {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();

        list.add("Mr.Robot");
        list.add("Friends");
        list.add("Breaking Bad");
        list.add("GOT");
        list.add("Money Heist");
        list.add("Gotham");

        System.out.println(list);

        ListIterator<String> itr = list.listIterator();
        itr.next();
        itr.set("Super Natural");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
       while (itr.hasPrevious())
       {
           System.out.println(itr.previous());
       }

    }
}
