package pl.coderslab.bookspringserviceworkshop.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.bookspringserviceworkshop.exceptions.BookNotFoundException;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    @Override
    public List<BookResponse> getBooks() {
        return bookRepository.findAll().stream()
                .map(BookResponse::toDto)
                .toList();
    }

    @Override
    public BookResponse get(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        return BookResponse.toDto(book);
    }

    @Override
    public void add(BookRequest request) {
        Book book = BookRequest.fromRequest(request);
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void update(BookRequest request) {
        Book book = BookRequest.fromRequest(request);
        bookRepository.save(book);
    }
}
