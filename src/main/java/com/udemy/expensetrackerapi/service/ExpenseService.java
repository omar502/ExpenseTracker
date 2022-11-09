package com.udemy.expensetrackerapi.service;

import com.udemy.expensetrackerapi.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
}
