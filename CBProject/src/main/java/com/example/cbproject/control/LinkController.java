package com.example.cbproject.control;
import com.example.cbproject.domain.Link;
import com.example.cbproject.service.LinkService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class LinkController {
    private LinkService linkService;
    @PostMapping("/hello")
    public String save() {
        return "Hello World!";
    }
    @PostMapping("/link")
    public ResponseEntity<?> save(@RequestBody Link link){
        return new ResponseEntity<>(linkService.create(link), HttpStatus.CREATED);
    }
}
