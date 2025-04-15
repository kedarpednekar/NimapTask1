package com.example.productcategoryapi.service;

import com.example.productcategoryapi.entity.Product;
import com.example.productcategoryapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<Page<Product>> getAllProducts(@RequestParam(defaultValue = "0") int page) {
        return ResponseEntity.ok(productService.getAllProducts(page));
    }

}
