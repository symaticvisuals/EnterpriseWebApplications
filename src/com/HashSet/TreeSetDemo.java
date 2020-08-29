package com.HashSet;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tree1 = new TreeSet<>();
        tree1.add(8);
        tree1.add(7);
        tree1.add(0);
        tree1.add(4);
        tree1.add(9);
        System.out.println(tree1);

        Iterator<Integer> itr = tree1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
