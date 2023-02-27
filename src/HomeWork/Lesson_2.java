package HomeWork;
// Домашнее задание:
// 1. Создайте по 4 переменные всех целочисленных типов данных в следующем виде:
// - Все 4 переменных типа byte должны равняться 12 и должны быть записанны в разных системах счисления;
// - Все 4 переменных типа short должны равнятся 1300 и должны быть записанны в разных системах счисления;
// - Все 4 переменных типа int должны равнятся 0 и должны быть записанны в разных системах счисления;
// - Все 4 переменных типа long должны равнятся 123456789 и должны быть записанны в разных системах счисления;
// - Ивывести их на экран.
// 2. Создать по 2 переменные  типов данных float, double и boolen. И вывести их на экран.
// 3. Создать нное кол-во переменных типа данных char всеми возможными способами и вывести их на экран.
public class Lesson_2 {
    public static void main (String[] args) {
        byte b = 12; // 10тиричная;
        byte b1 = 0xc; // 16тиричная (обязательно для отображениея ставим "0x" - чтобы отображалось с);
        byte b2 = 014; // 8ричная (обязательно для отображениея ставим "0" - чтобы отображалось с);
        byte b3 = 0b1100; // 2чная (обязательно для отображениея ставим "0b" - чтобы отображалось с);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        short s = 1300; // 10тиричная;
        short s1 = 0x514; // 16тиричная;
        short s2 = 02424; // 8ричная;
        short s3 = 0b10100010100; // 2ичная;
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        int i = 0; // 10тиричная;
        int i1 = 0x0; // 16тиричная;
        int i2 = 00; // 8ричная;
        int i3 = 0b0; // 2ичная;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println();

        long l = 123456789; // 10тиричная;
        long l1 = 0x75BCD15; // 16тиричная;
        long l2 = 0726746425; // 8ричная;
        long l3 = 0b111010110111100110100010101; // 2ичная;
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println();

        float f = 3.14f;
        float f1 = 3.1f + 3.2f;
        System.out.println(f);
        System.out.println(f1);

        double d = 102.65;
        double d1 = 299.99;
        System.out.println(d);
        System.out.println(d1);
        System.out.println();

        boolean boo = true;
        boolean boo1 = false;
        System.out.println(boo);
        System.out.println(boo1);
        System.out.println();

        char c = 0;
        char c1 = 'A';
        char c2 = '\u0548';
        // 3 возможных варианта записи типа данных char;

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
    }
}




