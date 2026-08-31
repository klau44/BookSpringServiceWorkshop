package pl.coderslab.bookspringserviceworkshop.book;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private String title;
    private String author;
    private String type;

    public static BookResponse toDto(Book book) {
        return BookResponse.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .type(book.getType())
                .build();
    }
}
