package homework10.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {

    private boolean running = true;

    Library library = new Library();

    public void start() {
        System.out.println("*************Вы в библиотеке:)*************");
        while (running) {
            System.out.println("Выберите действие (0-4):\n"
                    + "Чтобы вывести все книги, нажмите 1\n"
                    + "Чтобы добавить книгу, нижмите 2\n"
                    + "Чтобы удалить книгу, нажмите 3\n"
                    + "Чтобы редактировать книгу, нажмите 4\n"
                    + "Чтобы выйти из библиотеки, нажмите 0.");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 1:
                        printAllBooks();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        deleteBook();
                        break;
                    case 4:
                        editBook();
                        break;
                    case 0:
                        System.out.println("*************ПОКААААА:)*************");
                        running = false;
                        break;
                    default:
                        System.out.println("Неверный ввод! Сделайте правильный выбор.");
                }
            } else {
                System.out.println("Неверный ввод! Сделайте правильный выбор.");
            }
        }
    }

    private void printAllBooks() {

        ArrayList<Book> books = new ArrayList<>(library.getAllBooks());  //копия списка книг, для правильной третьей сортировки

        System.out.println("Как вы хотите отсортировать список книг? (Введите 0-3)\n"
                + "Чтобы отсортировать книги по алфавиту по возрастанию, нажмите 1\n"
                + "Чтобы отсортировать книги по алфавиту по убыванию, нажмите 2\n"
                + "Чтобы отсортировать книги по добавлению (сначала новые, затем старые), нажмите 3\n"
                + "Чтобы выйти из библиотеки, нажмите 0.");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            switch (scan.nextInt()) {
                case 1:
                    books.sort(new AscendingComparator());
                    System.out.println("Книги, отсортированные по алфавиту по возрастанию: \n" + books.toString());
                    break;
                case 2:
                    books.sort(new DescendingComparator());
                    System.out.println("Книги, отсортированные по алфавиту по убыванию: \n" + books.toString());
                    break;
                case 3:
                    System.out.print("[");
                    for (int i = library.getAllBooks().size() - 1; i >= 0; i--) {
                        System.out.println(library.getAllBooks().get(i) + ", ");
                    }
                    System.out.print("]\n");
                    break;
                case 0:
                    System.out.println("*************ПОКААААА:)*************");
                    running = false;
                    break;
                default:
                    System.out.println("Неверный ввод! Сделайте правильный выбор.");
            }
        } else {
            System.out.println("Неверный ввод! Сделайте правильный выбор.");
        }
    }

    private void addBook() {
        System.out.println("Для добавления книги вам нужно ввести 3 параметра (id, название, жанр)");
        System.out.println("Введите id:");
        boolean mark = true;
        int id = 0;
        while (mark) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                id = scan.nextInt();
                if (library.getAllBooks().isEmpty()) {
                    mark = false;
                }
                for (Book book : library.getAllBooks()) {
                    if (book.getId() != id) {
                        mark = false;
                    } else {
                        System.out.println("Книга с таким id уже существует!");
                        mark = true;
                    }
                }
            } else {
                System.out.println("Неверный ввод! Введите корректный id!");
            }
        }
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String title = scanStr.nextLine();
        System.out.println("Введите жанр книги:");
        String genre = scanStr.nextLine();
        library.getAllBooks().add(new Book(id, title, new Genre(genre)));
    }

    private void deleteBook() {
        System.out.println("Введите id книги, которую необходимо удалить:");
        boolean mark = true;
        while (mark) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                mark = false;
                int id = scan.nextInt();
                for (int i = 0; i < library.getAllBooks().size(); i++) {
                    if (library.getAllBooks().get(i).getId() == id) {
                        library.getAllBooks().remove(i);
                        System.out.println("Книга успешно удалена!");
                        return;
                    }
                }
                System.out.println("Книги с таким id не существует!");
            } else {
                System.out.println("Неверный ввод! Введите корректный id!");
            }
        }
    }

    private void editBook() {
        if (library.getAllBooks().isEmpty()) {
            System.out.println("Библиотека пуста!");
            return;
        }
        System.out.println("Для редактирования книги вам нужно ввести 3 параметра книги (id, название, жанр)");
        boolean exist = false;
        boolean mark = true;
        int id = 0;
        System.out.println("Введите id:");
        while (!exist) {
            while (mark) {                                                             //для проверки
                Scanner scan = new Scanner(System.in);                                 //ввода
                if (scan.hasNextInt()) {                                               //пользователя
                    mark = false;                                                      //
                    id = scan.nextInt();
                    for (Book book : library.getAllBooks()) {
                        if (book.getId() != id) {
                            System.out.println("Книги с таким id не существует.");
                            return;
                        } else {
                            exist = true;
                        }
                    }
                } else {
                    System.out.println("Неверный ввод! Введите корректный id!");
                }
            }
        }
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Введите новое название книги:");
        String title = scanStr.nextLine();
        System.out.println("Введите новый жанр книги:");
        String genre = scanStr.nextLine();
        for (int i = 0; i < library.getAllBooks().size(); i++) {
            if (library.getAllBooks().get(i).getId() == id) {
                library.getAllBooks().get(i).setTitle(title);
                library.getAllBooks().get(i).setGenreId(new Genre(genre));
            }
        }
    }
}
