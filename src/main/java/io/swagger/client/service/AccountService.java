package io.swagger.client.service;

import io.swagger.client.model.PageOfSearchModels;

import java.util.List;

public interface AccountService<T> {
    T getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort);

    String getBaseUrl();
}
