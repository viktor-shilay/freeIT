package homework2.task6;

import java.util.Scanner;

/*
Даны 2 числа. Вывести большее из них
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger!");
        } else {
            System.out.println(secondNumber + " is bigger!");
        }
    }
}
