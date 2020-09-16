package homework12.manual.task33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */

public class Task33 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] punctMarks = {'.', ',', ';', ':', '!', '?', '-', '"', '(', ')'};
        int counterPunctMarks = 0;
        try (FileInputStream fis = new FileInputStream("task33.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                stringBuilder.append((char) i);
                for (char punctMark : punctMarks) {
                    if (i == (int) punctMark) {
                        counterPunctMarks++;
                    }
                }
            }
            System.out.println("Number of punctuation marks: " + counterPunctMarks);
            String text = new String(stringBuilder);
            String[] words = text.split("[\\p{Punct}\\s]+");
            System.out.println("Number of words " + words.length);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");;
        }
    }
}
