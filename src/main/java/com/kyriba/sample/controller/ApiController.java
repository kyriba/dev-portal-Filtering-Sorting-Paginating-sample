package com.kyriba.sample.controller;

import com.kyriba.sample.exception.BadRequestException;
import com.kyriba.sample.service.ApiService;
import com.kyriba.sample.service.impl.AvailableValuesService;
import com.kyriba.sample.service.impl.FiltersService;
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
public class ApiController{

    private final ApiService apiService;

    @Value("${server.port}")
    private String port;

    private final FiltersService filtersService;

    private final AvailableValuesService availableValuesService;


    public ApiController(ApiService apiService, FiltersService filtersService, AvailableValuesService availableValuesService) {
        this.apiService = apiService;
        this.filtersService = filtersService;
        this.availableValuesService = availableValuesService;
    }

    @GetMapping
    public String getAccounts(Model model) {

        model.addAttribute("enums", availableValuesService.getValuesForCurrentApi());
        model.addAttribute("columns", filtersService.getFilters());
        model.addAttribute("baseUrl", apiService.getBaseUrl());
        model.addAttribute("requestMapping", apiService.getRequestMapping());
        model.addAttribute("port", port);
        return "list-page";
    }

    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity<String> getAccountsJson(@RequestParam(value = "activeStatus", required = false) String activeStatus,
                                                                @RequestParam(value = "filter", required = false) String filter,
                                                                @RequestParam(value = "page.limit", required = false) Integer pageLimit,
                                                                @RequestParam(value = "page.offset", required = false) Integer pageOffset,
                                                                @RequestParam(value = "sort", required = false) List<String> sort)
            throws BadRequestException {
        String result = apiService.getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort);
        return new ResponseEntity<>(result,
                HttpStatus.OK);
    }

}
