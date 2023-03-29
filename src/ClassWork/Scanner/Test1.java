package ClassWork.Scanner;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите Имя");
        String str= sc1.nextLine(); // Любой тип данных метод
        System.out.println("Вы ввели "+ str);


    }
}
