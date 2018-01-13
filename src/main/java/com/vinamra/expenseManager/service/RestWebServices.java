package com.vinamra.expenseManager.service;

import com.vinamra.expenseManager.domain.ExpenseVo;
import com.vinamra.expenseManager.entity.Expenses;

import java.util.List;

public interface RestWebServices {

    void addExpense (ExpenseVo expenseVo);
    void editExpense (Expenses expenses);
    List<Expenses> getExpenses ();
    void deleteExpense (Integer id);

    Expenses getExpense(Integer id);
}
