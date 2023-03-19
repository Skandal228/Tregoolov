package ClassWork.Lesson_13_Switch;
// Рассмотрим дни и недели, как работает наш работник.
public class Employee {
    public static void main(String[] args) {
        switch ("voskresenie"){
            case "ponedelnik":
                System.out.println("Rabota do 18:00");
                break;
            case "vtornik":
                System.out.println("Rabota do 18:00");
                break;
            case "sreda":
                System.out.println("Rabota do 18:00");
                break;
            case "chetverg":
                System.out.println("Rabota do 18:00");
                break;
            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("takogo dnya ne sushestvuet");


        }
    }
}
