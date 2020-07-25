package homework3.manual.task15;

import java.util.Arrays;
import java.util.Random;

/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

public class Task15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 11;
        int [] arr = new int[size];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i =0 ; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
