package homework3.manual.task12;

import java.util.Scanner;

/*Найдите сумму первых n целых чисел, которые делятся на 3.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an interval: \n From :");
        int from = scan.nextInt();
        System.out.println("To:");
        int to = scan.nextInt();
        int sum = 0;
        int temp;
        if (from > to) {             //swap if from > to
            temp = from;
            from = to;
            to = temp;
        }
        for (; from < to; from++) {
            if (from % 3 == 0) {
                sum += from;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
