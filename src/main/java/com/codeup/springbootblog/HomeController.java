package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

    @Controller
    public class HomeController {

        @GetMapping("/home")
        public String welcome() {
        return "home";
    }

        @GetMapping("/add/{x}/and/{y}")
        @ResponseBody
        public String add(@PathVariable int x, @PathVariable int y) {
            return "" + (x + y);
        }

    }


