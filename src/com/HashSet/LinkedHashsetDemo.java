package com.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        //add elements to LinkedHashSet
       int n =5;
        System.out.println("Enter Elements for Link 1:  ");
        while (n-->0)
        {
            link.add(s.nextInt());
        }
        LinkedHashSet<Integer> link2 = new LinkedHashSet<>();
        System.out.println("Enter Elements for Link 2: ");
        n=5;
        while (n-->0)
        {
            link2.add(s.nextInt());
        }

//        Iterator<Integer> itr = link.iterator();
//        Iterator<Integer> itr2 = link2.iterator();
//        int max = Math.max(link.size(), link2.size());
//        if()
        link.retainAll(link2);
        System.out.println(link);

    }
}
