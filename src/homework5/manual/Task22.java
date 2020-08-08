package homework5.manual;

/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        String str = "Вот такие числа: 0x1233, 0x141D1, 0x32, 0x156, 0x1232, 0x321313;";
        Pattern pattern = Pattern.compile("0x(\\w*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String number = matcher.group();
            System.out.println("Hexadecimal number: " + number + " - decimal number: " + Integer.decode(number));
        }
    }
}
