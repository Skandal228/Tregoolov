package ClassWork.Lesson3_arithmetic_and_boolean_data_type;

/* Арифметические и логические типы данных */

public class Lesson3 {
    public static void main (String [] args){
        int a=3;
        int b=5;
        int c=5;

        boolean b1=a>=b;
        boolean b2 = 5<=5;
        boolean b3 = c!=b;

        boolean x=true;
        boolean y = false;
        boolean z = true;
        boolean resoult = x||y||z;
        System.out.println(resoult);
    }
}
