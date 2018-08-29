package lessons.chapter2.lesson14;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class PhoneNumber {
    public static void main(String[] args){
        int[] areaCodeBlacklist = {8,9};

        int[] finalNumber = new int[10];

        finalNumber[0] = GetRandomIntExclusive(areaCodeBlacklist);
        finalNumber[1] = GetRandomIntExclusive(areaCodeBlacklist);
        finalNumber[2] = GetRandomIntExclusive(areaCodeBlacklist);

        String finalNumberPrint = "(" + finalNumber[0] + "" + finalNumber[1] + "" + finalNumber[2] + ")";
        JOptionPane.showMessageDialog(null, finalNumberPrint);
    }

    private static int GetRandomIntExclusive(int[] blacklist){
        Random rnd = new Random();
        int found = rnd.nextInt(10);
        // Lets try some recursive.

        boolean foundInBlacklist = false;

        for (int item:blacklist ) {
            if(item == found){
                foundInBlacklist = true;
            }
        }

        if( foundInBlacklist){
            System.out.println("Blacklist Triggered!");
            return GetRandomIntExclusive(blacklist);
        }

        return found;
    }

}
