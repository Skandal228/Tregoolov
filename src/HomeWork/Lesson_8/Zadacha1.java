package HomeWork.Lesson_8;
/*В первом классе  создайте два static метода. 1ый умножает 3 числа из параметра метода и возвращает их произведение;
 2ой делит первое число из парметра на второе иничего не возвращает, лишь выводит на дисплей в читабельном виде целое частное и остаток.
 Во втором классе по 2раза используйте данные методы.*/
public class Zadacha1 {
    /*1. 3 числа из параметра метода и возвращает их произведение.*/
    public static int umnozhenie  (int a, int b, int c){
        return a*b*c;
    }
    /* 2ой метод делит первое число из парметра на второе и ничего не возвращает, лишь выводит на дисплей в читабельном виде
    целое частное и остаток.*/
     static void delenie ( double x, double y){
        System.out.println("Celoye chastnoye :" + x/y);
        System.out.println("Ostatok : " +x%y);
    }
}
/*Во втором классе по 2раза используйте данные методы. */
class Zadacha1Test{
    public static void main(String[] args) {
        /* 1ый раз. */

        System.out.println(Zadacha1.umnozhenie(1,2,3));
        Zadacha1.delenie(15,4);

        /* 2ой раз.*/

        System.out.println(Zadacha1.umnozhenie(4,5,6));
        Zadacha1.delenie(16,9);
    }
}