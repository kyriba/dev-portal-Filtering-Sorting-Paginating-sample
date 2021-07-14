package com.kyriba.sample.service.impl;

import com.kyriba.sample.config.FiltersConfig;
import com.kyriba.sample.config.InitialAPIBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FiltersService {
    private final Map<String, List<String>> filters;
   private final InitialAPIBean bean;


    public FiltersService(FiltersConfig fileTypesConfig, InitialAPIBean bean) {
        this.filters = fileTypesConfig.getFilters();
        this.bean = bean;
    }

    public List<String> getFilters() {
        return this.filters.get(bean.getApiName());
    }

}
