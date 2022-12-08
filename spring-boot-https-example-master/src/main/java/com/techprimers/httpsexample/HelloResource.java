package com.techprimers.httpsexample;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping
    public String hello(@PathParam("a") String a) {
        return "Hello YouTube" + a;
    }
}
