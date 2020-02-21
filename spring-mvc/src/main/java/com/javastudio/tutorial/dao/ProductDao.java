package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product1;

import java.util.List;

public interface ProductDao {
    List<Product1> list();

    void add(Product1 product);
}
