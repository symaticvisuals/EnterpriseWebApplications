package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListDemo {

    public static void main(String[] args) {
	// write your code here
//        ArrayList <Integer>list = new ArrayList<>();
//        ArrayList <String > list2 = new ArrayList<>();
//        //adding elements into an arraylist
//
//
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//
//
//        list2.add("Facebook");
//        list2.add("Amazon");
//        list2.add("Google");
//        list2.add("Microsoft");
//        list2.add("Apple");
//
//
//        System.out.print("Elements inside ArrayList 1: ");
//
//        for(int values: list)
//        {
//            System.out.print(values+" ");
//        }
//
//        System.out.println();
//        System.out.print("Elements inside ArrayList 2: ");
//
//        for(String companies: list2)
//        {
//            System.out.print(companies+" ");
//        }
//
//        System.out.println();
//        //System.out.print(list);
//
//        //Generic ArrayList
////        ArrayList list3 = new ArrayList();
////        list3.add("Hello");
////        list3.add(4);
////        list3.add(5.0);
////        System.out.println();
////        System.out.println(list3);
//
//        //adding element through index
//        list.add(2,9);
//        System.out.println(list);
//
//        list2.add(2, "Tesla");
//        System.out.println(list2);
//
//        list.remove(2);
//        System.out.print("Updated Elements: ");
//        System.out.println(list);
//
//        list2.remove("Amazon");
//        System.out.println(list2);
//
//        System.out.println("Size of ArrayList 1: "+list.size());
//
        Scanner s = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.print("Enter number of users want to insert: ");
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            users.add(new User(s));
        }



        for (User user:users) {
            System.out.print(user.getName()+" "+ user.getAge());
            System.out.println();
        }

//        Iterator itr = users.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next().);
//        }


    }
}

//Create a class User ---> contains name & age. Create appropriate getters & setters method
//Add this user object into an ArrayList and display the details of all users.
