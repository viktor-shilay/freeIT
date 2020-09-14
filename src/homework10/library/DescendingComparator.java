package homework10.library;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
