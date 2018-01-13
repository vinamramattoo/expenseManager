package com.vinamra.expenseManager.service;


import com.vinamra.expenseManager.domain.ExpenseVo;
import com.vinamra.expenseManager.entity.Expenses;
import com.vinamra.expenseManager.repository.CategoryRepository;
import com.vinamra.expenseManager.repository.ExpensesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class RestWebServicesImpl implements  RestWebServices{
    private static final Logger LOG = LoggerFactory.getLogger(RestWebServicesImpl.class);

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ExpensesRepository expensesRepository;

    @Override
    public void addExpense(ExpenseVo expenseVo) {
        LOG.info("reached inner function");
        Date date = new Date();
        LOG.info("date is"+date);
        Expenses expenses = new Expenses();
        expenses.setName(expenseVo.getName());
        expenses.setAmount(expenseVo.getAmount());
        expenses.setDetails(expenseVo.getDetails());

        //TODO :: hardcoded values for mini project
        expenses.setCreated_by(1);
        expenses.setCreated_on(date);
        expenses.setUpdated_by(1);
        expenses.setUpdated_on(date);

        expensesRepository.save(expenses);


    }

    @Override
    public void editExpense(Expenses expenses1) {
        Date date = new Date();
        Expenses expenses = getExpense(expenses1.getId());

        expenses.setName(expenses1.getName());
        expenses.setAmount(expenses1.getAmount());
        expenses.setDetails(expenses1.getDetails());

        //TODO :: hardcoded values for mini project
        expenses.setCreated_by(1);
        expenses.setCreated_on(date);
        expenses.setUpdated_by(1);
        expenses.setUpdated_on(date);

        expensesRepository.save(expenses);
    }

    @Override
    public List<Expenses> getExpenses() {
        return (List<Expenses>)  expensesRepository.findAll();
    }

    @Override
    public void deleteExpense(Integer id) {
        expensesRepository.delete(id);
    }

    @Override
    public Expenses getExpense(Integer id) {
        return expensesRepository.findOne(id);
    }
}
