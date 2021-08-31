
package com.sartvas.spring.mvc_hibernate_aop.controller;

import com.sartvas.spring.mvc_hibernate_aop.dao.EmployeeDao;
import com.sartvas.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
    
    @Autowired
    private EmployeeDao employeeDao;
    
    @RequestMapping("/")
    public String showAllEmployees(Model model){
        
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        
        return "allemployees";
    }
    
}
