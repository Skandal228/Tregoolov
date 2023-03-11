package HomeWork.Lesson_9;
/* Напишите программу, в которой будет создано 8 объектов, но к последней строке main останется только 2. */
public class Lesson_9 {
    public static void abc (){
        String s1 = new String("ABC");
        String s2 = new String ("DEF");
    }

    public static void main(String[] args) {
        Lesson_9 l9 = new Lesson_9();
        abc();
        abc();
        String s1 = new String ("ABC");
        abc();
    }
}
