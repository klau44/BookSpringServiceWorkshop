package pl.coderslab.bookspringserviceworkshop.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Book with id " + id + " was not found");
    }
}
