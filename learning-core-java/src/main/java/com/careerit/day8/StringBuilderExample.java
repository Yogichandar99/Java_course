package com.careerit.day8;

public class StringBuilderExample
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Core Java");
        sb.append(" learning is fun!");
        System.out.println(sb);
        String name="krish";
        int age=25;
        double salary=5000;
        String company="wipro";
        String data=name.concat(",").concat(" "+age).concat(",").concat(" "+salary).concat(",").concat(company);
        System.out.println(data);
        // The above code is good for concatinating the strings but it creates multiple
        // objects which is waste of memory instead this can be done using String Builder class as follows:
        StringBuilder sb1=new StringBuilder();
        StringBuilder data1=sb1.append(name).append(",").append(age).append(",").append(salary).append(",").append(company);
        System.out.println(data1);

    }
}
