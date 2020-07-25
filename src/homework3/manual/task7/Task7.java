package homework3.manual.task7;

import java.util.Scanner;

/*Имеется прямоугольное отверстие размерами a и b,
определить, можно ли его полностью закрыть круглой
картонкой радиусом r.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a-side: ");
        double a = scan.nextDouble();
        System.out.println("Enter b-side: ");
        double b = scan.nextDouble();
        System.out.println("Enter radius of round cardboard:");
        double radius = scan.nextDouble();
        if ((radius*2)*(radius*2) >= a*a + b*b) {
            System.out.println("You can close a round cardboard with radius " + radius);
        } else {
            System.out.println("You cannot close a round cardboard with radius " + radius);
        }
    }
}
