package lessons.chapter4;

import java.util.Random;

public class Die {
    private int result = 0; // 1-6, 0 = error

    public Die(){
        roll();
    }

    public int roll(){
        Random rnd = new Random();
        result = rnd.nextInt(6) + 1;
        return result;
    }

    public int getResult() {
        return result;
    }
}
