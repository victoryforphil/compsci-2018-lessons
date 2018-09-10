package lessons.chapter3.lesson14;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class RockPaperScissors {

    private static int userScore = 0;
    private static int aiScore = 0;
    private static boolean isDone = false;

    public static void main(String argMattie[]){

        while(!isDone){
            String input = JOptionPane.showInputDialog(null,
                    "(AI: " + aiScore + ", Player: "+userScore+") Please choose Rock Paper Scissors or Quit to exit the program!");
            if(Objects.equals(input, "Quit")){
                isDone = true;
                break;
            }

            int choice = convertStringToChoice(input); // Convert string to a int representation for easy of processing
            // 0 = Rock
            // 1 = Paper
            // 2 = Scissors
            // -1 = Error

            //Check for bad input
            if(choice == -1){
                JOptionPane.showMessageDialog(null, "Please type in a proper response!");
                break;
            }

            //Get random AI Chocse
            int aiChoice = new Random().nextInt(2);
            //Get round result
            int roundResult = didUserWin(choice, aiChoice);
            //Convert back AI Choice to a string for printing
            String aiChoiceString = convertChoiceToString(aiChoice);

            // Print Game Results and Adjust Score
            if(roundResult == 1){
                userScore++;
                JOptionPane.showMessageDialog(null, "User won! AI Choice: " + aiChoiceString);
            }else if(roundResult == -1){
                aiScore++;
                JOptionPane.showMessageDialog(null, "AI won! AI Choice: " + aiChoiceString);
            }else{
                JOptionPane.showMessageDialog(null, "Tie! AI Choice: " + aiChoiceString);
            }
        }
    }
    private static int convertStringToChoice(String input){
        int res;
        switch (input){
            default:
                res = -1;
                break;
            case "Rock":
                res = 0;
                break;
            case "Paper":
                res = 1;
                break;

            case "Scissors":
                res = 2;
                break;
        }
        return res;
    }

    private static String convertChoiceToString(int input){
        String res = "Error. Unknown Choice Conversion";
        switch (input){
            default:
                res = "Error. Unknown Choice Conversion";
                break;
            case 0:
                res = "Rock";
                break;
            case 1:
                res = "Paper";
                break;

            case 2:
                res = "Scissors";
                break;
        }
        return res;
    }
    // 1 == Win, -1 == Loss, 0 == Tie
    private static int didUserWin(int userChoice, int aiChoice){
        if(userChoice == aiChoice){
            return 0;
        }

        switch (userChoice){
            case 0: // If user chose Rock
                if(aiChoice == 2){ // If the AI chose Scissors, Count as win
                    return 1;
                }else if(aiChoice == 1){ // if AI chose Paper, Count as lost
                    return -1;
                }else{
                    return 0; // If both arent true, return TIE (This should never happen but lets be safe)
                }


            case 1: // If user chooses paper
                if(aiChoice == 0){ // If the AI chose Rock, count as Win
                    return 1;
                }else if(aiChoice == 2){ // if the AI chose Scissors, count as lost
                    return -1;
                }else{
                    return 0; // If both arent true, return TIE (This should never happen but lets be safe)
                }


            case 2: // IF user chooses scissors
                if(aiChoice == 1){ // If the AI chose Scissors, count as Win
                    return 1;
                }else if(aiChoice == 0){ // if the AI chose paper, count as lost
                    return -1;
                }else{
                    return 0; // If both arent true, return TIE (This should never happen but lets be safe)
                }

            default:
                return 0;
            // If no cases occur, return TIE (This should never happen but lets be safe)
        }

    }
}
