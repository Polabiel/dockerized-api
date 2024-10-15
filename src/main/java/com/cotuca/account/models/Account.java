package com.cotuca.account.models;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    @Column(nullable = false, length = 100)
    private String owner;

    @Column(nullable = false)
    private Double balance;

}
