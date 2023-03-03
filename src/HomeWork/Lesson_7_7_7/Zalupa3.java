package HomeWork.Lesson_7_7_7;

import HomeWork.Lesson_7.Employee;

public class Zalupa3 {
    public static void main(String[] args) {
        Employee emp3 = new Employee(66, "Raspizdyaev", "IT");

        System.out.println(emp3.surname ); // Остальные содержимое объекта не входит, т.к. id и departament (default)


    }
}