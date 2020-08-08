package homework5.manual;

/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class Task20 {
    public static void main(String[] args) {
        String str = "Строка в Java представляет собой последовательность символов... Вот так вот)";
        String [] arr = str.split("[\\p{Punct}\\s]+");
        for (String temp:arr){
            System.out.println(temp);
        }
        for (int i = 0; i<arr.length; i++){
            char c = arr[i].charAt(arr[i].length() - 1);
            System.out.print(c + " ");
        }
    }
}
