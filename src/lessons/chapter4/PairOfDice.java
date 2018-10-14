package lessons.chapter4;

public class PairOfDice {
    // Make an array to hold two dice
    private Die[] dice = new Die[2];

    // Create two die objects and store them in the array
    public PairOfDice(){
        dice[0] = new Die();
        dice[1] = new Die();
    }

    //Rerool both dice
    public void rollAll(){
        for(Die die : dice){
            die.roll();
        }
    }

    //Get if one of the dice is a value
    public boolean oneIs(int value){
        return dice[0].getResult() == value || dice[1].getResult() == value;
    }

    public boolean bothAre(int value){
        return dice[0].getResult() == value && dice[1].getResult() == value;
    }

    //Get combined values
    public int getCombinedValues(){
        return dice[0].getResult() + dice[1].getResult();
    }

    //Get if the dice are the same
    public boolean isSame(){
        return dice[0].getResult() == dice[1].getResult();
    }
    // Get a die by index
    public Die getDie(int index){
        return dice[index];
    }
}
