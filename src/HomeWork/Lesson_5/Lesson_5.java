package HomeWork.Lesson_5;

public class Lesson_5 {
}
// 1. В класс BankAccount добавьте 2 метода (1ый называется popolnenieScheta и увеличивает на сумму, которая указанна в
// в параметре этого метода. 2ой называется snyatieSoScheta м уменьшает баланс на сумму, которая указанна в параметре этого метода.
class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenieScheta(double summaPoplnenya) {
        System.out.println("Balance do poplneniya: " + balance);
        System.out.println("Balance popolnyaetsya na: " + summaPoplnenya);
        balance += summaPoplnenya;
        System.out.println("Balance posle popolneniya: " + balance);
        System.out.println();
    }

    void sniyatieSoscheta(double summaSnyatie) {
        System.out.println("Balance do snyatia: " + balance);
        System.out.println("Balance umenshaetsya na: " + summaSnyatie);
        balance -= summaSnyatie;
        System.out.println("Balance posle snyatia: " + balance);
        System.out.println();

    }
}

class BankAccountTest {
    public static void main (String [] args) {
        BankAccount MyAccount = new BankAccount();
     MyAccount.popolnenieScheta(30.5);
     MyAccount.sniyatieSoscheta(20.5);

    }
}

// 2. Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента на экран выводил метод. Т.е. создайте метод
// параметр которого - это объект класса Student, а в теле метода будет вычесляться средняя арифметическая оценка и выводится на экран.
class Student1 {
     int Student_id;
     String name;
     String surname;
     int data;
     int MathAverage;
     int EconomyAverage;
     int LanguageAverage;

     }

     // За основу 2-го задания ctr+c (+) ctr+v я копирую из Lesson_4 класс + конструктор + метод и изменяю его.
     class  StudentTest1 {
    double srednyaArifmetic (Student1 st){
        double srednyayaocenca = (st.MathAverage + st.EconomyAverage+ st.LanguageAverage)/3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + st.surname + ": " + srednyayaocenca);
        return srednyayaocenca;
    }
    public static void main (String[] args){
        Student1 St1 = new Student1();
        Student1 St2 = new Student1();
        Student1 St3 = new Student1();

        St1.Student_id = 1;
        St1.name= "Petr";
        St1.surname = "Petrov";
        St1.data = 2020;
        St1.MathAverage = 9;
        St1.EconomyAverage = 7;
        St1.LanguageAverage = 6;

        St2.Student_id = 2;
        St2.name= "Sidor";
        St2.surname = "Sidorov";
        St2.data = 2021;
        St2.MathAverage = 8;
        St2.EconomyAverage = 8;
        St2.LanguageAverage = 8;

        St3.Student_id = 3;
        St3.name= "Ivan";
        St3.surname = "Ivanov";
        St3.data = 2022;
        St3.MathAverage = 10;
        St3.EconomyAverage = 3;
        St3.LanguageAverage = 4;

        // Далее на метод мы создаем объект на класс StudentTest1

        StudentTest1 sTest = new StudentTest1();
        sTest.srednyaArifmetic(St1);
        sTest.srednyaArifmetic(St2);
        sTest.srednyaArifmetic(St3);

    }
}

// 3. Создайте класс Employee c атрибутами id, surname, age, salary, departament,  которые должны задаваться в конструкторе.
// В данном классе также создайте метод увеличения ЗП вдвое. Создайте 2ой класс EmployeeTest, в котором создайте 2 обьекта класса Emploee.
// Увеличте зарплату в двое каждому работнику с помощью метода и вывести на экран значение новой зарплаты.
class Employee1 {
    //Создается переменные класса.
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    /// Далее создается конструктор называется также, как класс.
     Employee1(int id2, String surname2, int age2, double salary2, String departament2) {
        //Далее значения присваиваются к переменным.
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }
//Далее пишется метод увеличивающий ЗП не принимает никаких парамметров.
    double uvelichenieZP() {
        salary *= 2;
        return salary;
    }
}

class Employee1Test {
    public static void main (String [] args){
         Employee1 emp1 = new Employee1(1, "Ivanov", 25, 555.55, "it");
         Employee1 emp2 = new Employee1(2, "Petrov", 30, 888.88, "sales");

         emp1.uvelichenieZP();
         System.out.println("Novaya ZP rabotnica " + emp1.surname + ": "+ emp1.salary);

         double newSalary = emp2.uvelichenieZP();
         System.out.println("Novaya ZP rabotnica "+ emp2.surname + ": "+ emp2.salary);

    }

}


