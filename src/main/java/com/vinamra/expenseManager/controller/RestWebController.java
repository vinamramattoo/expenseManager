package com.vinamra.expenseManager.controller;


import com.vinamra.expenseManager.domain.ExpenseVo;
import com.vinamra.expenseManager.domain.UpdateExpenses;
import com.vinamra.expenseManager.entity.Expenses;
import com.vinamra.expenseManager.service.RestWebServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestWebController {

    private static final Logger LOG = LoggerFactory.getLogger(RestWebController.class);

    private final RestWebServices restWebServices;

    @Autowired
    public RestWebController(@Qualifier("restWebServicesImpl") RestWebServices restWebServices) {
        this.restWebServices = restWebServices;
    }





    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
       return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestBody ExpenseVo expenseVo) {
       LOG.info("reached add function");
        restWebServices.addExpense(expenseVo);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public void edit(@RequestBody UpdateExpenses updateExpenses) {
        restWebServices.editExpense(updateExpenses);
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



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove(@PathVariable("id")Integer id) {
        restWebServices.deleteExpense(id);
    }
}