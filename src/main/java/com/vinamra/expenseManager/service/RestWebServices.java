package com.vinamra.expenseManager.service;

import com.vinamra.expenseManager.domain.ExpenseVo;
import com.vinamra.expenseManager.entity.Expenses;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Component
public interface RestWebServices {

    void addExpense (ExpenseVo expenseVo);
    void editExpense (Expenses expenses);
    List<Expenses> getExpenses ();
    void deleteExpense (Integer id);

    Expenses getExpense(Integer id);
}
