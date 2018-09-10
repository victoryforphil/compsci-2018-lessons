package lessons.chapter3.lesson4;

import javax.swing.*;

/*
Alex Carter  | 9/9/2018
Lesson 3.4
 */
public class EvenNumbersSum {
    public static void main(String[] args){
        // Ask the user for a number, then convert it to an Int
        int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number above 2"));

        //Check if the number is below 2, if it is print an error
        if(input < 2){
            JOptionPane.showMessageDialog(null, "Number is below 2!");
            return; // Exit the program
        }

        //Run through all numbers starting at 2, up until the input number
        // I add 1 to the input so it will include the input number, else it would stop one below it.
        int sum = 0;
        for(int i=2;i<input + 1;i++){
            if(i % 2 ==0){ // If the number is even
                sum += i; // Add to sum
            }
        }
        // Print sum
        JOptionPane.showMessageDialog(null, "The sum of all numbers was: " + sum);
    }
}
/*
OUTPUT:
Input Dialog <- "10"
Output Dialog -> "The sum of all numbers was: 30"
 */