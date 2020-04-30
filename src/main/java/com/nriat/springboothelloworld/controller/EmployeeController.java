package com.nriat.springboothelloworld.controller;

import com.alibaba.fastjson.JSONObject;
import com.nriat.springboothelloworld.bean.Employee;
import com.nriat.springboothelloworld.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmp/{id}")
    public JSONObject getEmpById(
            @PathVariable("id") Integer id){

        JSONObject jsonObject=new JSONObject();

        Employee emp = employeeService.getEmpById(id);
        jsonObject.put("status","success");
        jsonObject.put("message","");
        jsonObject.put("data",emp);
        return  jsonObject;
    }
}
