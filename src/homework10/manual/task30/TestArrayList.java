package homework10.manual.task30;

/*
Создать коллекцию, наполнить ее случайными числами.
Удалить повторяющиеся числа.
 */

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> testAL = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            testAL.add(rand.nextInt(11));
        }
        System.out.println("Collection before: " + testAL.toString());

        Set<Integer> testHS = new HashSet<>();
        testHS.addAll(testAL);
        System.out.println("Collection after: " + testHS.toString());
    }
}
