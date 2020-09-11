package com.HashSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("dictionary");
        HashSet<String> words = new HashSet<>();
        Scanner s = new Scanner(file);
        while (s.hasNext())
        {
            words.add(s.next());
        }
        File spellcheck = new File("input");
        Scanner spell = new Scanner(spellcheck);
        HashSet<String> spells = new HashSet<>();
        while (spell.hasNext())
        {
            if(words.contains(s.next()))
            {
                System.out.println();
            }
        }
    }


}
