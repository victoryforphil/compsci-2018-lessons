package lessons.chapter7.lesson2;

public class Receptionist extends Employee {
    @Override
    public void work() {
       seePatient();
    }

    public void seePatient(){
        System.out.println("Answered the phone");
    }
    @Override
    public String getTitle() {
        return "Receptionist";
    }
}
