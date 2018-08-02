package com.maurofokker.poc.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringMicroservicesLibraryCatalogApplication {

    // to pull properties from config server
    @Value("${catalog.size}")
    private int size;

    @RequestMapping("/catalog")
    @CrossOrigin
    public List<Book> getCatalog() {
        return Book.getBooks().subList(0, size);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesLibraryCatalogApplication.class, args);
    }
}
