package com.wangyu.cidi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${application.version}")
    private String version;

    @GetMapping("/hello")
    public String hello() {
        return "Current Version is " + version;
    }
}
