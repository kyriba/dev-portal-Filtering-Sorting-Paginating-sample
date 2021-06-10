package com.kyriba.sample.controller;

import com.kyriba.sample.exception.BadRequestException;
import com.kyriba.sample.model.accounts.AccountSearchModel;
import com.kyriba.sample.model.PageOfSearchModel;
import com.kyriba.sample.service.ApiService;
import com.kyriba.sample.service.impl.FiltersService;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class ApiController<T> {

    private final ApiService<T> accountService;

    @Value("${server.port}")
    private String port;

    private final FiltersService filtersService;


    public ApiController(@Qualifier("apiServiceImpl") ApiService<T> accountService, FiltersService filtersService) {
        this.accountService = accountService;
        this.filtersService = filtersService;
    }

    @GetMapping
    public String getAccounts(Model model){
        model.addAttribute("activeStatus", AccountSearchModel.ActiveStatusEnum.values());
        model.addAttribute("columns", filtersService.getFilters());
        model.addAttribute("baseUrl", accountService.getBaseUrl());
        model.addAttribute("requestMapping", accountService.getRequestMapping());
        model.addAttribute("accountTypes", AccountSearchModel.AccountTypeEnum.values());
        model.addAttribute("port", port);
        return "list-page";
    }

    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity<PageOfSearchModel<T>> getAccountsJson(@RequestParam (value = "activeStatus", required = false) String activeStatus,
                                                             @RequestParam (value = "filter", required = false) String filter,
                                                             @RequestParam (value = "page.limit", required = false) Integer pageLimit,
                                                             @RequestParam (value = "page.offset", required = false) Integer pageOffset,
                                                             @RequestParam(value = "sort", required = false) List<String> sort)
    throws BadRequestException {
        PageOfSearchModel<T> result = accountService.getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort);
        return new ResponseEntity<>(result,
                HttpStatus.OK);
    }

}
