package com.example.autocoin.controller;

import com.example.autocoin.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;
}
