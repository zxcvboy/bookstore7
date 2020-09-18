package com.sap.cap.bookstore7;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@ComponentScan("com.sap.cap.bookstore7")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
    }
    
    
}
