package com.kyriba.sample.service.impl;

import com.kyriba.sample.config.AvailableValuesConfig;
import com.kyriba.sample.config.InitialAPIBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AvailableValuesService {
    private Map<String, Map<String, List<String>>> values;
    private InitialAPIBean bean;

    public AvailableValuesService(AvailableValuesConfig availableValuesConfig, InitialAPIBean bean) {
        this.values = availableValuesConfig.getValues();
        this.bean = bean;
    }

    public Map<String, Map<String, List<String>>> getValues() {
        return values;
    }

    public void setValues(Map<String, Map<String, List<String>>> availableValues) {
        this.values = availableValues;
    }

    public Map<String, List<String>> getValuesForCurrentApi() {
        return values.get(bean.getApiName().replaceAll("/", ""));
    }
}
