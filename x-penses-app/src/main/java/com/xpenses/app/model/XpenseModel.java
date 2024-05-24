package com.xpenses.app.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "xpense-tb")
public class XpenseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String observation;

    @Column(nullable = false, name = "maturity-date")
    private LocalDateTime maturityDate;

    @Column(nullable = false, name = "creation-date")
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(name = "payed-bill")
    private boolean isPayedBill;

    @Column(nullable = false)
    private boolean repeat;

    private boolean fixed;

    private int installments;

}
