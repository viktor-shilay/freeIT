package homework12.task2;

/*
Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл

 */

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\homework12\\task2\\text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\homework12\\task2\\task2.txt"))){
            String text = "";
            String line;
            while ((line = bufferedReader.readLine())!=null){
                text+=line;
            }
            String [] sentences = text.split("[.!?]\\s*");
            for (String sentence: sentences){
                if (TextFormatter.containsPolyndroms(sentence)){
                    bufferedWriter.write(sentence + "\n");
                }else if(TextFormatter.numberWords(sentence) > 3 & TextFormatter.numberWords(sentence) <=5 ){
                    bufferedWriter.write(sentence+ "\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
