package com.nriat.springboothelloworld;

import com.nriat.springboothelloworld.bean.Employee;
import com.nriat.springboothelloworld.mapper.EmployeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootHelloworldApplicationTests {

    @Autowired
    EmployeMapper employeMapper;

    @Test
    void contextLoads() {
        Employee emp=employeMapper.getEmpById(1);
        System.out.println(emp);

    }

}
