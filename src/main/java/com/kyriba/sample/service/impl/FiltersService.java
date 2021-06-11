package com.kyriba.sample.service.impl;

import com.kyriba.sample.config.FiltersConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FiltersService {
    private final Map<String, List<String>> filters;
    @Value("${base.api.name}")
    private String apiName;


    public FiltersService(FiltersConfig fileTypesConfig) {
        this.filters = fileTypesConfig.getFilters();
    }

    public List<String> getFilters() {
        return this.filters.get(apiName);
    }

}
