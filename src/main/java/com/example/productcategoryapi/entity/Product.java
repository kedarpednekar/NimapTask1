package com.example.productcategoryapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

<<<<<<< HEAD
    @Id
=======
>>>>>>> a5d8fdc (revised updated code)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "category_id")
=======
>>>>>>> a5d8fdc (revised updated code)
    private Category category;

    // Constructors
    public Product() {}

}
