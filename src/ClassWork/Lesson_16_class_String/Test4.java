package ClassWork.Lesson_16_class_String;

import HomeWork.Lesson_10.p1.p2.p3.p4.E;

// Пример с классом
public class Test4 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary =salary;
        this.isManager= isManager;

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        // System.out.println(emp.salary + emp.isManager); это сложение не может сложить bollean + double
        System.out.println("On manager? "  + emp.isManager + " Ego zarplata: " + emp.salary + " $");
    }
}