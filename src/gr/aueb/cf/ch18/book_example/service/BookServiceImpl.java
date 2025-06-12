package gr.aueb.cf.ch18.book_example.service;

import gr.aueb.cf.ch15.quiz.quiz4.Parent;
import gr.aueb.cf.ch18.book_example.core.exceptions.BookNotFoundException;
import gr.aueb.cf.ch18.book_example.core.mapper.Mapper;
import gr.aueb.cf.ch18.book_example.dao.BookDAOImpl;
import gr.aueb.cf.ch18.book_example.dao.IBookDAO;
import gr.aueb.cf.ch18.book_example.dto.BookInsertDTO;
import gr.aueb.cf.ch18.book_example.dto.BookReadOnlyDTO;
import gr.aueb.cf.ch18.book_example.model.Book;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookServiceImpl implements IBookService{

    private final IBookDAO bookDAO = new BookDAOImpl();


    @Override
    public boolean createNewBook(BookInsertDTO dto) {

        Book book = Mapper.mapToModeEntity(dto);
        bookDAO.saveOrUpdate(book);
        return true;
    }

    @Override
    public void deleteBookByIsbn(String isbn) throws BookNotFoundException {
        try {
            Book book = bookDAO.getByIsbn(isbn)
                    .orElseThrow(() -> new BookNotFoundException("Book with isbn " + isbn + "not found"));
            bookDAO.remove(isbn);

        } catch (BookNotFoundException e) {
            System.err.println(LocalDateTime.now() + "The book with isbn "+ isbn + "cannot be found" + e);
            throw e;
        }
    }

    @Override
    public BookReadOnlyDTO getBookByIsbn(String isbn) throws BookNotFoundException {
        try {
            Book book = bookDAO.getByIsbn(isbn)
                    .orElseThrow(() -> new BookNotFoundException("Book with isbn " + isbn + "not found"));
            return Mapper.bookReadOnlyDTO(book);

        } catch (BookNotFoundException e){
            System.err.println(LocalDateTime.now() + "The book with isbn " + isbn + " cannot be found" + e.toString());
            throw e;
        }
    }

    @Override
    public List<BookReadOnlyDTO> getAllBooks() {

        return bookDAO.getBooks().stream()
                .map(Mapper::bookReadOnlyDTO)
                .collect(Collectors.toList());


//        List<BookReadOnlyDTO> bookReadOnlyDTOS = new ArrayList<>();
//        List<Book> books = bookDAO.getBooks();
//
//        for(Book book : books){
//            bookReadOnlyDTOS.add(Mapper.bookReadOnlyDTO(book));
//        }
//
//        return bookReadOnlyDTOS;
    }
}
