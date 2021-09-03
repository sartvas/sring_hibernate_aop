/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.dao.CarDao;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarServiseImpl implements CarService{
    
    @Autowired
    private CarDao carDao;

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
    
}
