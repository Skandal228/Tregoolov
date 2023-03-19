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
}

