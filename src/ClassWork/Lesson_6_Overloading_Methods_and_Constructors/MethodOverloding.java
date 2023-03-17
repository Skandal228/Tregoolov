package ClassWork.Lesson_6_Overloading_Methods_and_Constructors;
// Примеры будут с одним return type//
public class MethodOverloding {
// Для начала просто создадим метод для вывода типа данных int на экран//

    void showInt ( int i1){ // убери из show int и будет проще (также в остальных, а также измени в классе Test переменные)//
        System.out.println(i1);
    }

// Далее создадим еще 1 медот например boolean.

void showBoolean (boolean b1){
        System.out.println(b1);
}

// Создадим еще 1 метод.
    void showString(String s1){
        System.out.println(s1);
    }
// Создадим по сложнее метод//
void show (String s, int a ) {
    System.out.println("String :" + s+ " " + "int :" + a);
}
// И такой же метод //
    void show (int a, String s ){
        System.out.println("Kakoy horoshiy den");
    }

}

class MethodOverlodingTest {
    public static void main (String [] args){
        MethodOverloding  mO = new MethodOverloding ();
        // теперь вызываем его метод showInt //
        int a = 500;
        mO.showInt(a);
        // Далее создадим переменную boolean к методу булем //
        boolean b = true;
        mO.showBoolean(b);
        // Также как и предыдущие создаем переменную к методу String //
        String s = "Privet";
        mO.showString(s);
        mO.show("privet", 10);

        // Заключение и вывод этих методов не рацилнальное использование. Потому что все эти методы что-то выводят на экран. Т.е. если допустим у нас может быть помимо
        // этих методов еще 50 мы можем запутаться и вызвать не тот метод который мне нужен.
        // Что позволяет нам делать метод Overloading (перегрузка)? Этот метод позволяет нам называть методы одним именем (Show), мы можем удалить в классе
        // public class MethodOverloding удалить окончание (int, boolean, String) и метод будет иметь такой же принцип работы, что мы укажем в парамметре метода.
        // Главное понимае метода Overloding - Это не допускать эдентичных параметров в методе. Тогда компилятор будет ругаться, т.к. он не сможет работать с одинаковыми парметрами и переменными. //
    }
}