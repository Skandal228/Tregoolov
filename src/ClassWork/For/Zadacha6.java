package ClassWork.For;

/*Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник из восьмёрок со сторонами (катетами) 10 и 10.
То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888*/
public class Zadacha6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            int starCount = i+1;
            for (int j = 0; j < starCount; j++)
                System.out.print("8");
            System.out.println();
        }
        }}


