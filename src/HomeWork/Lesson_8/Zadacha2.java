package HomeWork.Lesson_8;
// В первом классе создайте static final переменную ПИ=3,14. Используйте данную константу non-static методе, который принимает в параметре значения радиуса и
// вычисляет площадь круга по формуле: ПЛОЩАДЬ = ПИ*РАДИУС*РАДИУС. Также используйте данную константу в static методе который принимает в параметре значения
// радиуса и вычисляет длину окружности по формуле: ПЛОЩАДЬ=2*ПИ*РАДИУС. Создайте еще один non-static метод, который принимает в параметре значения радиуса и
// выводит на экран информацию о радиосе. площадь круга и длине окружности. Используйте все 3 метода во 2ом классе.
public class Zadacha2 {
public final static  double PI =  3.14;
public static double ploshad(double radius){
    double pl = PI * radius* radius;
    return pl;
}
public static double dlina (double radius2) {
    double dl = 2 * PI * radius2;
    return dl;
}

    public void info(double radius3){
    System.out.println("Radius = " + radius3);
    System.out.println("Ploshad kruga = " + ploshad(radius3));
    System.out.println("Dlina okruzhnosty = " + dlina(radius3));
    }
}

class Zadacha2Test{
    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.ploshad(5);
        Zadacha2.dlina(7.5);
        z.info(3);

    }
}

