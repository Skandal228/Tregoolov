package ClassWork.Lesson_15_while_and_do_while;
/* Если у вас внутри while loop будет использованно всего один statment внутри теля while мы можем использовать этот while без фигурных скобок, но если
* есть еще один statement, то он не будет относится к while*/
public class Test4 {
    public static void main(String[] args) {

        int a = 5; // 6,7,8,9,10,11,12
        while(a++<10){
            a++;

    }
        System.out.println(a);}
}
