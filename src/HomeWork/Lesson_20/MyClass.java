package HomeWork.Lesson_20;
import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public void abc(String... strings) {
        ArrayList<String> list = new ArrayList<String>();
        for (String str : strings) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abc("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello");
    }

    }

