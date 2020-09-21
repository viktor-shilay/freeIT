package homework12.manual.task34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */

public class Task34 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Integer> numbers = new HashSet<>();
        try(FileInputStream fis = new FileInputStream("src\\homework12\\manual\\task34\\task34.txt")){
            int i;
            while ((i=fis.read())!=-1){
                stringBuilder.append((char)i);
            }
            int sum = 0;
            String text = new String(stringBuilder);
            Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
            Matcher matcher = pattern.matcher(text);
            System.out.print("All numbers : ");
            while (matcher.find()){
                String strNumber = matcher.group();
                System.out.print(strNumber + " ");
                int intNumber = Integer.parseInt(strNumber);
                sum+=intNumber;
                numbers.add(intNumber);
            }
            System.out.println();
            System.out.println("The sum is: " + sum);
            System.out.println("Numbers without repetitions : " + numbers.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
