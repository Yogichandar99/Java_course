package com.careerit.enumExamples;

import java.util.ArrayList;
import java.util.List;
import com.careerit.enumExamples.Week;
public class BillCalculatorManager
{
    public static void main(String[] args)
    {
        //Based on the input day we can calculate the bill
        //It is possible that users can mess up with the input
        //such as lower case name of days, First letter capital, e.t.c
        //Hence we made them constant using enum and accessing them
        List<BillItem> billItems=new ArrayList<>();
        BillItem billItem1= BillItem.builder()
                .id(1001)
                .description("Played a game for 1 ")
                .amount(200)
                .day(String.valueOf(Week.TUESDAY))
                .build();
        BillItem billItem2= BillItem.builder()
                .id(1001)
                .description("Used parking ")
                .amount(10)
                .day(String.valueOf(Week.SUNDAY))
                .build();
        //Write a logic to calculate the bill amount as per the day.
    }
}
