package HomeWork.Lesson_18;
/* Создайте класс, в котором создайте метод сортировка.
Инпут параметром данного метода будет одномерный массив типа int. Метод должен возвращать  уже отсортированный по возрастанию массив.
*/
import java.util.Arrays;
public class MyClass {
    public static int[] sortirovka(int[] arr) {
    Arrays.sort(arr);
    return arr;
}
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 9, 4, 6, 7};
        int[] sortedArr = sortirovka(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
/* В данном коде создается класс MyClass, в котором определен метод sortirovka, который принимает одномерный массив типа int.
Данный метод использует метод  Arrays.sort() для сортировки массива по возрастанию и возвращает отсортированный массив.
В методе  main  приведен пример вызова метода sortirovka с массивом arr. Отсортированный массив выводится на экран с помощью метода  Arrays.toString() .
*/

