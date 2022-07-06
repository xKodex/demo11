package com.example.demo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan({"com.example.demo11.*"})
@EntityScan("com.example.demo11.*")
@EnableJpaRepositories("com.example.demo11.repository")
public class Demo11Application extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(Demo11Application.class, args);
    }

}
