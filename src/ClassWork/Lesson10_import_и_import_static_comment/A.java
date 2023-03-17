package ClassWork.Lesson10_import_и_import_static_comment;

/* Понятия «import» и «import static». Использование комментариев */




/* Идея сама импортирует классы и конструкторы из предыдущих пакетов если мы на них ссылаемся*/
import ClassWork.Lesson9_Varieties_of_variables_and_limits_of_their_visibility.Car;
import ClassWork.Lesson9_Varieties_of_variables_and_limits_of_their_visibility.Student;

import java.lang.*; /* Все классы пакета джава ланг в которые входят и String и класс System импортируются всегда*/

public class A {
    public static void main(String[] args) {
        ClassWork.Lesson9_Varieties_of_variables_and_limits_of_their_visibility.Car c1 = new ClassWork.Lesson9_Varieties_of_variables_and_limits_of_their_visibility.Car ("red", "V6");
        Car c2 = new Car("black", "V4"); /* Так удобнее не с импортом из другого пака*/
        Student st1= new Student();
        Student st2 = new Student();


    }

}
