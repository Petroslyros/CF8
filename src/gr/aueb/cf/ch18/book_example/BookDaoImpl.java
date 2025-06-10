package gr.aueb.cf.ch18.book_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDaoImpl implements IBookDAO {

    private static final List<Book> books = new ArrayList<>();

    @Override
    public Book insert(Book book) {
        if (book == null) return null;
        books.add(book);
        return book;
    }

    @Override
    public Book update(long id, Book book) {
        int position;
        position = getIndexById(id);
        if(position == -1) return null;
        books.set(position, book);
        return book;
    }

    @Override
    public void deleteById(long id) {
        books.removeIf(b -> b.getId() == id);
    }

    @Override
    public Book getById(long id) {
       if(getIndexById(id) == -1) return null;
       return books.get(getIndexById(id));
    }

    @Override
    public List<Book> getALl() {
        return new ArrayList<>(books);
    }

    @Override
    public Optional<Book> getByIsbn(String isbn) {
        return books.stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst();
    }

    @Override
    public boolean bookIdExists(long id) {
        return books.stream()
                .anyMatch(b ->b.getId() == id);
    }

    @Override
    public boolean isnbExists(String isbn) {
        return books.stream()
                .anyMatch(b -> b.getIsbn().equals(isbn));
    }

    private int getIndexById(long id) {
        int positionToReturn = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
