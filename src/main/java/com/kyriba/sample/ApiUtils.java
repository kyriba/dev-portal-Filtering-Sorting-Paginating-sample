package com.kyriba.sample;

import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Value;
import com.kyriba.sample.annotation.SearchModel;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class ApiUtils {

    @Value("${base.api.name}")
    private String apiName;

    private Class<?> searchClass;

    public ApiUtils() {
    }

    @PostConstruct
    public  void setSearchClass() {
        Reflections reflections = new Reflections("com.kyriba.sample.model." + apiName.replaceAll("-", "_"));
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SearchModel.class);
        this.searchClass = annotated.stream().findAny().get();
    }

    public Class<?> getSearchClass() {
        return searchClass;
    }
}
