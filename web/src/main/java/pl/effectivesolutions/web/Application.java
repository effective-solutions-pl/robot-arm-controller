package pl.effectivesolutions.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Spring Boot application class.
 * Created by Tomasz Sokół on 2016-03-25.
 */
@SpringBootApplication
@ComponentScan(basePackages = "pl.effectivesolutions")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
