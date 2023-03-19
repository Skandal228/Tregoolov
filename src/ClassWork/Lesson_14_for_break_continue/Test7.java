package ClassWork.Lesson_14_for_break_continue;
/* я хочу вывести на экран каждую минуту  каждый час времени например:
00:00
00:01
00:02
и т.д. .....*/
public class Test7 {
    void time(){
        for (int chas = 0; chas<=23; chas++){
            for (double minuta = 0; minuta<=59; minuta++){
                System.out.println(chas + ":"+minuta);
            }
        }
    }


    public static void main(String[] args) {
        Test7 t = new Test7();
        t.time();
    }

    }
