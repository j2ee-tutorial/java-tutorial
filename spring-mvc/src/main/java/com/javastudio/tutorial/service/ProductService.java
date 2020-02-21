package com.javastudio.tutorial.service;

import com.javastudio.tutorial.model.Product1;

import java.util.List;

public interface ProductService {
    void add(Product1 product);
    List<Product1> list();
}
