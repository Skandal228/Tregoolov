package HomeWork.Lesson_4;

// Домашнее задание: Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе следующие атрибуты: номер стунденческого билета, имя фамилия,
// год обучения, средняя оценка по математике, средняя оценка по экономике, средняя оценка по иностранному языку. 2-ой класс назовите StudentTest.
// В нём должны будите создать 3 разных объекта класса Student, вывести на экран в читабельном виде среднюю арифметическую оценку каждого студента (учитывая все 3 предмета).
public class Lesson_4 {
    static class Student {
        int Student_id;
        String name;
        String surname;
        int data;
        int MathAverage;
        int EconomyAverage;
        int LanguageAverage;
    }

}
    class  StudentTest {
        public static void main (String[] args){
            Lesson_4.Student St1 = new Lesson_4.Student();
            Lesson_4.Student St2 = new Lesson_4.Student();
            Lesson_4.Student St3 = new Lesson_4.Student();

            St1.Student_id = 1;
            St1.name= "Petr";
            St1.surname = "Petrov";
            St1.data = 2020;
            St1.MathAverage = 9;
            St1.EconomyAverage = 7;
            St1.LanguageAverage = 6;

            System.out.println("Студент № " + St1.Student_id + " с датой зачисления " + St1.data + " " +St1.name +" " + St1.surname+" " + " и средней оценкой " + (St1.MathAverage + St1.EconomyAverage+ St1.LanguageAverage) /3);


            St2.Student_id = 2;
            St2.name= "Sidor";
            St2.surname = "Sidorov";
            St2.data = 2021;
            St2.MathAverage = 8;
            St2.EconomyAverage = 8;
            St2.LanguageAverage = 8;
            System.out.println();

            System.out.println("Студент № " + St2.Student_id + " с датой зачисления " + St2.data + " " +St2.name +" " + St2.surname+" " + " и средней оценкой " + (St2.MathAverage + St2.EconomyAverage+ St2.LanguageAverage) /3);
            System.out.println ();

            St3.Student_id = 3;
            St3.name= "Ivan";
            St3.surname = "Ivanov";
            St3.data = 2022;
            St3.MathAverage = 10;
            St3.EconomyAverage = 3;
            St3.LanguageAverage = 4;

            System.out.println("Студент № " + St3.Student_id + " с датой зачисления " + St3.data + " " +St3.name +" " + St3.surname+" " + " и средней оценкой " + (St3.MathAverage + St3.EconomyAverage+ St3.LanguageAverage) /3);


        }
    }
