package com.kyriba.sample.service.impl;

import com.kyriba.sample.config.AvailableValuesConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AvailableValuesService {
    private Map<String, Map<String, List<String>>> values;

    @Value("${base.api.name}")
    private String apiName;

    public AvailableValuesService(AvailableValuesConfig availableValuesConfig) {
        this.values = availableValuesConfig.getValues();
    }

    public Map<String, Map<String, List<String>>> getValues() {
        return values;
    }

    public void setValues(Map<String, Map<String, List<String>>> availableValues) {
        this.values = availableValues;
    }

    public Map<String, List<String>> getValuesForCurrentApi() {
        return values.get(apiName);
    }
}
