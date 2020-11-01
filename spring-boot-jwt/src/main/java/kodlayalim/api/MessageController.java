package kodlayalim.api;

/**
 * created by: ufuk on 5.10.2020 21:40
 */
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("message");
    }
}
