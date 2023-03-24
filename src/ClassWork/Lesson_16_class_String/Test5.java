package ClassWork.Lesson_16_class_String;

public class Test5 {
    public static void main(String[] args) {
        String s = null; // не ссылается на какой либо объект
        s+="ok";
        System.out.println(s); // связывает вместе nullok
        // System.out.println(null + true+false); так писать нельзя
    }
}
