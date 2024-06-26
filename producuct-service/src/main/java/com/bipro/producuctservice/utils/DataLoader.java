package com.bipro.producuctservice.utils;

import com.bipro.producuctservice.model.Product;
import com.bipro.producuctservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if(productRepository.count()<1){
            Product product = new Product();
            product.setName("Samsung");
            product.setDescription("Good camera");
            product.setPrice(BigDecimal.valueOf(1000));

            productRepository.save(product);
        }
    }
}
