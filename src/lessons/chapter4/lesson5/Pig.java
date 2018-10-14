package lessons.chapter4.lesson5;

import lessons.chapter4.PairOfDice;

import javax.swing.*;
import java.util.Random;

public class Pig {
    private static int currentPlayer = 0; // 0 = Human, 1 = AI
    private static int[] scores = new int[2]; // Array to store scores, using player index
    private static int scoreThisRound = 0; // Int to store score this round

    public static void main(String[] args){
        onPlayerTurn(); // STart the game
    }

    private static void onPlayerTurn(){
        String choice = getUserChoice();
        PairOfDice dice = new PairOfDice();
        if(choice == "pass"){
            roundReset();
            return;
        }

        int result = runScoreCheck(dice);
        if(result == 0){
            JOptionPane.showMessageDialog(null, "Rolled 1. Score this round reset. Next player's turn.");
            scoreThisRound = 0;
            roundReset();
            return;
        }

        if(result == -1){
            JOptionPane.showMessageDialog(null, "Rolled double 1. Score reset. Next player's turn.");
            scoreThisRound = 0;
            scores[0] = 0;
            roundReset();
            return;
        }

        scoreThisRound += result;
        JOptionPane.showMessageDialog(null, "Rolled double "+result+". Score this round: " + scoreThisRound);
        onPlayerTurn();
        return;

    }

    private static void onAITurn(){

        String choice = getAIChoice();
        PairOfDice dice = new PairOfDice();
        if(choice == "pass" || scoreThisRound >= 20){ // If the AI chooses to pass or has scored more then 20
            JOptionPane.showMessageDialog(null, "AI is choosing to pass.");
            roundReset();

            return;
        }

        int result = runScoreCheck(dice);
        if(result == 0){
            JOptionPane.showMessageDialog(null, "Rolled 1. Score this round reset. Next player's turn.");
            scoreThisRound = 0;
            roundReset();
            return;
        }

        if(result == -1){
            JOptionPane.showMessageDialog(null, "Rolled double 1. Score reset. Next player's turn.");
            scoreThisRound = 0;
            scores[0] = 0;
            roundReset();
            return;
        }
        //Apply score the round
        scoreThisRound += result;
        JOptionPane.showMessageDialog(null, "Rolled "+result+". Score this round: " + scoreThisRound);
        onAITurn();
        return;
    }

    // Gets the choice of the user
    private static String getUserChoice() {
        int choiceID = JOptionPane.showOptionDialog(null, "Choose Actions", "Pig",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,new String[]{"Roll", "Pass"}, "Roll");
        if(choiceID == 0){
            return "roll";
        }else{
            return  "pass";
        }
    }

    private static String getAIChoice() {
        int choice = new Random().nextInt(10);
        if(choice >= 2){
            return "roll";
        }else{
            return  "pass";
        }
    }
    // Checks for the score conditions given a pair of dice
    // 2-12 Adds to score
    // 0 Resets score for the round
    // -1 Resets all score
    private static int runScoreCheck(PairOfDice dice){
        if(dice.bothAre(1)){
            return -1;
        }

        if(dice.oneIs(1)){
            return 0;
        }

        return dice.getCombinedValues();
    }

    private static void switchPlayers(){
        switch (currentPlayer){
            case 0:
                currentPlayer = 1;
                onAITurn();
                break;
            case 1:
                currentPlayer = 0;

                onPlayerTurn();
                break;
        }
    }

    private static void roundReset(){
        scores[currentPlayer] += scoreThisRound;
        scoreThisRound = 0;
        JOptionPane.showMessageDialog(null, "Current score: \n Player: " + scores[0] + "\n AI: " + scores[1]);
        if(scores[0] >= 100 ){
            JOptionPane.showMessageDialog(null, "Player won!");
        }else if(scores[1] >= 100 ){
            JOptionPane.showMessageDialog(null, "AI won!");
        }else{
            switchPlayers();
        }

    }
}
