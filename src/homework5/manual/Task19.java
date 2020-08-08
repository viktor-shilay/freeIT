package homework5.manual;

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {
        String str = "       Строка  в Java представляет собой последовательность символов  ";
        /*int words = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (i == str.length()-1){
                    words++;
                    break;
                }else if (str.charAt(i+1) == ' '){
                    words++;
                }
            }
        }
        System.out.println("Total words: " + words);*/

        StringTokenizer strToken = new StringTokenizer(str, " ");
        int totalWords = 0;
        while (strToken.hasMoreTokens()){
            String word = strToken.nextToken();
            totalWords++;
            System.out.println(word);
        }
        System.out.println("Total words: " + totalWords);
    }
}
