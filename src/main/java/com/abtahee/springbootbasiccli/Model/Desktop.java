package com.abtahee.springbootbasiccli.Model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop created");
    }

    @Override
    public void compile(){
        System.out.println("Desktop compiled");
    }
}
