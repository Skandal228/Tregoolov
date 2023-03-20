package HomeWork.Lesson_13;
/* Задача:
* В классе Month создайте метод, у которого 1 параметр типа данных int. Этот параметр будет указывать
* порядковый номер месяца. Используя функционал switch, вывести на экран колл-во дней этого месяца
* (для 2023 года). Проверьте работу в методе мейн. */
public class Month {
    public static void dayhQuantity (int n) {
        switch (n) {
            case 1, 4, 6, 9, 11:
                System.out.println("30 дней в месяце");
                break;
            case 2:
                System.out.println("28 дней в месяце");
                break;
            case 3, 5, 7, 8, 10, 12:
                System.out.println("31 дней в месяце");
                break;
            default:
                System.out.println("Ввод не верный!!!");
        }
    }
    public static void main(String[] args) {
        Month mon = new Month();
        Month.dayhQuantity(1);
        dayhQuantity(2);
    }

    }






