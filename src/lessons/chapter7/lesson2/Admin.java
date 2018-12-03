package lessons.chapter7.lesson2;

public class Admin extends Employee {
    @Override
    public void work() {
        manage();
    }

    public void manage(){
        System.out.println("Managed");
    }
    @Override
    public String getTitle() {
        return "Managed";
    }
}
