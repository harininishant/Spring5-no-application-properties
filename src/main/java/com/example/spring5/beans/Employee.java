package com.example.spring5.beans;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class Employee {
    private String name;
    private String address;
}
/*
POJO- plain over java object, this means classes like this are just a representation of the EMployee class and should not
have any logic in it . or no creation of Employee etc....
hence spring wont create Bean for it as there can be more than one employee.
 */