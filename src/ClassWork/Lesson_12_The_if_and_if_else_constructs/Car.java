package ClassWork.Lesson_12_The_if_and_if_else_constructs;

/* Использование примитивных типов данных при вызове метода */

public class Car {
    int engine;
    int doorCount;

    Car (int engine, int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount)
                {System.out.println("Moshnost motora i kollichestvo dverei u pervoi mashini bolshe");}
             else
            {System.out.println("Moshnost motora u pervoqi mashini bolshe, a kollichestvo dverei menshe");}}
             else
            {System.out.println("Moshnost motora u pervoi mashini menshe");}


        }
    }


