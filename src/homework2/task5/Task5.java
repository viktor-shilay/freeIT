package homework2.task5;

/*
Даны 3 целых числа. Найти количество положительных и
отрицательных чисел в исходном наборе.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        if (firstNumber > 0) {
            positive += 1;
        } else {
            negative += 1;
        }
        if (secondNumber > 0) {
            positive += 1;
        } else {
            negative += 1;
        }
        if (thirdNumber > 0) {
            positive += 1;
        } else {
            negative += 1;
        }
        System.out.println("You entered " + positive + " positive and " + negative + " negative number(s)!");
    }
}
