package com.kyriba.sample.service;


import com.kyriba.sample.model.PageOfAccountSearchModel;
import java.util.List;

public interface AccountService {
    PageOfAccountSearchModel getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort);

    String getBaseUrl();
}
