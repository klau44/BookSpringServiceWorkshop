package pl.coderslab.bookspringserviceworkshop.book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> getBooks();

    Optional<Book> get(Long id);

    void add(Book book);

    void delete(Long id);

    void update(Book book);
}
