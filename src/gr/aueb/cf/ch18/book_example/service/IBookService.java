package gr.aueb.cf.ch18.book_example.service;

import gr.aueb.cf.ch18.book_example.core.exceptions.BookNotFoundException;
import gr.aueb.cf.ch18.book_example.dto.BookInsertDTO;
import gr.aueb.cf.ch18.book_example.dto.BookReadOnlyDTO;

import java.util.List;

public interface IBookService {

    boolean createNewBook(BookInsertDTO dto);
    void deleteBookByIsbn(String isbn) throws BookNotFoundException;
    BookReadOnlyDTO getBookByIsbn(String isbn) throws BookNotFoundException;
    List<BookReadOnlyDTO> getAllBooks();
}
