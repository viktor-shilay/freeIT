package homework12.task2;

public class TextFormatter {

    public static int numberWords(String str){
        String [] words = str.split("[\\s–:]+");
        return words.length;
    }

    public static boolean containsPolyndroms(String str){
        String [] words = str.split(" ");
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            String reverse = stringBuilder.toString();
            if (word.toLowerCase().equals(reverse.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
