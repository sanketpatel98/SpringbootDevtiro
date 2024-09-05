package com.sanket.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/demon")
    public String getData(){
        return "Total Concentration Tanjiro!";
    }
}
