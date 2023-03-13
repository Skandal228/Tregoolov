package ClassWork.Lesson12;

public class Equals_2 {
    void abc (){
        String str;
        int a =10;

        if (a>=10){
            str ="privet";
        }
        if (a<=10){
            str="poka";
        }
        else {
            str=null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Equals_2 equ1= new Equals_2();
        equ1.abc();
        int a = 10;
        int b=20;
        int maximum = (a>b)? a:b;
        System.out.println(maximum);
    }
}
