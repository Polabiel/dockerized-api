package com.cotuca.account.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity @Table
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Transaction {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "account.number")
    private Account account;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Double amount;

    @Column(length = 150)
    private String notes;
}
