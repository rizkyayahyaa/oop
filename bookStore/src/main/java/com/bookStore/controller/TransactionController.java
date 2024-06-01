package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.entity.Transaction;
import com.bookStore.service.BookService;
import com.bookStore.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
    @Autowired
    private BookService service;
    @PostMapping("/add")
    public String createTransaction(@ModelAttribute Transaction transaction) {
        transactionService.save(transaction);
        return "redirect:/";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("transaction", new Transaction());
        List<Book> books = service.getAllBook();
        model.addAttribute("books", books);
        return "createTransaction";
    }
    @GetMapping("/datatransactions")
    public ModelAndView getAllTransactions() {
        List<Transaction> list = transactionService.getAllTransactions();
        return new ModelAndView("transactionList","transactions",list);
    }

    @GetMapping("/home")
    public String users() {
        return "users";
    }
    

}
