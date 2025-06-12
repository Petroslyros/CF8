package gr.aueb.cf.ch18.book_example.core.mapper;

import gr.aueb.cf.ch18.book_example.dto.BookInsertDTO;
import gr.aueb.cf.ch18.book_example.dto.BookReadOnlyDTO;
import gr.aueb.cf.ch18.book_example.model.Book;

public class Mapper {

    private Mapper(){}

    // take user input and create a real Book object you can save
    public static Book mapToModeEntity(BookInsertDTO dto){

        return new Book(dto.getIsbn(),dto.getTitle(),dto.getAuthor());
    }
    // return data safely to the user or frontend
    public static BookReadOnlyDTO bookReadOnlyDTO(Book book){

        return new BookReadOnlyDTO(book.getIsbn(),book.getTitle(),book.getAuthor());
    }
}
