package com.careerit.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//Currency object
public class Currency
{
     private String symbol;
     private String name;
     private String symbol_native;
     private int decimal_digits;
     private int rounding;
     private String code;
     private String name_plural;

}


