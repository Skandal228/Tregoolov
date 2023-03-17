package ClassWork.Lesson6_Overloading_Methods_and_Constructors;

/* Перегрузка методов и конструкторов */

public class EmployeeThis {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    EmployeeThis (int id2, String surname2, int age2){
        this (surname2, age2);
        id=id2;

    }

    EmployeeThis (String surname3, int age3){
        surname=surname3;
        age=age3;
    }

    EmployeeThis (int id4, String surname4, int age4, double salary4, String departament4){
        this (id4, surname4, age4);
        salary=salary4;
        departament=departament4;
    }
}
