package ClassWork.Lesson_16_class_String;
// Микрозадачка на method chaning
public class Test7 {
    public static void main(String[] args) {
        String s1= "Hello World";
        String s2= "Urrraaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Urrraaaaaa", "УРА").substring(6,10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
