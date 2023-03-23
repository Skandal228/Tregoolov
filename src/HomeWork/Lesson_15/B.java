package HomeWork.Lesson_15;
/* Задача:
 * Создать класс В. В классе создать статичный метод который будет выводить на экран время в формате
 * " час:минута:секунда" в интервале от 0 до 6 часов. Если час будет больше единицы и минута кратна 10,
 * то и метод нужно закончить. Если же ( секунда умноженная на час ) больше минуты,
 * то пора переходить на другую минуту. Продемонстрировать данный метод в действии.
 */
public class B {
   public static void vremia (){
       int hour = 0;
       OUTER:
       while (hour<6) {
          int minute = -1;

           MIDLE:
           do {
               minute++;

               if (hour > 1 && minute % 10 == 0) {
                   break OUTER;
               }

               int second = 0;

               INNER:
               while (second < 60) {
                   if (second * hour > minute) {
                       continue MIDLE;
                   }
                   System.out.println(hour + ":" + minute + ":" + second);
                   second++;
               }

           }while (minute < 59) ;
              hour++;

          }
      }
      public static void main(String[] args) {
        vremia();

    }

       }



































