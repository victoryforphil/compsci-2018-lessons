package lessons.chapter7.lesson2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
    public static List<Employee> employees = new ArrayList<>();
    public static void main (String[] args){
        employees.add(new Admin());
        employees.add(new Doctor());
        employees.add(new Janitor());
        employees.add(new Receptionist());
        employees.add(new Nurse());
        employees.add(new Surgeon());

        for(Employee e : employees){
            System.out.println("Employee: " + e.getTitle() + " \t\t");
            e.work();

        }
    }
}
