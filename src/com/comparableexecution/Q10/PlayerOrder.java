package com.comparableexecution.Q10;

import com.comparableexecution.MovieRanking;

import java.sql.ClientInfoStatus;
import java.util.*;

public class PlayerOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        players.add(new Player("GodFather", 90));
        players.add(new Player("EndGame", 85));
        players.add(new Player("Star Wars", 68));
        players.add(new Player("Inception", 53));
        players.add(new Player("Avtaar", 73));
        players.add(new Player("Eden", 73));
        Comparator<Player> sort = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.getScore() > o2.getScore())
                {
                    return -1;
                }
                else if (o1.getScore() < o2.getScore())
                {
                    return 1;
                }
                else
                {
                    Checker check = new Checker();
                    check.compare(o1, o2);
                    return 0;
                }
            }
        };
        Collections.sort(players,sort);
        System.out.println(players);

    }
}
