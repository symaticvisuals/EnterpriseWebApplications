package com.comparableexecution.Q10;

import com.comparableexecution.MovieRanking;

import java.util.Collections;
import java.util.Comparator;

public class Checker implements Comparator<Player>{


    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
