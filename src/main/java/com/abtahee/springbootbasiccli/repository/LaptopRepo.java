package com.abtahee.springbootbasiccli.repository;


import com.abtahee.springbootbasiccli.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop laptop) {
        System.out.println("Laptop saved into database");
    }
}
