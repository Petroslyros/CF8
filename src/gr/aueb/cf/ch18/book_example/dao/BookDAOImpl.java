package gr.aueb.cf.ch18.book_example.dao;

import gr.aueb.cf.ch18.book_example.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDAOImpl implements IBookDAO{

    private final List<Book> books = new ArrayList<>();

    @Override
    public void saveOrUpdate(Book book) {
        int index = books.indexOf(book); //only works of we ovveride equals

        if(index != -1){
            books.set(index,book);
            return;
        }
        books.add(book);
    }

    @Override
    public void remove(String isbn) {
        books.removeIf(b -> b.getIsbn().equals(isbn));
    }

    @Override
    public Optional<Book> getByIsbn(String isbn) {
        return books.stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst();
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
