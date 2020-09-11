package com.comparableexecution;

import java.util.Comparator;
import java.util.List;

public class MovieRankingComparator_String implements Comparator<MovieRanking> {
    @Override
    public int compare(MovieRanking o1, MovieRanking o2) {
        return o1.getMovie_name().compareTo(o2.getMovie_name());
    }
}
