package com.kyriba.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class ApiAppMainClass {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(ApiAppMainClass.class);

        Properties properties = new Properties();
        properties.put("base.api.name", getName());
        application.setDefaultProperties(properties);

        application.run(args);
    }

    private static String getName() {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList("accounts", "bank-branches", "bank-groups", "banks", "companies", "users");
        String name;
        do {

            System.out.println("Please enter api name from list: \n" +
                    "  - accounts\n" +
                    "  - banks-branches\n" +
                    "  - bank-groups\n" +
                    "  - banks\n" +
                    "  - companies\n" +
                    "  - users\n"
            );


            name = sc.nextLine();
            String input = name;
            name = name.trim();
            if (name.startsWith("-")) {
                name = name.substring(1);
            }
            name = name.trim();
            if (!list.contains(name)){
                System.out.println("Api with name " + input + " not found.");
            }
        }
        while (!list.contains(name));
        return name;
    }
}
