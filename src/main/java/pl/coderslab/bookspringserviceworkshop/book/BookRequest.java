package pl.coderslab.bookspringserviceworkshop.book;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public static Book fromRequest(BookRequest request) {
        return Book.builder()
                .isbn(request.getIsbn())
                .title(request.getTitle())
                .author(request.getAuthor())
                .publisher(request.getPublisher())
                .type(request.getType())
                .build();
    }
}
