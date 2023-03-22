package ClassWork.Lesson_15_while_and_do_while;
/* есть переменная bollean b = true; nfr; также есть переменная int a = 1;
* Я хочу на экран выводить все числа от 1 до n числа с интервалом в 1, до тех пор пока я не наткнусь на число которое на цело делится и на 3 и на 7. */
public class Test3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b){
            System.out.println(a);
            if (a%3==0&&a%7==0){
                b=false;
            }
            a++;
        }


    }
}
