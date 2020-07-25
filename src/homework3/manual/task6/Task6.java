package homework3.manual.task6;

import java.util.Scanner;

/*
Создайте число. Определите, является ли число трехзначным.
Определите, является ли его последняя цифра семеркой.
Определите, является ли число четным.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        if (number < 1000 & number >= 100 | number > -1000 & number <= -100) {
            System.out.println("It's three-digit number!");
        } else {
            System.out.println("It's not three-digit number!");
        }
        if (String.valueOf(number).endsWith("7")) {
            System.out.println("The number ends with 7!");
        } else {
            System.out.println("The number doesn't end with 7!");
        }
        if (number % 2 == 0) {
            System.out.println("It's even number!");
        } else {
            System.out.println("It's odd number!");
        }
    }
}
