package homework2.task2;

import java.util.Scanner;

/*
Треугольник существует только тогда, когда сумма любых двух
его сторон больше третьей. Определить существует ли такой треугольник.
Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить
длину каждого отрезка-стороны с суммой двух других. Если хотя бы в одном
случае отрезок окажется больше суммы двух других, то треугольника с такими
сторонами несуществует.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1-st side of triangle:");
        int a = scan.nextInt();
        System.out.println("Enter 2-nd side of triangle:");
        int b = scan.nextInt();
        System.out.println("Enter 3-rd side of triangle:");
        int c = scan.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("This triangle exists!");
        }else {
            System.out.println("This triangle doesn't exist!");
        }
    }
}
