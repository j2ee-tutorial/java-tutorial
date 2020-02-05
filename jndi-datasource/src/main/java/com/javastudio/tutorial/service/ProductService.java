package com.javastudio.tutorial.service;

import com.javastudio.tutorial.web.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    final List<Product> products = new ArrayList<>();

    public void create(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
