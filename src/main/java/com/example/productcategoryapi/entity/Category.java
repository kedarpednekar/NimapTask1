package com.example.productcategoryapi.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

<<<<<<< HEAD
    @Id
=======
>>>>>>> a5d8fdc (revised updated code)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

<<<<<<< HEAD
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
=======
    @OneToOne(mappedBy = "category")
>>>>>>> a5d8fdc (revised updated code)
    private List<Product> products;

    // Constructors
    public Category() {}

<<<<<<< HEAD
=======
    public Category(Long id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }
>>>>>>> a5d8fdc (revised updated code)


}
