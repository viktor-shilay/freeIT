package homework12.task1;

/*
В исходном файле находятся слова, каждое слово на новой строке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы.
 */

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\homework12\\task1\\strings.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\homework12\\task1\\polyndroms.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(s);
                stringBuilder.reverse();
                String str = stringBuilder.toString();
                if (s.toLowerCase().equals(str.toLowerCase())) {
                    bufferedWriter.write(s + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
