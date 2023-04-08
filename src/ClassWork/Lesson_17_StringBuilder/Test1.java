package ClassWork.Lesson_17_StringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        System.out.println(sb2.length()); // длина строки начинается с 0 (учитываются проблебелы и знаки препинания)
        System.out.println(sb2.charAt(3)); // Под каким индексом чар находится символ
        System.out.println(sb2.indexOf(" ")); // Под каким символом находится индекс
        String s = sb2.substring( 8); // Метод показывает с какого индекса начинается отрывок строки
        System.out.println(s);
        System.out.println(sb2.subSequence(5, 8));
        sb2.append(22); // изменяет объект стринг (добавлением)
        System.out.println(sb2);
    }
}
