package lessons.chapter2.lesson2;

import javax.swing.*;

/*
Lesson 2.2
by Alex Carter 8/28/2018
 */

public class Main {
    private static int nums[];
    private static int countOfNums;

    public static void main(String[] args){
        countOfNums = 3;
        nums = new int[countOfNums];

        int sum = 0;
        for(int i=0;i<countOfNums;i++){
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number #" + (i+1)));
            sum += nums[i];
        }

        int avg = sum / nums.length;

        JOptionPane.showMessageDialog(null, "Average: " + avg);
    }

}

//Results:
/*

    Popups ask for each number

    Popup shows correct Number.

    Example:
    Numbers to avg: 1, 2, 3
    Avg: 2
 */