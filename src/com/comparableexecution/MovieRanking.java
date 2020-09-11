package com.comparableexecution;

import javax.swing.*;

public class MovieRanking  // Comparable<MovieRanking>
 {
    String movie_name;
    int user_rating;
    int critics_score;

    public MovieRanking(String movie_name, int user_rating, int critics_score) {
        this.movie_name = movie_name;
        this.user_rating = user_rating;
        this.critics_score = critics_score;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setUser_rating(int user_rating) {
        this.user_rating = user_rating;
    }

    public void setCritics_score(int critics_score) {
        this.critics_score = critics_score;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public int getUser_rating() {
        return user_rating;
    }

    public int getCritics_score() {
        return critics_score;
    }

    @Override
    public String toString() {
        return  "Movie =" + movie_name+ " |" +
                " User Rating=" + user_rating +" |"+
                " Critics Score=" + critics_score +
                "\n";
    }

    //JVM ---> order movie objects on the basis of user rating
//    @Override
//    public int compareTo(MovieRanking movie) {
////        if(this.getUser_rating() < movie.getUser_rating())
////        {
////            return -1;
////        }
////        else if (this.getUser_rating() > movie.getUser_rating())
////        {
////            return 1;
////        }
////        else
////        {
////            return 0;
////        }
//
//        return this.getMovie_name().compareTo(movie.getMovie_name());
//    }
}
