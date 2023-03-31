package ClassWork.Lesson_12_The_if_and_if_else_constructs;
/* Напишем программу, которая будет считывать с клавиатуры возраст.
* Если возраст от 20 до 60 (включительно), то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
* Сделать это можно (и нужно!) с помощью только одного оператора if без else.
* Подсказка: используй логический оператор "||" (или). */

import java.util.Scanner;
public class Zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isYoung = a>=20;
        boolean isOld = a<=60;
        if ((!isYoung) || (!isOld)) {
            System.out.println("можно не работать");
        }


        }
    }

