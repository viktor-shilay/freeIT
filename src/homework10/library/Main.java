package homework10.library;

public class Main {
    public static void main(String[] args) {
                       //Part 1
        /*Library library = new Library();
        Book book1 = new Book(1, "Java. Methods of programming", new Genre("наука"));
        Book book2 = new Book(1, "Java SE 8", new Genre("наука"));
        Book book3 = new Book(3, "Принц и нищий", new Genre("роман"));
        Book book4 = new Book(5, "Думай и богатей", new Genre("психология"));
        Book book5 = new Book(7, "Гарри Поттер", new Genre("фентези"));
        Book book6 = new Book(9, "Белый Клык", new Genre("роман"));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println(library.getAllBooks().toString());
        Collections.sort(library.getAllBooks(),new AscendingComparator());
        System.out.println(library.getAllBooks().toString());

        library.deleteBook(5);
        library.deleteBook(2);
        System.out.println(library.getAllBooks().toString());
        System.out.println("----------");
        library.sortByAdd();
        System.out.println(library.getAllBooks().toString());
        library.editBook(book1);
        System.out.println(library.getAllBooks().toString());*/

                    //Part 2
        LibraryApp libraryApp = new LibraryApp();
        libraryApp.start();
    }
}
