package pl.coderslab.bookspringserviceworkshop.book;

import java.util.List;

public interface IBookService {
    List<BookResponse> getBooks();

    BookResponse get(Long id);

    void add(BookRequest book);

    void delete(Long id);

    void update(BookRequest book);
}
