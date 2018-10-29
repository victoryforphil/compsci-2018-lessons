package lessons.chapter5.lesson4;

public class Task implements Priorty,Complexity {
    private int importance = 0;
    private int complexity = 0;
    @Override
    public int getPriorty() {
        return importance;
    }

    @Override
    public void setPriorty(int value) {
        importance = value;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    @Override
    public void setComplexity(int value) {
        complexity = value;
    }
}
