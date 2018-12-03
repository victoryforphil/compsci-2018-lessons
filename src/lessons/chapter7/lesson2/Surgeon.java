package lessons.chapter7.lesson2;

public class Surgeon extends Employee {
    @Override
    public void work() {
        cut();
    }

    public void cut(){
        System.out.println("Cut Stuff");
    }
    @Override
    public String getTitle() {
        return "Surgeon";
    }
}
