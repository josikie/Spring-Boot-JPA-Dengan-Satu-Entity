package com.example.demojavapersistenceapi.service;

import com.example.demojavapersistenceapi.entity.Sales;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


// anotasi @Repository berguna untuk menandai bahwa kelas SalesDAOService adalah kelas repository
@Repository
public class SalesDAOService {

    @PersistenceContext
    private EntityManager entityManager;
    // anotasi @Transactional berguna untuk menggunakan database pada method yang mau digunakan untuk
    // menggunakan database.
    @Transactional
    public long insert(Sales user){

        entityManager.persist(user);
        return user.getId();
    }
}
