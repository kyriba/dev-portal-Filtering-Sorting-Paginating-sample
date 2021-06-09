package com.kyriba.sample.controller;

import com.kyriba.sample.enums.ColumnsForSortingAndFiltering;
import com.kyriba.sample.exception.BadRequestException;
import com.kyriba.sample.model.accounts.AccountSearchModel;
import com.kyriba.sample.model.PageOfAccountSearchModel;
import com.kyriba.sample.service.ApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/list")
public class AccountsApiController {

    private final ApiService accountService;
    @Value("${server.port}")
    private String port;


    public AccountsApiController( ApiService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public String getAccounts(Model model){
        model.addAttribute("activeStatus", AccountSearchModel.ActiveStatusEnum.values());
        model.addAttribute("columns", ColumnsForSortingAndFiltering.values());
        model.addAttribute("baseUrl", accountService.getBaseUrl());
        model.addAttribute("requestMapping", accountService.getRequestMapping());
        model.addAttribute("accountTypes", AccountSearchModel.AccountTypeEnum.values());
        model.addAttribute("port", port);
        return "accounts-list";
    }

    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity<PageOfAccountSearchModel> getAccountsJson(@RequestParam (value = "activeStatus", required = false) String activeStatus,
                                                                    @RequestParam (value = "filter", required = false) String filter,
                                                                    @RequestParam (value = "page.limit", required = false) Integer pageLimit,
                                                                    @RequestParam (value = "page.offset", required = false) Integer pageOffset,
                                                                    @RequestParam(value = "sort", required = false) List<String> sort)
    throws BadRequestException {
        PageOfAccountSearchModel result = accountService.getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort);
        System.out.println(result);
        return new ResponseEntity<>(result,
                HttpStatus.OK);
    }

}
