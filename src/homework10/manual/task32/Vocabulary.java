package homework10.manual.task32;

/*
Имеется текст. Следует составить для него частотный словарь.
 */

import java.util.HashMap;
import java.util.Map;

public class Vocabulary {
    public static void main(String[] args) {
        String text = ("Интерфейс Map<K, V> представляет отображение или иначе говоря словарь," +
                " где каждый элемент представляет пару \"ключ-значение\". При этом все ключи" +
                " уникальные в рамках объекта Map. Такие коллекции облегчают поиск элемента," +
                " если нам известен ключ - уникальный идентификатор объекта.\n" +
                "Следует отметить, что в отличие от других интерфейсов, которые представляют" +
                " коллекции, интерфейс Map НЕ расширяет интерфейс Collection.\n"+
                "Чтобы положить объект в коллекцию, используется метод put, а чтобы получить" +
                " по ключу - метод get. Реализация интерфейса Map также позволяет получить " +
                "наборы как ключей, так и значений. А метод entrySet() возвращает набор всех" +
                " элементов в виде объектов Map.Entry<K, V>.").toLowerCase();
        String [] words = text.split("(?U)\\W+");
        HashMap<String, Integer> vocabulary = new HashMap<>();

        for (String word : words) {
            vocabulary.put(word, vocabulary.containsKey(word) ? vocabulary.get(word) + 1 : 1);
        }

        System.out.printf("%-15s%s%n","Слово", "Частота повторения");
        System.out.println("-------------------------------------");
        for (Map.Entry<String, Integer> entry: vocabulary.entrySet()){
            System.out.printf("%-15s%d раз %n", entry.getKey(), entry.getValue());
        }
    }
}
