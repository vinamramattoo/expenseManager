package com.vinamra.expenseManager.repository;

import com.vinamra.expenseManager.entity.Expenses;
import org.springframework.data.repository.CrudRepository;

public interface ExpensesRepository extends CrudRepository<Expenses,Integer>{
}
