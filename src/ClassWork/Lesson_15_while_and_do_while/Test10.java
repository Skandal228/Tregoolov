package ClassWork.Lesson_15_while_and_do_while;

public class Test10 {
    public static void main(String[] args) {

       OUTER:
       for (int chas = 0; chas < 24; chas++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(chas + ":" + minute);
                minute++;
            }

        }
    }
}