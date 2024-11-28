package com.abtahee.springbootbasiccli;

import com.abtahee.springbootbasiccli.Model.Alien;
import com.abtahee.springbootbasiccli.Model.Laptop;
import com.abtahee.springbootbasiccli.Service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicCliApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootBasicCliApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.code();

		Laptop laptop = context.getBean("laptop", Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(laptop);

	}


}
