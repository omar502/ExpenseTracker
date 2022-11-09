package com.udemy.expensetrackerapi.controller;

import com.udemy.expensetrackerapi.entity.Expense;
import com.udemy.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    // new repo commit
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("/expenses/{id}")
    public String getUserByID(@PathVariable("id") Long id){
        return "User id is " + id;
    }

    @DeleteMapping("/expenses")
    public String deleteUserById(@RequestParam Long id){
        return "Deleted the user with id " + id;
    }
}
