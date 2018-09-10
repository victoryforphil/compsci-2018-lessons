package lessons.chapter3.lesson5;

import javax.swing.*;

/*
Alex Carter | 9/9/2018
 */
public class CharPrint {
    public static void main(String[] args){
        //Get user input
        String input = JOptionPane.showInputDialog("Please enter a string!");
        /// Fancy for loop for fun :3

        // Loop through all cars
        for(char c : input.toCharArray()){
            System.out.println(c); // I didnt use option pane for this cuz that would be spammy
        }
    }
}

/*
Console output:
T
e
s
t

s
t
r
i
n
g

Process finished with exit code 0

 */