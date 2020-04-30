package com.nriat.springboothelloworld.service;

import com.nriat.springboothelloworld.bean.Employee;
import com.nriat.springboothelloworld.mapper.EmployeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeMapper employeMapper;

    @Override
    @Cacheable(cacheNames = "emp")
    public Employee getEmpById(Integer id) {
        return employeMapper.getEmpById(id);
    }
}
