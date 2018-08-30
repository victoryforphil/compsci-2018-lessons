package lessons.chapter2.lesson14;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class PhoneNumber {
    public static void main(String[] args){
        int[] areaCodeBlacklist = {8,9}; //Numbers not allowed in area code
        int[] areaCode = new int[3]; // Allocate an array to hold area code
        
        //Generate Area code using Exclusive Function 
        areaCode[0] = GetRandomIntExclusive(areaCodeBlacklist); 
        areaCode[1] = GetRandomIntExclusive(areaCodeBlacklist);
        areaCode[2] = GetRandomIntExclusive(areaCodeBlacklist);
        
        //Generate rest of number using Random Array under Sum function
        int[] block2 = GetRandomIntUnderSum(3, 742); // Generate 2nd block (000)-xxx-0000
        int[] block3 = GetRandomIntUnderSum(4,-1); // Generate 2nd block (000)-xxx-0000
        
        //Make a formated string using the int arrays.
        String finalNumberPrint = 
            String.format("(%d%d%d) %d%d%d-%d%d%d%d", 
                          areaCode[0],
                          areaCode[1],
                          areaCode[2],
                          block2[0],
                          block2[1],
                          block2[2],
                          block3[0],
                          block3[1],
                          block3[2],
                          block3[3]);
        //Show Number
        JOptionPane.showMessageDialog(null, finalNumberPrint);
    }
    
    //Generate a random number excluding specific digits
    private static int GetRandomIntExclusive(int[] blacklist){
        Random rnd = new Random();
        int found = rnd.nextInt(10); // Generate a number
        
     
        //Search if current number was in the blacklist
        for (int item:blacklist ) {
            if(item == found){
                 // If found in blacklist, generate a new number using recursive.
                 System.out.println("Blacklist Triggered!");
                 return GetRandomIntExclusive(blacklist);
            }
        }
        //Return result
        return found;
    }
    
    //Get a random array of numbers thats sum is under max
    /*
        count - how many numbers to generate in the array (length of array)
        max   - max sum of the numbers in the array
    */
    private static int[] GetRandomIntUnderSum(int count, int max){
        Random rnd = new Random();
        // Make array for the results using max param
        int[] results = new int[count];
        
        //Total sum of the array
        int totalSum = 0;
        
        //Generate array
        for(int i=0;i<count;i++){
            results[i] =  rnd.nextInt(10);
            totalSum += results[i];
        }
        //If the array is more then the max, generate a new array using recursive.
        if(totalSum > max && max != -1){
            System.out.println("Recursive GetRandomIntUnderSum Call");
            return GetRandomIntUnderSum(count, max);
        }
        
        return results;
    }
}
