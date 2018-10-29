package lessons.chapter5.lesson5;

public class Task implements Priorty,Complexity,Comparable<Task> {
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

    @Override
    public int compareTo(Task o) {
        // Use diffrence to calculate prioty.
        return o.getPriorty() - getPriorty();
    }
}
