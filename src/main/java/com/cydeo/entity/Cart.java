package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;


    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;

}
