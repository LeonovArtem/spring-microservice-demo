package com.aleonov.productservice.repository;

import com.aleonov.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products = List.of(
            new Product(1, "one"),
            new Product(2, "two"),
            new Product(3, "three")
    );

    public List<Product> getAll() {
        return products;
    }
}
