
package com.zaurtregulov.spring.mvc_hibernate_aop.dao;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Car;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CarDaoImpl implements CarDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    

    @Override
    public List<Car> getAllCars() {
        Session session = sessionFactory.getCurrentSession();
        
        Query<Car> query = session.createQuery("from Car", Car.class);
        
        List<Car> allCars = query.getResultList();
        
        return allCars;
    }
    
}
