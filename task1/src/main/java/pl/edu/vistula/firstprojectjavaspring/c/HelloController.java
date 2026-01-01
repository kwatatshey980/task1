package pl.edu.vistula.firstprojectjavaspring.c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String Hello() {
        return "Hello Vistula, in my first Spring controller.";
    }
}
//http://localhost:8080/