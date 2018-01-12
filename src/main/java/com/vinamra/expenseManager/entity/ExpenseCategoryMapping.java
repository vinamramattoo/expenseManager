package com.vinamra.expenseManager.entity;

import javax.persistence.*;

/**
 * vin remove this:
 * Created by Vinamra Mattoo on 12/1/18 for expenseManager.
 */
@Entity
@Table(name = "expense_category_mapping")
public class ExpenseCategoryMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "expense_id")
    private Integer expense_id;

    @Column(name = "category_id")
    private Integer category_id;


}
