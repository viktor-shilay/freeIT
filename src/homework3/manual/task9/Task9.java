package homework3.manual.task9;

/*Изменить пример с суммой чисел таким образом,
 чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
 */

public class Task9 {
    public static void main(String[] args) {
        double average;
        double composition = 1;
        int n =0;
        int number = (int)(Math.random()*20);
        System.out.print("Random number is: " + number);
        while(number!=0){
            composition*=number;
            n++;
            number--;
        }
        System.out.println(" and its factorial is: " + composition);
        if (n!=0){
            average =composition/n;
        }else{
            average = 0;
        }
        System.out.println("Average of numbers is: " + average);
    }
}
