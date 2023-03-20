package HomeWork.Lesson_14;
/* Задача:
* Создать класс В. В классе создать статичный метод который будет выводить на экран время в формате
* " час:минута:секунда" в интервале от 0 до 6 часов. Если час будет больше единицы и минута кратна 10,
* то и метод нужно закончить. Если же ( секунда умноженная на час ) больше минуты,
* то пора переходить на другую минуту. Продемонстрировать данный метод в действии.
*/
public class B {
    public static void time() {
OUTER:
        for (int hours = 0; hours <= 6; hours++) {
            MIDLE:
            for (int minutes = 0; minutes <= 60; minutes++) {
                if (hours >= 1 && minutes %10==0)  // кратна значит % без остатка
                {break OUTER;}
                    INEER:
                    for (int seconds = 0; seconds <= 59; seconds++) {
                if (seconds*hours>minutes){continue MIDLE;}
                System.out.println(hours + ":" + minutes + ":" + seconds);}


                }
            }
        }
        public static void main(String[] args) {
        time();
        }
    }






