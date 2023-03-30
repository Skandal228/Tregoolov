package ClassWork.Lesson_12_1_Math_abs;
/*Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
равны ли эти числа с точностью до одной миллионной.

Требования:
1. Программа должна считывать два числа с клавиатуры.
2. Если числа равны, то программа должна выввести сообщения "числа равны".
3. Если числа не равны, то программа должна вывести сообщение "числа не равны".
4. Точность сравнения должна достигать одной миллионной (0.000001)
 */

import java.util.Scanner;

public class Zadacha3 {
    // Вариант 1:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        String result = number1 < number2 ? "первое меньше второго" : number1 > number2 ? "первое больше второго" : "числа равны ";
        System.out.println(result);

    }
}
/*
Правильное!!!
Вариант 2:

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        if (Math.abs(number1 - number2) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
 */
