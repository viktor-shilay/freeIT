package homework2.task4;

import java.util.Scanner;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

public class Task4 {
    public static void main(String[] args) {
        int positive = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scan.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scan.nextInt();
        if (firstNumber > 0) {
            positive += 1;
        }
        if (secondNumber > 0) {
            positive += 1;
        }
        if (thirdNumber > 0) {
            positive += 1;
        }
        System.out.println("You entered " + positive + " positive number(s)!");
    }
}
