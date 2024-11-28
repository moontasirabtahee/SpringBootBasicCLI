package com.abtahee.springbootbasiccli.Model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop created");
    }

    @Override
    public void compile() {
        System.out.println("Laptop compiled");
    }
}
