/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sartvas.spring.mvc_hibernate_aop.dao;

import com.sartvas.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

/**
 *
 * @author sartv
 */
public interface EmployeeDao {
    public List<Employee> getAllEmployees();
}
