package homework5.manual;

/*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
 */

public class Task23 {
    public static void main(String[] args) {
        String str = "<p>Текст</p>\tДобавляет новый абзац текста, по умолчанию выровненный по левому краю. Перед абзацем и после него автоматически добавляются небольшие вертикальные отступы.\n" +
                "<p align=\"center\">Текст</p>\tВыравнивание по центру.\n" +
                "<p align=\"left\">Текст</p>\tВыравнивание по левому краю.\n" +
                "<p align=\"right\">Текст</p>\tВыравнивание по правому краю.\n" +
                "<p align=\"justify\">Текст</p>\tВыравнивание по ширине.";
        String newStr = str.replaceAll("<p.*?>", "<p>");
        System.out.println(newStr);
    }
}
