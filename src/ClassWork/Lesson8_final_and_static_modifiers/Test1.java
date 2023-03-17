package ClassWork.Lesson8_final_and_static_modifiers;

public class Test1 {
    public final int a = 10;

    public static void main(String[] args) {
        Test1 t = new Test1();
       // t.a = t.a*2; ошибка a=константа

        System.out.println(t.a);
    }
}
