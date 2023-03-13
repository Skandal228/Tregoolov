package ClassWork.Lesson10;
/* Идея сама импортирует классы и конструкторы из предыдущих пакетов если мы на них ссылаемся*/
import ClassWork.Lesson9.Car;
import ClassWork.Lesson9.Student;
import ClassWork.Lesson9.*; /* Импорт класса всего пакета */
import ClassWork.Lesson8.Student.*;
import java.lang.*; /* Все классы пакета джава ланг в которые входят и String и класс System импортируются всегда*/

public class A {
    public static void main(String[] args) {
        ClassWork.Lesson9.Car c1 = new ClassWork.Lesson9.Car ("red", "V6");
        Car c2 = new Car("black", "V4"); /* Так удобнее не с импортом из другого пака*/
        Student st1= new Student();
        Student st2 = new Student();


    }

}
