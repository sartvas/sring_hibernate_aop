
package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
       return employeeDAO.getAllEmployees();
    }
    
    @Override
    @Transactional
    public void saveEmployee(Employee employee){
        employeeDAO.saveEmployee(employee);
    
}

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
    
}