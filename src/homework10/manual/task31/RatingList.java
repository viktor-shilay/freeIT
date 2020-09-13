package homework10.manual.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
 */

public class RatingList {
    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>();
        Random rand = new Random();
        int highRating = 0;
        for (int i = 0; i < 7; i++) {
            ratings.add(rand.nextInt(9) + 2);
        }
        System.out.println(ratings.toString());
        Iterator<Integer> iterator = ratings.iterator();
        while (iterator.hasNext()){
            int rate = iterator.next();
            if (highRating<rate){
                highRating = rate;
            }
        }
        /*for (Integer rate: ratings){
            if (maxRating<rate){
                maxRating = rate;
            }
        }*/
        System.out.println("The highest rating is: " + highRating);
    }
}
