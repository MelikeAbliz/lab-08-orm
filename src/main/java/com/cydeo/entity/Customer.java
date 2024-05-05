package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity{


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    @Column(name = "user_name")
    private String userName;
}
