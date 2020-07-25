package homework3.manual.task13;

/*Создать последовательность случайных чисел,
найти и вывести наибольшее из них.
 */

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int[10];
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rand.nextInt(40)-20;
            if (i == 0){                         //Initialize max like a first element
                max = arr[0];
            }
            System.out.print(arr[i] + " ");
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("\n" + max);
    }
}
