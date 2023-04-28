package com.careerit.cj.jdbc;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//Contact template class
public class Contact
{
    private int id;
    private String name;
    private String email;
    private String mobile;
}
