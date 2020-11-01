package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MerhabaApi {

    @GetMapping
    public String merhaba(){
        return "Merhaba";
    }
}
