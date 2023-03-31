package ClassWork.While_do_while;
/* Используя цикл while вывести на экран сто раз цитату (переменная quote):
* «Я никогда не буду работать за копейки. Амиго»
* Каждое значение вывести с новой строки.
* Требования !!!
* 1. Программа должна вывести 100 раз содержимое перемееной quote.
 */



public class Zadacha1 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int a =1;
        while (a<=100){
            System.out.println(a+". "+quote);
            a++;

        }

    }
}

