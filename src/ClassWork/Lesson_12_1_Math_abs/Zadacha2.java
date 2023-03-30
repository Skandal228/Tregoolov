package ClassWork.Lesson_12_1_Math_abs;

/* Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора.

Требование из тернарного оператора переделать в if else.
*/

import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        /*  String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        System.out.println(result);*/
       if (number<5){
           System.out.println("число меньше 5");
       }else if (number>5){
           System.out.println("число больше 5");
       }else if (number==5){
           System.out.println("число равно 5");
       }

    }
}
