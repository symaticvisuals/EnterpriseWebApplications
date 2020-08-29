package com.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(21);
        link.add(25);
        link.add(30);
        link.add(33);
        link.add(35);
        System.out.println(link);
        System.out.println();
        Iterator<Integer> itr = link.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
