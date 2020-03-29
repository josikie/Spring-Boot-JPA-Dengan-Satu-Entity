package com.example.demojavapersistenceapi;


import com.example.demojavapersistenceapi.entity.Sales;
import com.example.demojavapersistenceapi.service.SalesDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SalesDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger Log = LoggerFactory.getLogger(SalesDAOServiceCommandLineRunner.class);

    @Autowired
    private SalesDAOService salesDAOService;

    @Override
    public void run(String... args) throws Exception {

        Sales sales = new Sales(1, "Udin", 400);
        long insert = salesDAOService.insert(sales);
        Log.info( "is created new  "  +sales);
    }
}
