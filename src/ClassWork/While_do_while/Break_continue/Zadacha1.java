package ClassWork.While_do_while.Break_continue;
import java.util.Scanner;
/* Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
* Слово "enough" выводить не нужно.
* Для этого необходимо использовать бесконечный цикл (while(true)).

* Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
*
* Требования!!!
* 1. Прога должна считывать данные с клавы.
* 2. Использовать цикл while.
* 3. Для бесконечного цикла необходимо использовать опертор break.
* 4. */
public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);

        }
    }
}
