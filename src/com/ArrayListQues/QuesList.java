package com.ArrayListQues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class QuesList {
    public static void main(String[] args) {


        LinkedList<String> staff = new LinkedList<String>();
        ListIterator<String> iterator = staff.listIterator();
        iterator.add("Tom");
        iterator.add("Diana");
        iterator.add("Harry");
        iterator = staff.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Romeo");
        iterator.next();
        iterator.add("Juliet");
        iterator = staff.listIterator();
        iterator.next();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
