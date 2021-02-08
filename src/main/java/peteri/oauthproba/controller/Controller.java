package peteri.oauthproba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWord(){
         return "hello Progmatic!";
    }

    @GetMapping("/loggedin")
    public String onlyForLoggedIn(){
        return "this message is only for users who are logged in";
    }

}
