package lessons.chapter3.lesson2;

/*
Alex Carter 9/8/2018
Lesson 3.2
*/

import javax.swing.*;

public class LeapYear {
    public static void main(String[] args){
        // Get Input from user then convert to int
        int inputYear = Integer.parseInt( JOptionPane.showInputDialog("What year?"));
        //Check if year is under 1582 and show error
        if(inputYear  < 1582){
            JOptionPane.showMessageDialog(null, "Please enter a year above 1582!");
            return; // Exit the program
        }
        //Check if its a leap year them show the proper prompt
        if(getRemainder(inputYear)){
            JOptionPane.showMessageDialog(null, "It is a leap year!");
        }else{
            JOptionPane.showMessageDialog(null, "It is not a leap year!");
        }
    }

    //Check if it is a leap year
    private static boolean getRemainder(int inYear){
        boolean is4Year = inYear % 4 == 0;     // Is a factor of 4
        boolean is100Year = inYear % 100 == 0; // Is a factor of 100
        boolean is400Year = inYear % 400 == 0; // Is a factor of 400

        return is4Year && (!is100Year || is400Year) ; //Run all the logic in one statement (im proud of this lil bit)
        // This means that the number MUST be a multiple 4 and either not a multiple of 100 or a multiple of 400 too.
    }
}

/*
OUTPUT:
Input Dialog <- 1500
Output Dialog -> "Please enter a year above 1582!"

Input Dialog <- 2000
Output Dialog -> "it is a leap year!"

Input Dialog <- 1900
Output Dialog -> "It is not a leap year!"
 */
