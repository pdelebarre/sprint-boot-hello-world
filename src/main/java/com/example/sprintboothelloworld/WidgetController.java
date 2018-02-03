package com.example.sprintboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RequestMapping("/hello")
@RestController
public class WidgetController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Hello, World!";
    }
}
