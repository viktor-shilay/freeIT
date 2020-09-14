package homework10.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> listBooks = new ArrayList<>();

    public void addBook(Book book){
        for(Book books: listBooks){
            if (books.getId()==book.getId()){
                System.out.println("Книга с таким Id уже существует!");
                return;
            }
        }
        listBooks.add(book);
        System.out.println("Книга успешно добавлена!");
    }
    public ArrayList<Book> getAllBooks(){
        return listBooks;
    }

    public void deleteBook (int id){
        for (Book books: listBooks){
            if (books.getId()==id){
                listBooks.remove(books);
                System.out.println("Книга успешно удалена!");
                return;
            }
        }
        System.out.println("Книги с таким id не существует!");
    }

    public void editBook(Book book){
        for (Book books: listBooks){
            if (books.equals(book)){
                System.out.println("Введите новое название книги:");
                Scanner scan = new Scanner(System.in);
                String str1 = scan.nextLine();
                books.setTitle(str1);
                System.out.println("Введите новый жанр книги:");
                String str2 = scan.nextLine();
                books.setGenreId(new Genre(str2));
            }else {
                System.out.println("Такой книги нет в библиотеке!");
            }
        }
    }
    public ArrayList<Book> sortByAdd (){
        ArrayList<Book> temp = new ArrayList<>();
        for (int i = listBooks.size()-1; i>=0; i--){
            temp.add(listBooks.get(i));
        }
        listBooks=temp;
        return listBooks;
    }
}
