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
        while (s.hasNext())
        {
            spellchecking(spell.next(),words);
        }
    }

    private static String spellchecking(String nex, HashSet<String> words) {
        ArrayList<String> matches = new ArrayList<>();
        Iterator<String> itr = words.iterator();
        int i=0;
        while (itr.hasNext())
        {

            String match = itr.next();
            //if(match.startsWith(nex.charAt(i)))
            {

            }
        }
    }
}
