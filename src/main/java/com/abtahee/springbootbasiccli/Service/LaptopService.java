package com.abtahee.springbootbasiccli.Service;


import com.abtahee.springbootbasiccli.Model.Laptop;
import com.abtahee.springbootbasiccli.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class LaptopService {


    private LaptopRepo repo;

    public LaptopRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(LaptopRepo repo) {
        this.repo = repo;
    }

    public void addLaptop(Laptop laptop) {
    repo.save(laptop);
}
public boolean isGoodforAlien(Laptop laptop) {
    return true ;
}
}
