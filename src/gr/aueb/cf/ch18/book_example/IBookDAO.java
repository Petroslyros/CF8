package gr.aueb.cf.ch18.book_example;

import java.util.List;
import java.util.Optional;

public interface IBookDAO {
    Book insert(Book book);
    Book update(long id, Book book);
    void deleteById(long id);
    Book getById(long id);
    List<Book> getALl();
    Optional<Book> getByIsbn(String isbn);
    boolean bookIdExists(long id);
    boolean isnbExists(String isbn);
}
