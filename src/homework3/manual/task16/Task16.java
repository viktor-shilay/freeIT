package homework3.manual.task16;

import java.util.Random;

/*Определите сумму элементов одномерного массива,
расположенных между минимальным и максимальным значениями.
 */

public class Task16 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random rand = new Random();
        int maxElement = 0;
        int maxIndex = 0;
        int minElement = 0;
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
            if (i==0){                             //Initialize min and max like a first element
                minElement = arr[i];
                maxElement = arr[i];
            }
            else if (maxElement<arr[i]){          //Find max element and its index
                maxElement = arr[i];
                maxIndex = i;
            }
            else if (minElement>arr[i]){          //Find min element and its index
                minElement = arr[i];
                minIndex = i;
            }
        }
        System.out.println();
        if (minIndex<maxIndex){                           // Count the sum
            for(;minIndex<=maxIndex; minIndex++){         // if min element before max element
                sum+=arr[minIndex];
            }
        }else if (minIndex>maxIndex){
            for(;maxIndex<=minIndex; maxIndex++){        // if min element after max element
                sum+=arr[maxIndex];
            }
        }
        System.out.println("The sum between max and min elements is: " + sum);
    }
}
