package ClassWork.Lesson6;

public class Test1 {
    int sum(int a, int b, int c){
        return a+b+c;
    }
// Лучше вызвать метод sum внутри метода sredarif.
    int sredarif ( int a, int b, int c){
        return sum (a,b,c)/3;
    }
}
