package homework3.manual.task8;

import java.util.Random;

/*Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(Integer.MAX_VALUE);
        int remainder = x % 100;
        if (remainder < 11 || remainder > 14) {
            remainder = x % 10;
            if (remainder == 1) {
                System.out.println(x + " рубль");
            } else if (remainder >= 2 && remainder <= 4) {
                System.out.println(x + " рубля");
            } else {
                System.out.println(x + " рублей");
            }
        } else {
            System.out.println(x + " рублей");
        }
    }
}
