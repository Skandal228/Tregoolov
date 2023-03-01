package HomeWork.Lesson_3;
// Домашнее задание :
// 1. Вычислите следующую часть кода: int i1 = 5; int i2 =11; double d1= 5.5; double d2 =1.3; long l =20l;
// resoult = i2/d1+d2%i1-l;
// 2. Чему равны выражения: a-- - --a + ++a + a++ + a; ++b - b++ + ++b - --b; где a=5; b=8;

public class Lesson_3 {
    public static void main (String [] args){
        int i1=5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l =20l;
        double e = 3%i1;
        double resoult = i2 / d1 + d2 % i1 - l; //2+1.3=3.3%5-20 = 16.7 (Всё идёт согласно порядку)

        int a = 5;
        int b = 8;

        System.out.println(resoult);
        System.out.println(a-- - --a + ++a + a++ + a); // 4- 3+ 4+5+5= 15;
        System.out.println(++b - b++ + ++b - --b); // 9-9+11-10 = 1;
    }
}
