package homework5.manual;

/*
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */

public class Task21 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long millis1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str+=i;
        }
        System.out.println("String concatination time: " + (System.currentTimeMillis()-millis1));

        long millis2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        System.out.println("StringBuilder concatination time: " + (System.currentTimeMillis()-millis2));

        long millis3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("StringBuffer concatination time: " + (System.currentTimeMillis()-millis3));
    }
}
