package homework12.task3;

/*
Проверка на цензуру:
Создаете 2 файла.
1-й. Содержит исходный текст.
2-й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
 */

import java.io.*;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        try (BufferedReader textReader = new BufferedReader(new FileReader("src\\homework12\\task3\\text.txt"));
             BufferedReader blackListReader = new BufferedReader(new FileReader("src\\homework12\\task3\\blackList.txt"))) {
            String str;
            String text = "";
            while ((str = textReader.readLine()) != null) {
                text += str;
            }
            String blackList = "";
            while ((str = blackListReader.readLine()) != null) {
                blackList += str;
            }
            String[] blockWords = blackList.split(",");     //разбиваем наши слова)
            String[] sentences = text.split("[.!?]\\s");    //разбиваем предложения по знаку препинания с пробелом)
            ArrayList<String> blockSentences = new ArrayList<>();
            for (String sentence : sentences) {
                for (String blockWord : blockWords) {
                    if (sentence.toLowerCase().contains(blockWord)) {    // все предложения в LowerCase, чтобы игнорировать регистр символов
                        blockSentences.add(sentence);
                    }
                }
            }
            if (blockSentences.size() == 0) {
                System.out.println("The text was successfully verified!");
            } else {
                System.out.println("Unverified sentences: " + blockSentences.size());
                System.out.println("Please, correct the following sentences:");
                for (String blockSentence : blockSentences) {
                    System.out.println(blockSentence);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
