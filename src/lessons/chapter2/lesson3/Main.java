package lessons.chapter2.lesson3;
import javax.swing.*;

/*
Lesson 2.3
by Alex Carter 8/28/2018
 */

public class Main {
    // Static declaration of vars
    private static float nums[]; // Numbers to process (array)
    private static int countOfNums; // How many numbers to request then to proces

    public static void main(String[] args){
        //How many numbers to request and process
        countOfNums = 2;

        // Make empty array with the number of inputs
        nums = new float[countOfNums];

        float sum = 0;
        float dif = 0;
        float pro = 0;

        // Request and process the numbers. using countOfNums to determine  count
        for(int i=0;i<countOfNums;i++){
            //Get Input in the form of a dialog
            nums[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter number #" + (i+1)));

            // Process and update result
            if(i==0){ // If first number just set the vars to the value, avoid issues like subtracting from 0 and multiplying from 0
                sum = nums[i];
                dif = nums[i];
                pro = nums[i];
            }else{ // Process the numbers as usual;
                sum += nums[i];
                dif -= nums[i];
                pro *= nums[i];
            }
        }
        //Show Final Answers
        JOptionPane.showMessageDialog(null, "Sum, Diffrence, Product: " + sum +" " + dif + " " + pro);
    }

}

//Results:
/*
Dialog asks for number #1.
Dialog asks for number #2.
Dialog shows the sum, dif, and pro correctly.
 */
