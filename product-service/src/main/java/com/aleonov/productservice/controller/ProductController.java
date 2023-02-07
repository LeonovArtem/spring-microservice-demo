package com.aleonov.productservice.controller;

import com.aleonov.productservice.model.Product;
import com.aleonov.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;
    private Integer countRequest = 0;

    @GetMapping
    public List<Product> list() {
        ++countRequest;
        log.warn("CountR request: {}", countRequest );

        return productRepository.getAll();
    }
}
