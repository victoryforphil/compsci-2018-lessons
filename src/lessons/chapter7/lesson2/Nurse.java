package lessons.chapter7.lesson2;

public class Nurse extends Employee {
    @Override
    public void work() {
        getInfo();
    }

    public void getInfo(){
        System.out.println("Got info from the patient.");
    }
    @Override
    public String getTitle() {
        return "Nurse";
    }
}
