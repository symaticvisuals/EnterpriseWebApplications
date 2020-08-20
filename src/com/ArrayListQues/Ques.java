package com.ArrayListQues;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ques {
    public static void main(String[] args) throws FileNotFoundException {
      File file = new File("input");
      ArrayList<String> list = new ArrayList<>();
      Scanner s = new Scanner(file);
      while (s.hasNext())
      {
          list.add(s.next());
      }
        display(list);

      ArrayList reversed =displayrev(list);

        System.out.println();
        display(reversed);

        System.out.println();
      findplural(list);
    }

    private static void findplural(ArrayList<String> list) {
       ListIterator<String> itr = list.listIterator();
       while (itr.hasNext())
       {
           String str = itr.next();
           if(str.endsWith("s")) {
               itr.remove();
           }
       }
        System.out.println(list.size());
    }


    private static ArrayList displayrev(ArrayList<String> list) {

        ArrayList<String> reverse = list;
        Collections.reverse(reverse);
        return reverse;

    }


    public static void display(ArrayList<String> list)
    {
        for (String s : list) {
            System.out.print(s + "  ");
        }
    }
}
