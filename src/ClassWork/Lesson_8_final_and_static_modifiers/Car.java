package ClassWork.Lesson_8_final_and_static_modifiers;


public class Car {
    String color = "blue";
    String engine = "v6";
}

class Human {
    String name = "Ivan";
     Car c = new Car(); // всё бы это было не возможно если перед переменной Car мы бы установили final (константу), но допустим значение engine я могу поменять.

    public static void main(String[] args) {
        Human h1= new Human();
        h1.c= new Car();
        h1.c = new Car();
        h1.c.engine = "v8";
    }
}
