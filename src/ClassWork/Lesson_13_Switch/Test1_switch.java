package ClassWork.Lesson_13_Switch;

public class Test1_switch {
}

class Student_1{
    int grade;
    Student_1(int grade){
        this.grade=grade;
    }
    public static void main(String[] args) {
        Student_1 st1 = new Student_1(1);
        switch (st1.grade){
            case 2:
                System.out.println("Student dvoeshnik");
                break;
            case 3:
                System.out.println("Student troeshnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("ocenka ne verna");
                break;

        }
    }

}
