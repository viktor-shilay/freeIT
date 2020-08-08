package homework5.manual;

/*Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество.
 */

public class Task18 {
    public static void main(String[] args) {
        String str = " Строка в Java представляет собой последовательность символов. Для\n" +
                "создания и манипулирования строками в Java существует класс java.lang.String.\n" +
                "Данный класс является неизменяемым (immutable). Понятно?!;";
        char [] punctuationMarks = {'.',',',';',':','!','?','—','"','(',')'};
        System.out.println(str);
        int totalMarks = 0;
        char symbol;
        for (int i = 0; i<str.length(); i++){
            symbol = str.charAt(i);
            for (int j = 0; j<punctuationMarks.length; j++){
                if (symbol == punctuationMarks[j]){
                    totalMarks++;
                }
            }
        }
        System.out.println("Total punctuation marks: " + totalMarks);
    }
}