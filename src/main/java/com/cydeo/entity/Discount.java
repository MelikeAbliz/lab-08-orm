package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Discount extends BaseEntity {
    private BigDecimal discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;

}
