package lessons.chapter8.lesson9;

import javax.swing.*;

public class PascalTriangle {
    static int max = 0;
    public static void print(int n){
        int[] previousRow; // Stores previous row
        int[] currentRow = {1}; // The current Working Work

        printArray(currentRow); // Print out the base row
        previousRow = currentRow;
        for(int i=2;i<= n;i++){
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i-1] =  1;

            for(int j=0;j<=i-3;j++){
                currentRow[j+1] = previousRow[j] + previousRow[j+1];
            }

            printArray(currentRow);
            previousRow = currentRow;
        }

    }

    public static void printArray(int[] array){
        int tabCount = (max) - array.length ;

        for(int i=0;i<tabCount;i++){
            System.out.print(" ");
        }
        for(int i=0;i<array.length;i++){

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("How  far?"));
        max = row;
        print(row);
    }
}
