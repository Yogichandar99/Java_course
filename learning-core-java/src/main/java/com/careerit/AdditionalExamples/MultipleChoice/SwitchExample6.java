package com.careerit.AdditionalExamples.MultipleChoice;

public class SwitchExample6
{
    public static void main(String[] args) {
        int num = 12;
        switch (++num) {
            case 12:
                System.out.println("12");
            case 13:
                System.out.println("13");
            case 14:
                System.out.println("14");
                return;
            default:
                System.out.println("Default");
        }
    }
}
