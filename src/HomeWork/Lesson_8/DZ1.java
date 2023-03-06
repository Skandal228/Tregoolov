package HomeWork.Lesson_8;
// В первом классе  создайте два static метода. 1ый умножает 3 числа из параметра метода и возвращает их произведение;
// 2ой делит первое число из парметра на второе иничего не возвращает, лишь выводит на дисплей в читабельном виде целое частное и остаток.
// Во втором классе по 2раза используйте данные методы.
public class DZ1 {

    static double umnozhenie(double a, double b, double c) {
        return a*b*c;
    }

    static void  Delenie(int a, int b){
        System.out.println("Celoye chastnoe = " + a/b+": Ostatok =" + a%b);
    }
}

class Zadacha1Test {
    public static void main(String[] args) {
        System.out.println(DZ1.umnozhenie(2, 3,4));
        DZ1.Delenie(9,2);
        System.out.println(DZ1.umnozhenie(2.5, 3.5, 4));
        DZ1.Delenie(15,4);
    }
}










