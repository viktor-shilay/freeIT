package homework10.manual.task29;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RatingList {
    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            ratings.add(rand.nextInt(9) + 2);
        }
        System.out.println("Rating list: " + ratings.toString());
        for (int i = 0; i < ratings.size() ; i++) {
            if (ratings.get(i) < 4){
                ratings.remove(i);
                i--;
            }
        }
        System.out.println("Rating list without unsatisfactory ratings: " + ratings.toString());
    }
}
