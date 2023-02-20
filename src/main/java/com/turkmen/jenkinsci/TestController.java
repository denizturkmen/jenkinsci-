package com.turkmen.jenkinsci;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TestController {
    @GetMapping(value = "/tarih")
    public String deger(){
        return "deniz";
    }
}
