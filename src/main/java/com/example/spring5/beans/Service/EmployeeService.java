package com.example.spring5.beans.Service;

import com.example.spring5.beans.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Scope("prototype")// there are diff scopes too like request/ session
@Component // creating bean
public class EmployeeService {
    private List<Employee>employees = new ArrayList<>();

public void createEmployee(Employee E){
    employees.add(E);

}
public  List<Employee> getEMployees(){
    return employees;
}

public Employee getEMployeeName(String name){
    return employees.stream().filter(s->s.equals(name)).findAny().get();
}

}
