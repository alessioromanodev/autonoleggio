package com.parthenope.Autonoleggio.controller;

import com.parthenope.Autonoleggio.dto.TransactionDto;
import com.parthenope.Autonoleggio.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transaction")
    public String listTransactions(Model model) {
        List<TransactionDto> transactions = transactionService.findAllTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions-list";
    }
}
