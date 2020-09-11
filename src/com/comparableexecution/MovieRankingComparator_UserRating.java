package com.comparableexecution;

import java.util.Comparator;

public class MovieRankingComparator_UserRating implements Comparator<MovieRanking> {
    @Override
    public int compare(MovieRanking o1, MovieRanking o2) {
        if(o1.getUser_rating() < o2.getUser_rating())
        {
            return -1;
        }
        else if (o1.getUser_rating() > o2.getUser_rating())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
