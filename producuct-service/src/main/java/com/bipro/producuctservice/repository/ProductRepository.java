package com.bipro.producuctservice.repository;

import com.bipro.producuctservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
