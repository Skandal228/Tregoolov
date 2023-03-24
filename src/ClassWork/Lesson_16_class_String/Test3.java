package ClassWork.Lesson_16_class_String;
// Продолжаем класс стринг с конкатенацией
public class Test3 {
    public static void main(String[] args) {

       // Пример:как рабатает int со String (без метода работает как конкатенация т.е. к значению приставлено слово
        int a = 5;
        int b =6;
        String s = "ok";
        System.out.println(a+b+s); // Ответ: 11ок
        System.out.println("" + a+b+s);  // 56ok Если перед int стоит конкатенация в таком виде то он и дальше + применит конкатенацию
        System.out.println("" + (a+b)+s); // Даже в таком примере можно использовать сложение добабив скобки

        int c = 5;
        String s1 = "Hello";
        String s2 = s1 +8;
       // String s3 = c+8; Будет ошибка int + int = int
        System.out.println(s2);
        System.out.println(c);


    }
}
