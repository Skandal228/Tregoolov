package ClassWork.While_do_while.Break_continue;
/*
* Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
* Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
*
* Требование!!!
* 1. Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
* 2. Используй цикл while/
* 3. Используй оператор continue*/

public class Zadacha2 {
    /*public static void main(String[] args) {
Этот вариант моеего решения!!!
        int number = 1;
        while (number <= 100) {
            if ((number % 3) == 0) {
                number++;
                continue;
                }
            System.out.println(number);
            number++;
            
        }
    }
}
 */

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}




