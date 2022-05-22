package com.ali.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "custom_rule")
public class CustomRule {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    private String description;
    private int priority;
    private String condition;
    private String action;


}
