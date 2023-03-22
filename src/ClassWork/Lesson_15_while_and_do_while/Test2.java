package ClassWork.Lesson_15_while_and_do_while;
// Мы играем в казино пока денег будет больше 0
public class Test2 {
    public static void main(String[] args) {
        int money =100;
        while (money>0){
            System.out.println("Delayte stavku");
            System.out.println("Vi proigrali");
            money = money-10;
        }
    }
}
