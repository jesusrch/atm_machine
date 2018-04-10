package com.jerache.atm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtmController {

    @RequestMapping("/")
    public String index() {
        return "Greetings!";
    }

}
