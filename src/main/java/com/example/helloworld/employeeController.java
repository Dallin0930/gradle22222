package com.example.helloworld;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class employeeController<RespondEntity> {

    List<employ> employees = new ArrayList<>();


    @GetMapping("/employee")
    public ResponseEntity addEmplyee(@RequestBody employ employee)
    {    employee.setId(1);
         employees.add(employee);
         return ResponseEntity.ok(employees);
    }


    @GetMapping("/employee")
    public ResponseEntity getEmployee()
    {
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity updateEmployee(String id,employ employee)
    {

    }

}
