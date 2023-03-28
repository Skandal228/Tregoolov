package ClassWork.Scanner;
/*Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.
Пример ввода:
51
101
201
Пример вывода:
117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.
*/
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму 3х чисел и найдите среднееарифметическое ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a+b+c)/3);



    }
    }

