package homework10.library;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private Genre genreId;

    public Book(int id, String title, Genre genreId) {
        this.id = id;
        this.title = title;
        this.genreId = genreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(genreId, book.genreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genreId);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title:'" + title + '\'' +
                ", "+ genreId +
                '}';
    }
}
