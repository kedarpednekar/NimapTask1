package com.example.productcategoryapi.service;

import com.example.productcategoryapi.entity.Category;
import com.example.productcategoryapi.entity.Product;
import com.example.productcategoryapi.repository.CategoryRepository;
import com.example.productcategoryapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    

    public Product createProduct(Product product) {
        // Ensure the category exists before assigning
        if (product.getCategory() != null && product.getCategory().getId() != null) {
            Optional<Category> category = categoryRepository.findById(product.getCategory().getId());
            category.ifPresent(product::setCategory);
        }
        return productRepository.save(product);
    }


    public boolean deleteProduct(Long id) {
        return productRepository.findById(id).map(product -> {
            productRepository.delete(product);
            return true;
        }).orElse(false);
    }
}
