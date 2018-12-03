package lessons.chapter7.lesson2;

public class Janitor extends Employee {
    @Override
    public void work() {
        clean();
    }

    public void clean(){
        System.out.println("Clean stuff");
    }
    @Override
    public String getTitle() {
        return "Janitor";
    }
}
