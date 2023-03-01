package HomeWork.Lesson_6;
// 2. Измените класс student, чтобы имел 3 конструктора. 1-ый принимает все параметры. 2-ой только id, name, surname, corse.
// 3-тий не принимает значений. Создайте в StudentTest 3 объекта с помощью разных конструкторов
public class Student {
    Student (int id1, String name1, String surname1, int course1, double MathAverage1, double EcAverage1, double LangAverage1) {
        id=id1;
        name=name1;
        surname=surname1;
        course=course1;
        MathAverage=MathAverage1;
        EcAverage=EcAverage1;
        LangAverage=LangAverage1;
    }
    Student(int id2, String name2, String surname2, int course) {
        this (0, null, null, 0, 0, 0, 0 );
    }
    int id;
    String name;
    String surname;
    int course;
    double MathAverage;
    double EcAverage;
    double LangAverage;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1= new Student(1, "Petr", "Ivanov", 1990, 10, 9,8);
        Student st2 = new Student(3, "Sidor", "Mrakobesov", 1989);
        Student st3 = new Student(0, null, null, 0, 0, 0, 0);


        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
