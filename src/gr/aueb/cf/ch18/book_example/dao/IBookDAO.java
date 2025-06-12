package gr.aueb.cf.ch18.book_example.dao;

import gr.aueb.cf.ch18.book_example.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookDAO {

    void saveOrUpdate(Book book);
    void remove(String isbn);
    Optional<Book> getByIsbn(String isbn);
    List<Book> getBooks();
}
