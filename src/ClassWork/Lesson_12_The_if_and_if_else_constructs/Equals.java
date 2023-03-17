package ClassWork.Lesson_12_The_if_and_if_else_constructs;

public class Equals {
    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum -" + i2);
        } else {
            System.out.println("Maximum -" + i3);
        }
    }


    public static void main(String[] args) {
        Equals Eq1 = new Equals();
        Eq1.maximum(4, 7, 0);
    }
}





