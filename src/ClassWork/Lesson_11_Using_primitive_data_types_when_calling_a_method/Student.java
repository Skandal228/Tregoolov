package ClassWork.Lesson_11_Using_primitive_data_types_when_calling_a_method;

public class Student {
    String name;
    int course;
    double grade;
    Student (String name, int course, double grade){
        this.name= name;
        this.course=course;
        this.grade=grade;
    }
    public static void  swap (Student s1, Student s2){
       String name = s1.name;
        s1.name =s2.name;
        s2.name=name;
    }
    /* Хочу изменить имя одному из студентов*/
    public static void changeName(Student s1){
        s1.name ="Vasiliy";
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr",1,5.3);
        /* Хочу создать метод для смены ссылки на студентов ( чтобы st1 отображал параметры st2 и наоборот)
        * Схема лежит рис. 2 к 11 уроку*/
        swap ( st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        /* Результат не изменился почему дается в объяснении рис. 3*/
        changeName(st2);
        System.out.println(st2.name);
        /* рис. 4 */
    }
}
