package homework3.manual.task10;

import java.util.Random;

/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(6) + 10;
        System.out.println("Random number is: " + number);
        long result = 1;
        while (number > 0){
            result *= number;
            number--;
        }
        System.out.println("And its factorial is:  " + result);
    }
}
