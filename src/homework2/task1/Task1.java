package homework2.task1;

import java.util.Scanner;

/*
В переменную записываем число. Надо вывести на экран сколько в
этом числе цифр и положительное оно или отрицательное. Например,
"это однозначное положительное число". Достаточно будет определить,
является ли число однозначным, двузначным или трехзначным и более.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if (number > 1000) {
            System.out.println("It's a positive multi-digit number");
        } else if (number > 100) {
            System.out.println("It's a positive 3-digits number");
        } else if (number > 10) {
            System.out.println("It's a positive 2-digits number");
        } else if (number > 0) {
            System.out.println("It's a positive 1-digits number!");
        } else if (number < -1000) {
            System.out.println("It's negative multi-digit number!");
        } else if (number < -100) {
            System.out.println("It's negative 3-digits number!");
        } else if (number < -10) {
            System.out.println("It's negative 2-digits number!");
        } else if (number < 0) {
            System.out.println("It's negative 1-digit number!");
        } else {
            System.out.println("You entered 0");
        }
    }
}
