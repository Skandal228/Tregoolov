package HomeWork.Lesson_16;
/*
Задача:
* Создайте класс, в котором создайте метод имейл. Данный метод должен принимать в инпут 1 стринг параметр. Данный парметр должен содержать в себе имейлы
* в следующем виде: ya@yahoo.com; on@mail.ru; ona@gmail.com, т.е. после каждого имейла должен стоять знак препинания ";". Ваш метод должен выводить на экран
* информацию о том, какой почтой пользуются, исходя из параметра, т.е. оутпут должен быть следующего вида: yahoo, mail, gmail. Продемонстрируйте данный метод.
 */
public class Email {
    public void email(String s) {

       int a = 0; // позиция символа @
       int b = 0; // позиция символа .
       int c = 0; // позиция символа ;

        while (c<s.length() - 1){
            a = s.indexOf('@',c);
            b = s.indexOf('.',c);
            c = s.indexOf(';', c +1);
            System.out.println(s.substring(a+1,b));
        }
    }
    public static void main(String[] args) {
        HomeWork.Lesson_16.Email    l16= new HomeWork.Lesson_16.Email();
        l16.email ("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}