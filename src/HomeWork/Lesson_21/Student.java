package HomeWork.Lesson_21;
/* Cоздайте класс student со следующими переменными: name (используйте StringBuilder)
corse, grade. Примените инкапсуляцию к данному классу. Длина имени объектов не должна
быть менее 3-х символов, оценки должны быть числами в интервале от 1-10, курс должен быть числом от 1-4
включительно. Создайте метод showinfo, который будет выводить всю информацию о студенте,
не используя переменную класса напрямую. Создайте класс TestStudent, в котором создайте
объект класса Student, придайте его переменным значение. Произведите метод showinfo.
 */

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
    public StringBuilder getName() {
        StringBuilder name2= new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;

        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;

        }
    }

    public void showInfo() {
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Оценка: " + getGrade());

    }
}


 class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Иван");
        st1.setName(sb1);
        st1.setCourse(4);
        st1.setGrade(11);
        st1.showInfo();
    }
}