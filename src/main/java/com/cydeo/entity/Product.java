package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product extends BaseEntity{

    private String name;

    @Column(precision = 19,scale = 2)
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;


    @ManyToMany //spring create third table(product_category_rel) and create foreign key
    @JoinTable(name = "product_category_rel",//change table name
            joinColumns = @JoinColumn(name = "p_id"),//change product  table column name
            inverseJoinColumns = @JoinColumn(name = "c_id"))//change category table column name
    private List<Category> categories;

}
