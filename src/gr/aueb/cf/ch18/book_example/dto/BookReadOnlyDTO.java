package gr.aueb.cf.ch18.book_example.dto;

public class BookReadOnlyDTO {
    private String isbn;
    private String title;
    private String author;

    public BookReadOnlyDTO() {}

    public BookReadOnlyDTO(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookReadOnlyDto{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
