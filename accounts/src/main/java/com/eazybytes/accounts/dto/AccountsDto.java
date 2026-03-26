package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountsDto {
    private String accountType;

    private String branchAddress;

    private Long customerId;
}
