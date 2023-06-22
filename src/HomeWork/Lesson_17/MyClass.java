package HomeWork.Lesson_17;
/* Создайте класс, в котором создайте метод ravenstvo. Инпут параметрами данного метода будут 2 объекта класса StringBuilder.
Метод должен иметь boolean return type, возвращать true, если значения объектов совпадают, false если не совпадают.
Продемонстрируйте данный метод.
 */
public class MyClass {public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
    return sb1.toString().equals(sb2.toString());
}
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb1, sb2)); // false
        System.out.println(ravenstvo(sb1, sb3)); // true
    }
}
/* В данном коде создается класс MyClass, в котором определен метод ravenstvo, который принимает два параметра типа StringBuilder.
Данный метод сравнивает значения объектов, используя метод equals, и возвращает true, если значения совпадают, и false, если не совпадают.
В методе main приведен пример вызова метода ravenstvo с двумя объектами StringBuilder.
Результат работы метода будет выведен на экран.
 */

