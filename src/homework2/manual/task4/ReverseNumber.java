package homework2.manual.task4;

import java.util.Scanner;

/*
Определить число, полученное выписыванием в обратном порядке
цифр любого 4-х значного натурального числа n.
Решение без использования условных операторов, циклов, преобразований и т.д.!!!
 */

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 4-digits number:");
        int myInt = scan.nextInt();
        int remainder;
        System.out.println("Your reverse number:");
        remainder = myInt % 10;
        System.out.print(remainder);
        myInt /= 10;
        remainder = myInt % 10;
        System.out.print(remainder);
        myInt /= 10;
        remainder = myInt % 10;
        System.out.print(remainder);
        myInt /= 10;
        remainder = myInt % 10;
        System.out.print(remainder);
    }
}
