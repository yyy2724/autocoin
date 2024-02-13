package com.example.autocoin.dto.autocoin;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountsDto {

    private Long id;

    private String currency;

    private String balance;

    private String locked;

    private String avg_buy_price;

    private Boolean avg_buy_price_modified;

    private String unit_currency;

    private Long expiry_time;

}
