package homework2.task3;

import java.util.Scanner;

/*
Дано целое число. Если оно является положительным,
то прибавить к нему 1.Если отрицательным, то вычесть
из него 2. Если нулевым, то заменить его на 10.
Вывести полученное число.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        if (number > 0) {
            number += 1;
        }
        if (number < 0) {
            number -= 2;
        }
        if (number == 0) {
            number = 10;
        }
        System.out.println("Received number: " + number);
    }
}
