package apis.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-28T15:38:15.832335+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi.sample1.base-path:}")
public class BooksApiController implements BooksApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BooksApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
