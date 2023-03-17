package ClassWork.Lesson_8_final_and_static_modifiers;

public class Student {
    String name;
    int corse;
    static int count; // обозначение переменной относящемся ко всему классу и всем последующим в порядковости
    public Student (String name2, int corse2) {
        count++;
        name=name2;
        corse= corse2;
        System.out.println("Student # " + count+ " sozdan");
    }
    public static void showCount (){
        System.out.println("vsego sozdano studentov " + count);
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.count);
        System.out.println(Student.count);
        Student.showCount();

    }
}