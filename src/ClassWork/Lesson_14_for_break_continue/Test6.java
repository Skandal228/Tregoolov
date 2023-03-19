package ClassWork.Lesson_14_for_break_continue;

public class Test6 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if ( i ==10){ continue;}
            if (i%55==0){break;} // т.е. чтобы при делении на 55 остаток был ==0
            System.out.println(i);
        }
    }
}
