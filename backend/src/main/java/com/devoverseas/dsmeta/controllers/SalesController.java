package com.devoverseas.dsmeta.controllers;

import com.devoverseas.dsmeta.entities.Sale;
import com.devoverseas.dsmeta.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public Page<Sale> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate, @RequestParam(value = "maxDate", defaultValue = "")String maxDate, Pageable pageable){
        return salesService.findSales(minDate, maxDate, pageable);
    }
}
