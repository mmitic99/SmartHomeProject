package smarthome.authservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
    @GetMapping("/check")
    public ResponseEntity<String> check(){
        return ResponseEntity.ok("auth WORK");
    }
}
