package com.kyriba.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;


@SpringBootApplication
public class ApiAppMainClass {
   private static Properties properties = new Properties();


    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(ApiAppMainClass.class);

        application.run(args);
    }

}
