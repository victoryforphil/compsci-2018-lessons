package lessons.chapter4.lesson4;

import lessons.chapter4.PairOfDice;

public class BoxCars {
    public static void main(String args[]){
        int same = 0; // Counts how many are the same
        PairOfDice die = new PairOfDice(); // Make a pair of dice
        for(int i=0;i<1000;i++){ // Loop through 1000 dice roles

            // If the dice are the same, count it
            if(die.isSame()){
                same++;
            }

            //Rerool the dice
            die.rollAll();
        }

        //Print result
        System.out.println("Same: " + same);
    }
}

//OUTPUT:
//Same: 178