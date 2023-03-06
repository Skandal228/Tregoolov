package HomeWork.Lesson_7;
// Пересоздайте класс Employee таким образом, чтобы переменная salary была недоступна вне класса, переменная surname была отвсюду, а переменная id только внутри пакета.
// Также создайте 3 public метода, которые будут показывать на дисплее значение этих переменных.
// Создайте для данного класса 3 разных конструктора с public, default и private access modifier.
// Создайте новые классы в томже и другом пакете.
// Попытайтесь в них создать объекты класса Employee и вывести на экран значение переменных данного объекта с помощью метода println и методов самого класса.

public class Employee {
     public Employee (int id2, String surname2, int age2, String departament2, double salary2){
        id=id2;
        surname=surname2;
        age=age2;
        departament=departament2;
        salary=salary2;
    }

    public Employee (int id3, String surname3){
         id=id3;
         surname=surname3;
    }

    public Employee (int id4, String surname4, String departament4){
         id=id4;
         surname=surname4;
         departament=departament4;

    }
    int id;
    public String surname;
    int age;
    String departament;
   private double salary;

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25, "Zakupki", 350);
        Employee emp2 = new Employee(12, "Huesosov" );
        Employee emp3 = new Employee(66, "Raspizdyaev", "IT");

       // System.out.println(emp1.id +".Фамилия: "+ emp1.surname +" возраст "+ emp1.age+ " отдел "+ emp1.departament + " "+ emp1.salary); // Ошибка! т.к. access modifier private в классе salary скрыт.
        System.out.println(emp2.id +".Фамилия: "+ emp2.surname);
        System.out.println(emp3.id +".Фамилия: "+ emp3.surname + " отдел "+ emp1.departament);

    }
}

