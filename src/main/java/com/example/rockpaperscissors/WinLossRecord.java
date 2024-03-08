package com.example.rockpaperscissors;

public class WinLossRecord {
    private int win, tie, loss;

    public WinLossRecord(int win, int tie, int loss) {
        this.win = win;
        this.tie = tie;
        this.loss = loss;
    }

    public WinLossRecord() {
        this(0,0,0);
    }
    public void win() {
        win++;
    }
    public void tie() {
        tie++;
    }
    public void loss() {
        loss++;
    }
    public void reset() {
        win = 0;
        tie = 0;
        loss = 0;
    }
    @Override
    public String toString() {
        return win + " - " + tie + " - " + loss;
    }
}
