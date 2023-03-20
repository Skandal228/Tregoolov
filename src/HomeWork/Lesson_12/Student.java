package HomeWork.Lesson_12;
/* В классе StudentTest написать 2 метода, которые принимают 2 input параметра - 2 объекта класса Student из Lesson 11.
* 1ый метод сравнивает 2х студентов, использует 1 if statement и логические операторы внутри и выводит на экран информацию о том, равны ли студенты.
* 2ой метод использует nested if statement, сравнивает все атрибуты студента по отдельности, выводит на экран информацию о том, равны ли студенты, а если не
* равны, то в чем было обнаруженно первое не равенство. */
public class Student {
    String name;
    int course;
    double grade;
    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }
    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)){
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("Имя, курс, оценки одинаковые");}
                else
                    System.out.println("Имена студентов разные");}
            else
                System.out.println("Имена разные, курсы разыне, оценки разные");}

        else
            System.out.println("Имена разные, курсы одинаковые, оценки разные");}
    public static void main(String[] args) {
        Student s1 = new Student("Petr", 3, 5.5);
        Student s2 = new Student("Ivan", 3, 9.9);
        method1(s1, s2);
        method2(s1, s2);
    }
}









