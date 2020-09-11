package com.Hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //Insert elements inside Map
        map.put(102,"India");
        map.put(103,"Taiwan");
        map.put(104,"Germany");
        map.put(105,"United States");
        map.put(106,"England");

        //printing Hashmap
        System.out.print("Elements inside HashMaps: ");
        System.out.println(map);

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("Microsoft","Windows 10");
        map2.put("Apple","iPhone");
        map2.put("Samsung","Galaxy Note");
        map2.put("Asus","ROG Phone");
        map2.put("Intel","Processor");
        map2.put("AMD","Ryzen 5");
        map2.put("Qualcomm","Snapdragon");

        System.out.println("Elements inside Map 2: "+map2);

        //Accessing Elements inside maps
        System.out.println();
        System.out.println(map2.entrySet());

        System.out.println();
        System.out.println(map2.keySet());

        System.out.println();

        //Traversal using for each
        for(Map.Entry<String,String> entry : map2.entrySet())
        {
            System.out.println(entry+",");
        }

        for (String value:map2.keySet()) {
            System.out.print(map2.get(value)+" ");
        }
        System.out.println();
        System.out.println();
        //Iterator traversal
        System.out.println("Iterator Traversal: ");
        Iterator<Map.Entry<String, String>> itr = map2.entrySet().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next().toString());
        }
    }
}
