package ClassWork.While_do_while;
/* Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
* Вывести на экран полученную сумму и завершить программу.
*
* Требования!!!
* 1. Программа должна считывать данные с клавиатуры.
* 2. Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово
* 3. Использовать цикл while*/

import java.util.Scanner;
public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}


