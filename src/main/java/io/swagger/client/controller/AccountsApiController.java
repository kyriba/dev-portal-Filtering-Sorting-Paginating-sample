package io.swagger.client.controller;

import io.swagger.client.enums.ColumnsForSortingAndFiltering;
import io.swagger.client.exception.BadRequestException;
import io.swagger.client.model.AccountSearchModel;
import io.swagger.client.model.PageOfAccountSearchModel;
import io.swagger.client.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<PageOfAccountSearchModel> getAccountsJson(@RequestParam (value = "activeStatus", required = false) String activeStatus,
                                                                   @RequestParam (value = "filter", required = false) String filter,
                                                                   @RequestParam (value = "pageLimit", required = false) Integer pageLimit,
                                                                   @RequestParam (value = "pageOffset", required = false) Integer pageOffset,
                                                                   @RequestParam(value = "sort", required = false) List<String> sort)
    throws BadRequestException {

        return new ResponseEntity<>(accountService.getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort),
                HttpStatus.OK);
    }


}
