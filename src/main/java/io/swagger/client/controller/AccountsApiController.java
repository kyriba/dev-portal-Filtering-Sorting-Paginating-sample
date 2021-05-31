package io.swagger.client.controller;

import io.swagger.client.ApiException;
import io.swagger.client.api.AccountsApi;
import io.swagger.client.enums.ColumnsForSortingAndFiltering;
import io.swagger.client.exception.BadRequestException;
import io.swagger.client.model.AccountSearchModel;
import io.swagger.client.service.AccountService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/accounts")
public class AccountsApiController<T> {

    private final AccountService<T> accountService;
    AccountsApi<T> accountsApi;

    public AccountsApiController(@Qualifier("accountServiceImpl") AccountService<T> accountService,
                                 @Qualifier("accountsApi") AccountsApi<T> accountsApi) {
        this.accountService = accountService;
        this.accountsApi = accountsApi;
    }

    @GetMapping
    public String getAccounts(Model model){
        model.addAttribute("activeStatus", AccountSearchModel.ActiveStatusEnum.values());
        model.addAttribute("columns", ColumnsForSortingAndFiltering.values());
        model.addAttribute("baseUrl", accountService.getBaseUrl());
        model.addAttribute("accountTypes", AccountSearchModel.AccountTypeEnum.values());
        return "accounts-list";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<T> getAccountsJson(@RequestParam (value = "activeStatus", required = false) String activeStatus,
                                                                 @RequestParam (value = "filter", required = false) String filter,
                                                                 @RequestParam (value = "page.limit", required = false) Integer pageLimit,
                                                                 @RequestParam (value = "page.offset", required = false) Integer pageOffset,
                                                                 @RequestParam(value = "sort", required = false) List<String> sort)
    throws BadRequestException {
        T result = accountService.getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort);
        System.out.println(result);
        return new ResponseEntity<>(result,
                HttpStatus.OK);
    }

    @GetMapping("/get/{code}")
    @ResponseBody
    public T getAccount(@PathVariable("code") String code) throws ApiException {
        System.out.println(code);
        T result = accountsApi.readAccountUsingGET1(code);
        System.out.println(result);
        return result;
    }

}
