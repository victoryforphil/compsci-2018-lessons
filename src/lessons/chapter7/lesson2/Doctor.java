package lessons.chapter7.lesson2;

public class Doctor extends Employee {
    @Override
    public void work() {
       seePatient();
    }

    public void seePatient(){
        System.out.println("Saw the patient.");
    }
    @Override
    public String getTitle() {
        return "Doctor";
    }
}
