package com.works.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;

    @Size(max = 150)
    @NotNull
    @NotEmpty
    @Column(unique = true)
    private String email;

    @Size(min = 5 , max = 150)
    @NotNull
    @NotEmpty
    private String password;
}
