package HomeWork.Lesson_18;
/* 2.	Создайте класс, в котором создайте метод  showArray. Инпут параметром данного метода будет двумерный массив типа String.
Метод должен выводить на экран данный массив в следующем виде:
{{element00, element01}, {element10}, {element10, element11}}
*/
public class MyClass2 {
    public static void showArray(String[][] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        String[][] arr = {{"element00", "element01"}, {"element10"}, {"element10", "element11"}};
        showArray(arr);
    }
}
/* В данном коде создается класс MyClass, в котором определен метод showArray, который принимает двумерный массив типа String.
Данный метод выводит на экран данный массив в заданном формате, используя циклы и условные операторы.
В методе main приведен пример вызова метода showArray с двумерным массивом arr. Результат работы метода будет выведен на экран. */