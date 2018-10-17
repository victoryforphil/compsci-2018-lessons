package lessons.chapter5.lesson3;

public class Task implements Priorty {
    private int importance = 0;
    @Override
    public int getPriorty() {
        return importance;
    }

    @Override
    public void setPriorty(int value) {
        importance = value;
    }
}
