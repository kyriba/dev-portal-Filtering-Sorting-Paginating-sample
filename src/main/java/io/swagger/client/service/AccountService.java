package io.swagger.client.service;

import io.swagger.client.model.PageOfAccountSearchModel;

import java.util.List;

public interface AccountService {
    PageOfAccountSearchModel getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort);
}
