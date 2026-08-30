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
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.get(id).orElse(null);
    }

    @PostMapping()
    public void addBook(@RequestBody Book book) {
        bookService.add(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        bookService.update(book);
    }
}
