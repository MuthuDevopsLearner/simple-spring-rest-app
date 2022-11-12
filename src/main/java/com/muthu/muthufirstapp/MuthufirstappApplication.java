package com.muthu.muthufirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MuthufirstappApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World! Bala here version 1";
    }

	public static void main(String[] args) {
		SpringApplication.run(MuthufirstappApplication.class, args);
	}

}
