package ClassWork.Lesson_18_Massive_array;
/*Задача написать метод который принимает в параметр массив  и выводит на экран его больший и наименьший элемент */
public class Test1 {

    public static void metod1(int[] array1) {
        int max = array1[0];
        int min = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max)
                max = array1[i];
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("minimalniy element massive: " + min + " maximalniy element massive: " + max);
    }

    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 6};
        metod1(array1);
    }
}









