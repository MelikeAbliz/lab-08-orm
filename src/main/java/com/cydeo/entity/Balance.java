package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="balance")
@NoArgsConstructor
@Getter
@Setter
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 19,scale = 2)//precision->total digits number ,like 12345678912345678.23
    private BigDecimal amount;

    @OneToOne
    private Customer customer;
}
