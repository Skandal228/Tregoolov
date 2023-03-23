package ClassWork.Lesson_16_class_String;
// String method
public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("NCsmdsmd");

        // Выдаёт длину строки (колл-во символов от 1 .....и т.д.)
        int a =s1.length();
        System.out.println(a);

        // Метод выдает присовенный индекс к char ( индекс начинается с 0)
        char c1 =s1.charAt(2);
        System.out.println(c1);

        // На каком индексе расположен .. (Используется char, String)
        int i1 =s1.indexOf('N');
        int i2 =s1.indexOf("md");
        int i3 = s1.indexOf("123"); // Такого нет в объекте
        int i4 = s1.indexOf("s", 3); // ищу "s" с 3 индекса
        System.out.println(i1 +" "+ i2+ " "+ i3+" "+i4);

        //Начинается с?...
        boolean b1 =s1.startsWith("NCs"); // Ответ мб true and false
        boolean b2 = s1.startsWith("smd");
        boolean b3 = s1.startsWith("smd", 7); // String s1 начиная с 7 индекса является smd?
        System.out.println(b1 + " "+b2 + " "+ b3 );

        // Заканчивается чем-то?... boolean
        boolean b4 = s1.endsWith("NCs");
        boolean b5 = s1.endsWith("smd");
        System.out.println(b4 +" "+ b5);












    }

}
