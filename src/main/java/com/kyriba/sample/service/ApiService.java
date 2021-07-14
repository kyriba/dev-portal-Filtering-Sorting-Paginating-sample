package com.kyriba.sample.service;


import java.util.List;

public interface ApiService {
    String getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort);

    String getBaseUrl();

    String getRequestMapping();
}
