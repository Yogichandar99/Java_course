package com.careerit.enumExamples;

import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillItem
{
    private long id;
    private String description;
    private double amount;
    private String day;

}
