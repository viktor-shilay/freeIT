package homework3.manual.task11;

import java.util.Scanner;

/*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number more than 1:");
        boolean isPrime = true;
        int number = scan.nextInt();
        if (number == 2 || number == 3 || number == 5 || number == 7) {       //проверяем 2, 3, 5, 7
            System.out.println("It's a prime number!");
        } else if (number % 2 == 0) {                                        //проверяем делится ли на 2
            System.out.println("It's a composite number!");
        } else {
            for (int i = 3; i * i <= number; i += 2) {                      //далее проверяем делится ли на 3
                if (number % i == 0) {                                      //и далее до корня из введенного числа
                    System.out.println("It's a composite number!");         //с шагом 2
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("It's a prime number!");
            }
        }
    }
}
