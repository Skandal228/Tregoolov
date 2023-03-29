package ClassWork.Lesson_12_The_if_and_if_else_constructs;

import java.util.Scanner;
/*
* Ввести с клавиатуры имя и возраст. Если возвраст в пределах 18-28(включительно), то вывести на экран "Имя, явитесь в военкомат",
* где имя  - это имя, введеное ранее с клавиатуры.*/
public class Zadacha2 {
    public static void main(String[] args) {

        String militaryCommissar = ", явитесь в военкомат";
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        int age =sc1.nextInt();
        if (age>=18 && age<=28){
            System.out.println(name + militaryCommissar );
            }
            else {
                System.out.println("Вам не требуется явка.");
            }
    }
    }


