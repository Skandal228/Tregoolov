package ClassWork.Lesson_14_for_break_continue;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if (i==7){ break;}
            /* При данном условии допутим я хочу остановить работу цикла на 7, для того я использую
            * стейтмент брейк
             */
            System.out.println(i);
        }
    }
}
