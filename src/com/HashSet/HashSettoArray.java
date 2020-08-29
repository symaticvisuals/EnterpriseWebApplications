package com.HashSet;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSettoArray {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        Scanner s = new Scanner(System.in);
        int [] arr = new int[40];
        int n =5;
        while (n-- > 0)
        {
            link.add(s.nextInt());
        }
        Iterator<Integer> itr = link.iterator();
        int i=0;
        while (itr.hasNext())
        {
        arr[i]= itr.next();
        i++;
        }
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[i]);
        }
    }
}
