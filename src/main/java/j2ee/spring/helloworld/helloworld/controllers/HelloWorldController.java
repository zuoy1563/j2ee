package j2ee.spring.helloworld.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zoe on 7/10/17.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world everyday";
    }
}
