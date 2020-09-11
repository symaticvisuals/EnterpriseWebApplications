package com.comparableexecution;

import com.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class TestMovies {
    public static void main(String[] args) {
        List<MovieRanking> list = new ArrayList<>();
        list.add(new MovieRanking("GodFather",9, 90));
        list.add(new MovieRanking("EndGame",8, 85));
        list.add(new MovieRanking("Star Wars",7, 78));
        list.add(new MovieRanking("Inception",9, 95));
        list.add(new MovieRanking("Avtaar",6, 73));
        System.out.println("Movie Ratings before Sorting: \n"+list);
        System.out.println();
//        Collections.sort(list);
//        System.out.println("Movie Ratings After Sorting: \n"+list);

//        MovieRankingComparator_String name = new MovieRankingComparator_String();
//        MovieRankingComparator_UserRating rating = new MovieRankingComparator_UserRating();
//        MovieRankingComparator_Critics critics = new MovieRankingComparator_Critics();
//
//        System.out.println("On the basis of name");
//        Collections.sort(list,name);
//        System.out.println(list);
//
//        System.out.println("On the basis of rating");
//        Collections.sort(list,rating);
//        System.out.println(list);
//
//        System.out.println("On the basis of critics");
//        Collections.sort(list,critics);
//        System.out.println(list);
        Comparator<MovieRanking> name = new Comparator<MovieRanking>() {
            @Override
            public int compare(MovieRanking o1, MovieRanking o2) {
                return o1.getMovie_name().compareTo(o2.getMovie_name());
            }

        };

        System.out.println("On the basis of name");
        Collections.sort(list,name);
        System.out.println(list);

    }

}
