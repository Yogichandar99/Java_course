package com.careerit.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Wallet
{
    private long id;
    private String mobile;
    private String name;
    private double balance;

}
