package pl.coderslab.bookspringserviceworkshop.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<BookResponse> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable Long id) {
        return bookService.get(id);
    }

    @PostMapping()
    public void addBook(@RequestBody BookRequest request) {
        bookService.add(request);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PutMapping
    public void updateBook(@RequestBody BookRequest request) {
        bookService.update(request);
    }
}
