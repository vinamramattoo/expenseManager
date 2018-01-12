package com.vinamra.expenseManager.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
/**
 * vin remove this:
 * Created by Vinamra Mattoo on 12/1/18 for expenseManager.
 */
@Entity
@Table(name = "expenses")
public class Expenses {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "details")
    private String details;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on")
    private Date created_on;

    @Column(name = "created_by")
    private Integer created_by;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on")
    private Date updated_on;

    @Column(name = "updated_by")
    private Integer updated_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        this.updated_on = updated_on;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", details='" + details + '\'' +
                ", created_on=" + created_on +
                ", created_by=" + created_by +
                ", updated_on=" + updated_on +
                ", updated_by=" + updated_by +
                '}';
    }
}
