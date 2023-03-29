package ClassWork.Lesson_12_The_if_and_if_else_constructs;
/* Программа считывает с клавиатуры значение тумпературы тела и выдает сообщение о том, что температура тела высокая, низкая или нормальная, в
* зависимости от условий. В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая) в которые нужно вынести соответствующие условия
* и вместо выражений сравнения использовать эти переменные.
 */

import java.util.Scanner;
public class Zadacha4 {
    private  static  boolean isHigt;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int bodyTemperature = scanner.nextInt();
        isLow = bodyTemperature<36;
        isHigt = bodyTemperature>37;
        if (isHigt){
            System.out.println("температура тела высокая");
        }
        else if (isLow){
            System.out.println("температура тела низкая");
        }
        else {
            System.out.println("Температура тела норм");
        }

    }

}
