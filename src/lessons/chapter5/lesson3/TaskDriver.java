package lessons.chapter5.lesson3;

public class TaskDriver {
    public static void main(String[] args){
        Task task1 = new Task();
        Task task2 = new Task();

        task1.setPriorty(0);
        task2.setPriorty(10);

        System.out.println("Task 1: " + task1.getPriorty());
        System.out.println("Task 2: " + task2.getPriorty());
    }
}
