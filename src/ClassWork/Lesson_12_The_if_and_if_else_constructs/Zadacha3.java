package ClassWork.Lesson_12_The_if_and_if_else_constructs;
/* Задача:
* Есть прога которая принимает на вход возраст и определеяет нужно ли в школу или пора в институт. Но она работает не правильно.
* Например 5ти летнего ребенка отправляюв в институт! Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.
* */

import java.util.Scanner;
public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
            if (age >= 6)
                System.out.println("нужно ходить в школу");}
            else
             System.out.println("пора в институт");
    }
    }

