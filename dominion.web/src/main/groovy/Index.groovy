import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
@RestController
class Index {
    @RequestMapping("/")
    String home() {
        "Hello World!"
    }
}
