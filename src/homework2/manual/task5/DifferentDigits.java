package homework2.manual.task5;

import java.util.Scanner;

/*
Дано любое 4-х значное число. Верно ли, что все цифры числа различны?
Тоже примитиное топорное решение без ухищрений)
 */

public class DifferentDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 4-digits number:");
        int myInt = scan.nextInt();
        int remainder1, remainder2, remainder3, remainder4;
        remainder1 = myInt % 10;
        myInt /= 10;
        remainder2 = myInt % 10;
        myInt /= 10;
        remainder3 = myInt % 10;
        myInt /= 10;
        remainder4 = myInt % 10;
        if(remainder1 != remainder2 & remainder1 != remainder3 & remainder1 != remainder4 &
                remainder2 != remainder3 & remainder2 != remainder4 & remainder3 != remainder4){
            System.out.println("All digits of the number are different!");
        }else {
            System.out.println("Not all digits of the number are different!");
        }
    }
}
