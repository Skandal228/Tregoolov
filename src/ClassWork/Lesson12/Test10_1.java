package ClassWork.Lesson12;

public class Test10_1 {
    public static void main(String[] args) {
        int salary = 1500;
        boolean b =true;

        if (salary<200){
            System.out.println("Z/P ochen nizka");
        } else if (salary<400 && b==false || !true){
            System.out.println("Z/P srednego razmera");
        } else if (salary<600){
            System.out.println("Z/P visokaya");
        } else {
            System.out.println("Z/P otlichnaya");
        }
    }
}
