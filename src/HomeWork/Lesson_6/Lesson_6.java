package HomeWork.Lesson_6;
// 1. Создайте класс, в котором будет 5 overloaded методов, которые вычесляют сумму нуля, одного, двух, трех и четырёх
// целых чисел, соответственно передают эту сумму в output и выводит её на экран. В случае когда слагаемые отсутствуют
// (т.е. когда параметров нет) сумма пусть равнятся 0.
public class Lesson_6 {
 int sum (int a){
        return a;
 }
int sum1 ( int b, int c){
        return b+c;
 }
 int sum2 (int d, int e, int j){
     return d+e+j;
 }
 int sum3 (int k, int l, int m, int n){
     return k+l+m+n;
    }
}

class Lesson6Test{
    public static void main(String[] args) {
        Lesson_6 less = new Lesson_6 ();

        System.out.println ("Summa vseh chisel " + less.sum(0));
        System.out.println ("Summa vseh chisel "+ less.sum1(1, 2));
        System.out.println ("Summa vseh chisel "+ less.sum2(3,4,5));
        System.out.println ("Summa vseh chisel " +less.sum3(6,7,8,9));

    }
}



