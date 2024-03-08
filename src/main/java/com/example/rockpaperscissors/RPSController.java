package com.example.rockpaperscissors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class RPSController {
    private int userSelection = 0, cpuSelection = 0;
    private final String[] picks = {"rock","paper","scissors"}; // Possible choices
    private final RPSGame game = new RPSGame();
    private final WinLossRecord score = new WinLossRecord();
    private Random r = new Random();
    @FXML
    private Label userPick, cpuPick, result, record;
    @FXML
    private Button rock, paper, scissors, reset;
    @FXML
    protected void onRockClick() {
        userSelection = 0;
        process();
    }
    @FXML
    protected void onPaperClick() {
        userSelection = 1;
        process();
    }
    @FXML
    protected void onScissorsClick() {
        userSelection = 2;
        process();
    }
    @FXML
    protected void onResetClick() { // Defaults out all values
        score.reset();
        updateRecord();
        userPick.setText("");
        cpuPick.setText("");
        result.setText("");
    }
    private void process() {
        // Makes a pick for the CPU, updates what each side picked, checks for result, updates record
        cpuSelection();
        updatePicks();
        getResult(game.play(userSelection,cpuSelection));
        updateRecord();
    }
    private void cpuSelection() { // Random int 0-2
        cpuSelection = (int) (r.nextInt(3));
    }
    private String pickTranslate(int pick) { // Translates int to text equivalent, 0 = rock, 1 = paper, 2 = scissors
        return this.picks[pick];
    }
    private void updatePicks() { // Displays what each side picked
        userPick.setText("You picked: " + pickTranslate(userSelection));
        cpuPick.setText("CPU picked: " + pickTranslate(cpuSelection));
    }
    private void getResult(int r) { // Runs the game, reports result to player, updates win/loss record
        switch (r) {
            case 0 -> {
                result.setText("It's a tie.");
                score.tie();
            }
            case 1 -> {
                result.setText("You win! :)");
                score.win();
            }
            case 2 -> {
                result.setText("You lose. :(");
                score.loss();
            }
        }
    }
    private void updateRecord() { // Updates record text field
        record.setText(String.valueOf(score));
    }
}