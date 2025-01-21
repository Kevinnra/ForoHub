package Challenge.API.ForoHub.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloControlelr {

    @GetMapping
    public String helloworld() {
        return "Hello World!!!";
    }

}
