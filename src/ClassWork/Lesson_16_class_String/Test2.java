package ClassWork.Lesson_16_class_String;
// Продолжение методов стринг
public class Test2 {
    public static void main(String[] args) {
        // Скопирую все из Test1
        String s1 = new String("NCsmdsmd");

// Кусочек строки, кусочек стринга... (int beginIndex, int endIndex)

        String s10 = s1.substring(3); // C 3 индекса
        String s11 = s1.substring(3,7); // с 3 по 7 индекс включен. Сам 7 нет.

        System.out.println(s10+ " "+ s11);

        // Не принимает никаких параметров и возвращает стринг. Убирает пробелы по бокам стринга

        String s12 = s1.trim();
        System.out.println(s12);

        // Замена чара или стринга в объекте стринг (изменение слова)

        String s13 = s1.replace("NCsmdsmd", "Privet");
        System.out.println(s13);

        // Метод конкатенации

        String s14= "Privet, ";
        String s15 = "Drug";
        System.out.println(s14.concat(s15));




    }
}
