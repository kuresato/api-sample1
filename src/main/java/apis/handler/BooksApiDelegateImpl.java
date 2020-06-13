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
        Book book = new Book();
        book.id("id1");
        book.title("title1");
        book.author("author1");
        book.author2("author1-2");
        books.add(book);

        //return ResponseEntity.ok().body(books);
        return ResponseEntity.ok(books);
    }
    
}
