package com.qf.j1904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;


@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
public class SpringbootTravel006Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTravel006Application.class, args);
    }

}
