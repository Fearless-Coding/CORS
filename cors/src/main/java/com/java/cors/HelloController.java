package com.java.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
//    @CrossOrigin(origins = "http://localhost:8081")//也可以写在类上面
    public String Hello() {
        return "helloWorld";
    }
}
