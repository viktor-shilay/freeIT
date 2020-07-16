package homework2.task7;

import java.util.Scanner;

/*В переменную записываете количество программистов.
В зависимости от количества программистов необходимо
вывести правильно окончание. Например: • 2 программиста
• 1 программиста • 10 программистов • и т.д.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число программистов:");
        int countOfProgrammers = scan.nextInt();
        int remainder = countOfProgrammers % 100;
        if (remainder < 11 || remainder > 14) {
            remainder = countOfProgrammers % 10;
            if (remainder == 1) {
                System.out.print(countOfProgrammers + " программист");
            } else if (remainder >= 2 && remainder <= 4) {
                System.out.print(countOfProgrammers + " программиста");
            } else {
                System.out.print(countOfProgrammers + " программистов");
            }
        } else {
            System.out.print(countOfProgrammers + " программистов");
        }
    }
}
