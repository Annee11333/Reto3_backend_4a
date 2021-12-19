package com.usa.ciclo4.reto2.crud;


import com.usa.ciclo4.reto2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product,String> {
}
