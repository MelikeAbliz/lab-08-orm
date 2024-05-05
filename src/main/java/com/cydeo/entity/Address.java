package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="address")
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity{

    private String name;

    private String street;

    private String zipCode;
    @ManyToOne //many addresses to one customer
    private Customer customer;
}
