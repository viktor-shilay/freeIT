package homework3.task4;

/*Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        int sum = 0;
        if (first < 0 & second < 0) {                       //both odd
            for (int i = 0; i > first; i--) {
                sum -= second;
            }
        } else if (first < 0 & second > 0) {               //first odd, second even
            for (int i = 0; i > first; i--) {
                sum -= second;
            }
        } else {
            for (int i = 1; i <= first; i++) {             //other
                sum += second;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
