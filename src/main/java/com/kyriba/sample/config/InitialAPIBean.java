package com.kyriba.sample.config;


import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class InitialAPIBean {

    private String apiName;

   private final ApiConfig apiConfig;

    public InitialAPIBean(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        apiName = getName();
    }

    public String getApiName() {
        return apiName;
    }

    private String getName() {
        Scanner sc = new Scanner(System.in);
        List<String> list = apiConfig.getApis();
        String name;
        do {
            System.out.println(list.stream()
                    .collect(Collectors.joining("\n - ", "Please enter api name from list: \n - ", "")));
            name = sc.nextLine();
            String input = name;
            name = name.trim();
            if (name.startsWith("-")) {
                name = name.substring(1);
            }
            name = name.trim();
            if (!list.contains(name)) {
                System.out.println("Api with name " + input + " not found.");
            }
        }
        while (!list.contains(name));
        return name;
    }
}
