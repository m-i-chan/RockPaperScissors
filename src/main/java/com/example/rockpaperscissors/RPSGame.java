package com.example.rockpaperscissors;

public class RPSGame {
    public int play(int p1, int p2) { // 0 = rock, 1 = paper, 2 = scissors
        switch (p1-p2) { // Possible results
            case 1, -2 -> {return 1;} // 1 = p1 wins
            case -1, 2 -> {return 2;} // 2 = p2 wins
            default -> {return 0;} // 0 = tie
        }
    }
}