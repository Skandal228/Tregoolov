package ClassWork.Lesson6;

public class Employee {
      public Employee (int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String departament;
}
// По дефолту если мы выведим на экран допустим id и surname, то мы увидим что за id будет 0, а за surname будет null.
// Так вот, если мы хотим задать другие дефолтные параметры, то необходимо создать (user definite construktor c существующими параметрами в скобках).
class EmployeeTest{
    public static void main(String[] args) {
         // вызывается конструктор без параметров//
        //Employee emp1 = new Employee(); - теперь мы не можем создать такой конструктор без втроенных параметров для этого мы пишем такой-же но уже с параметрами.
        Employee emp1 = new Employee(1, "Ivanov", 25);

        System.out.println(emp1.surname);

    }
}
