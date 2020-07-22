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
        int reverse;
        System.out.println("Your reverse number:");
        remainder = myInt % 10;
        reverse = remainder*1000;
        myInt /= 10;
        remainder = myInt % 10;
        reverse = reverse + (remainder*100);
        myInt /= 10;
        remainder = myInt % 10;
        reverse = reverse + (remainder*10);
        myInt /= 10;
        remainder = myInt % 10;
        reverse = reverse+remainder;
        System.out.println(reverse);
    }
}
