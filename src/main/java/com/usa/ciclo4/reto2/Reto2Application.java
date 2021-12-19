package com.usa.ciclo4.reto2;


import com.usa.ciclo4.reto2.crud.ProductCrudRepository;
import com.usa.ciclo4.reto2.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2Application {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto2Application.class, args);
    }

    public void run(String... args) throws Exception {
        productCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
    }
}

