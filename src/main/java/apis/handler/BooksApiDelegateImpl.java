package apis.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import apis.model.Book;

/**
 * このクラスに処理を実装する
 */
@Service
public class BooksApiDelegateImpl implements BooksApiDelegate {

    @Override
    public ResponseEntity<List<Book>> booksGet() {
        List<Book> books = new ArrayList<Book>();
        books.add(createBook("1", "title1", "author1", "author2"));
        books.add(createBook("2", "title2", "author1", "author2"));

        //return ResponseEntity.ok().body(books);
        return ResponseEntity.ok(books);
    }

    @Override
    public ResponseEntity<Book> booksBookIdGet(String bookId) {
        return ResponseEntity.ok(createBook(bookId, "title"+bookId, "author1", "author2"));
    }

    private Book createBook(String id, String title, String author1, String author2) {
        Book book = new Book();
        book.id(id);
        book.title(title);
        book.author(author1);
        book.author2(author2);
        return book;
    }
}
