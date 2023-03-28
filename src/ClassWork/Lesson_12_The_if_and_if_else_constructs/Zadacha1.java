package ClassWork.Lesson_12_The_if_and_if_else_constructs;

import java.util.Scanner;

/*
* Ввести с клавиатуры  температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе вывести "на улице тепло".
*/
public class Zadacha1 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp<0){System.out.println(cold);}
        else {System.out.println(warm);}
    }
}
