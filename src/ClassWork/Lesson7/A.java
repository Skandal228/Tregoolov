package ClassWork.Lesson7;

// Понятие "package"

public class A {
    public static void main(String[] args) {
        B objeck = new B(); // можно создать объект B даже если он имеет отдельный класс ( но класс А и В имеют 1 паку называемую Lesson7

         // Теперь мы хотим вызвать объект класса Employee из другого пакета
        ClassWork.Lesson6.Employee emp = new  ClassWork.Lesson6.Employee(1, "Petrov", 21); // Важно!!!
// Название объекта из другого пакета должен быть полоное ( т.е. путь его начинается начальной от начальной папки+ начальный класс должен начинаться с названия public
    }
}
