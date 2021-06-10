package com.kyriba.sample.service;


import com.kyriba.sample.model.PageOfSearchModel;
import java.util.List;

public interface ApiService<T> {
    PageOfSearchModel<T> getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort);

    String getBaseUrl();

    String getRequestMapping();
}
