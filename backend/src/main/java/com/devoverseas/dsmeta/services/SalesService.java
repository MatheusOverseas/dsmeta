package com.devoverseas.dsmeta.services;

import com.devoverseas.dsmeta.entities.Sale;
import com.devoverseas.dsmeta.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sale> findSales(){
        return salesRepository.findAll();
    }
}
