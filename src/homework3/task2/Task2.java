package homework3.task2;

/*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task2 {
    public static void main(String[] args) {
        int amoebasQuantity = 1;
        int hours = 24;
        for (int i = 3; i<=hours; i += 3){
            amoebasQuantity *= 2;
            System.out.println("Quantity of amoebas after " + i + " hours: " + amoebasQuantity);
        }
    }
}
