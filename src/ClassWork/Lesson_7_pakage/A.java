package ClassWork.Lesson_7_pakage;

/* Понятие "package" */

public class A {
    public static void main(String[] args) {
        B objeck = new B(); // можно создать объект B даже если он имеет отдельный класс ( но класс А и В имеют 1 паку называемую Lesson_7_pakage

         // Теперь мы хотим вызвать объект класса Employee из другого пакета
        ClassWork.Lesson_6_Overloading_Methods_and_Constructors.Employee emp = new  ClassWork.Lesson_6_Overloading_Methods_and_Constructors.Employee(1, "Petrov", 21); // Важно!!!
// Название объекта из другого пакета должен быть полоное ( т.е. путь его начинается начальной от начальной папки+ начальный класс должен начинаться с названия public
    }
}
