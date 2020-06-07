package apis.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-07T17:01:10.348764+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi.sample1.base-path:}")
public class BooksApiController implements BooksApi {

    private final BooksApiDelegate delegate;

    public BooksApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BooksApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BooksApiDelegate() {});
    }

    @Override
    public BooksApiDelegate getDelegate() {
        return delegate;
    }

}
