package com.example.autocoin.entity.autocoin;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "accountsEntity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountsEntity {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String balance;

    @Column(nullable = false)
    private String locked;

    @Column(nullable = false)
    private String avg_buy_price;

    @Column(nullable = false)
    private Boolean avg_buy_price_modified;

    @Column(nullable = false)
    private String unit_currency;

    @Column(nullable = false)
    private Long expiry_time;
}
