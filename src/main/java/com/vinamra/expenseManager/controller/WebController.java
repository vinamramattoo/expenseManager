/*
package com.vinamra.expenseManager.controller;


import com.vinamra.expenseManager.domain.ExpenseVo;
import com.vinamra.expenseManager.entity.Expenses;
import com.vinamra.expenseManager.service.RestWebServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class WebController {

    private RestWebServices restWebServices;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(ExpenseVo expenseVo) {
        restWebServices.addExpense(expenseVo);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public void edit(Expenses expenses) {
        restWebServices.editExpense(expenses);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Expenses> getAll() {
       return restWebServices.getExpenses();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Expenses getOne(@PathVariable("id")Integer id) {
       return restWebServices.getExpense(id);
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void remove(@PathVariable("id")Integer id) {
        restWebServices.deleteExpense(id);
    }
}*/
