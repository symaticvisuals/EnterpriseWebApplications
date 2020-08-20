package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListQuestion<S> {
    public static void main(String[] args) {
        ArrayList<String> list2= new ArrayList<>();
        list2.add("Facebook");
        list2.add("Amazon");
        list2.add("Google");
        list2.add("Microsoft");
        list2.add("Apple");
        //Traversal Using Iterator
        Iterator<String> itr = list2.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        //Traversal Using a List Iterator
        ListIterator <String> listitr = list2.listIterator();
        while (listitr.hasNext())
        {
            System.out.println(listitr.next());
        }

        System.out.println();

        ListIterator <String> listitr1 = list2.listIterator();
        listitr1.next();
        listitr1.set("Microsoft");
        while (listitr1.hasNext())
        {
            System.out.println(listitr1.next());
        }
       //list2.clear();

        System.out.println(list2);

    }

}



