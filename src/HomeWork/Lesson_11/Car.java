package HomeWork.Lesson_11;

/* Создайте класс Car c тремя переменными: цвет, мотор, двери. Далее создайте CarTest где должно быть 2 метода. 1ый меняет колличество дверей объекткта
* класса Car на колличество прописанного в параметре метода. 2о1 принимает в параметры 2 объекта класса Car и меняет их цвета местами. Примените оба метода
* в мейн и выведите на экран  */

public class Car {
    String collor;
    String engine;
    int door;

    Car(String collor, String engine, int door){
       this.engine=engine;
       this.collor=collor;
       this.door=door;
    }
    }

class CarTest {
    public static void changeDoor(Car d1) {
        d1.door = 2;

    }
    public static void swapCollor(Car sw1, Car sw2) {
        String collor = sw1.collor;
        sw1.collor = sw2.collor;
        sw2.collor=collor;

    }

    public static void main(String[] args) {
        Car Car1 = new Car("black", "v8", 4);
        Car Car2 = new Car("white","v4", 3);

        swapCollor(Car1, Car2);
        System.out.println(Car1.collor);
        System.out.println(Car2.collor);

        changeDoor(Car1);
        System.out.println(Car1.door);
    }


}












