package io.swagger.client.controller;

import io.swagger.client.enums.ColumnsForSortingAndFiltering;
import io.swagger.client.model.AccountSearchModel;
import io.swagger.client.model.PageOfAccountSearchModel;
import io.swagger.client.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/accounts")
public class AccountsApiController {
    private AccountService accountService;

    public AccountsApiController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public String getAccounts(Model model){
        model.addAttribute("activeStatus", AccountSearchModel.ActiveStatusEnum.values());
        model.addAttribute("columns", ColumnsForSortingAndFiltering.values());
        return "accounts-list";
    }

    @GetMapping(value = "/list")
    @ResponseBody
    public PageOfAccountSearchModel getAccountsJson(){
        return accountService.getAllAccounts(null, null, null, null, null);
    }


}
