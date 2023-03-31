package ClassWork.While_do_while;
/*Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ

Требования!!!
1. Программа должна выводить текст на экране
2. Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненый буквами "Q".
3. В программе необходимо использовать вложеные циклы while (цикл в цикле).
4. Вывод на экран должен происходить в цикле while.
*/

public class Zadacha4 {
    public static void main(String[] args) {
        int a = 0;
        while (a<5) {
            int b = 0;
            while (b<10) {
                System.out.print("Q");
                b++;
            }
            System.out.println();
                a++;
            }
        }
}

