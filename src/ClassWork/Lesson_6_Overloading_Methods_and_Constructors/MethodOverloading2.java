package ClassWork.Lesson_6_Overloading_Methods_and_Constructors;
// Пример с разными Access modifier //
public class MethodOverloading2 {
    int sum(int i1, int i2){
        return i1+i2;
    }

    String sum(String s1, String s2){
        return s1+s2;


    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(5,7);
        System.out.println(a);
        String s =mO2.sum("privet,"  ,"moy drug");
        System.out.println(s);
    }
}
