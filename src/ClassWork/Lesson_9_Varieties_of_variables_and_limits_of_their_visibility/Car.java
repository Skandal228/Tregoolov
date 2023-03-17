package ClassWork.Lesson_9_Varieties_of_variables_and_limits_of_their_visibility;

/* Урок №9 Разновидности переменных и пределы их видимости */


public class Car {
   final int XYZ = 3; /* Константы пишем с большой буквы*/
    int zxxxxxxxxxxxxxxxxxxxxxxxxxxx = 5; /* Переменные могут быть диныые*/
    int ____$$$ada____=10; /* Могут быть использоваться такие сымволы*/
    int String =2; /* Пременная может называться Стринг*/
    static int a = 10;
    String color;
    String engine;
    static int count;

   public Car(String color, String engine){
        int a = 5;
        this.color = color;
        this.engine=engine;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        int a=10;
    }
}
