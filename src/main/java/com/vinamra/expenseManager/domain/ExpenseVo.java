package com.vinamra.expenseManager.domain;

public class ExpenseVo {


    private String  name;
    private Double  amount;
    private String  details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ExpenseVo{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", details='" + details + '\'' +
                '}';
    }
}
