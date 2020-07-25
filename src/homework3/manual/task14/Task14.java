package homework3.manual.task14;

/*Создать массив оценок произвольной длины,
вывести максимальную и минимальную оценку, её (их) номера.
*/

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of estimates:");
        int size = scan.nextInt();
        int [] arr = new int[size];
        int maxEstimate = 0;
        int minEstimate = 0;
        Random rand = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rand.nextInt(10)+1;
            System.out.print(arr[i] + " ");
            if (i==0){                             //Initialize min and max like a first element
                minEstimate = arr[i];
                maxEstimate = arr[i];
                continue;
            }
            if (maxEstimate<arr[i]){
                maxEstimate = arr[i];
            }else if (minEstimate>arr[i]){
                minEstimate = arr[i];
            }
        }
        System.out.println();
        System.out.print("Max estimate is: " + maxEstimate + " and its index(es): ");
        for (int i = 0; i < arr.length; i++) {
            if(maxEstimate == arr[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Min estimate is: " + minEstimate + " and its index(es): ");
        for (int i = 0; i < arr.length; i++) {
            if(minEstimate == arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
