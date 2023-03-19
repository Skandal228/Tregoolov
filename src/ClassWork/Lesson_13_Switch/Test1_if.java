package ClassWork.Lesson_13_Switch;

public class Test1_if {
}
// Сначало напишем в конструкте if потом в switch
class Student {
    double grade;

    Student(double grade) {
        this.grade = grade;
    }
    public static void main(String[] args) {
        Student st1 = new Student(4);
            if (st1.grade == 2) {
                System.out.println("Student dvoeshnik");
            } else if (st1.grade == 3) {
                System.out.println("Student troeshnik");
            } else if (st1.grade == 4) {
                System.out.println("Student horoshist");
            } else if (st1.grade == 5) {
                System.out.println("Student otlichnik");
            } else {
                System.out.println("ocenka ne verna");
            }

        }
    }

