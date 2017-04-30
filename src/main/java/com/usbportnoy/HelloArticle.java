package com.usbportnoy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 4/30/17.
 */
@RestController
public class HelloArticle {

    @RequestMapping("/api/hello")
    public String greeting() {
        return "Hello Article!";
    }
}

