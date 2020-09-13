package homework9.manual.task28;

/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
 */

public class TestGenRunner {
    public static void main(String[] args) {
        TestGen<Long> myTestGen = new TestGen<>(new Long[10]);
        System.out.println(myTestGen.get(3));
    }
}
