package com.exemple.service;

import com.exemple.model.*;
import com.exemple.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> listAll() {
        return productRepository.findAll();
    }

    public ProductModel getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public ProductModel save(ProductModel product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
