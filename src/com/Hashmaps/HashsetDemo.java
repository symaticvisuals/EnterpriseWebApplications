package com.Hashmaps;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String>  auto = new HashSet<>();

        //adding elements inside a hashset
        auto.add("BMW");
        auto.add("Jeep");
        auto.add("Maruti Suzuki");
        auto.add("Jaguar");
        auto.add("Porche");
        auto.add("Toyota");

        //printing the elements
        System.out.println("Elements: "+auto);
    }
}
