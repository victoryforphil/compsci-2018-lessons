package lessons.chapter5.lesson4;

public class TaskDriver {
    public static void main(String[] args){
        Task task1 = new Task();
        Task task2 = new Task();

        task1.setPriorty(0);
        task2.setPriorty(10);

        task1.setComplexity(10);
        task2.setComplexity(1000);

        System.out.println("Task 1: " + task1.getPriorty() + " - " + task1.getComplexity());
        System.out.println("Task 2: " + task2.getPriorty() + " - " + task2.getComplexity());
    }
}
