package apis.handler;

import apis.model.Book;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BooksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-07T17:01:10.348764+09:00[Asia/Tokyo]")

public interface BooksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /books/{bookId}
     *
     * @param bookId Book ID (required)
     * @return delete book (status code 204)
     * @see BooksApi#booksBookIdDelete
     */
    default ResponseEntity<Void> booksBookIdDelete(String bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books/{bookId}
     *
     * @param bookId Book ID (required)
     * @return get a book (status code 200)
     * @see BooksApi#booksBookIdGet
     */
    default ResponseEntity<Book> booksBookIdGet(String bookId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"1\", \"title\" : \"TITLE\", \"author\" : \"AUTHOR\", \"author2\" : \"AUTHOR2\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /books/{bookId}
     *
     * @param bookId Book ID (required)
     * @param book  (required)
     * @return create book (status code 201)
     * @see BooksApi#booksBookIdPost
     */
    default ResponseEntity<Void> booksBookIdPost(String bookId,
        Book book) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /books/{bookId}
     *
     * @param bookId Book ID (required)
     * @param book  (required)
     * @return update book (status code 204)
     * @see BooksApi#booksBookIdPut
     */
    default ResponseEntity<Void> booksBookIdPut(String bookId,
        Book book) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books
     *
     * @return get book list (status code 200)
     * @see BooksApi#booksGet
     */
    default ResponseEntity<List<Book>> booksGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"1\", \"title\" : \"TITLE\", \"author\" : \"AUTHOR\", \"author2\" : \"AUTHOR2\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
