package homework7.manual.task24;

/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
 */

public class TimeInterval {
    public static void main(String[] args) {
        TimePoint timePoint1 = new TimePoint(2313123);
        TimePoint timePoint2 = new TimePoint(1,1,1);
        System.out.println(timePoint2.totalSeconds());
        System.out.println(timePoint1.compareTo(timePoint2));
        System.out.println(timePoint2.printTime());
    }
}
