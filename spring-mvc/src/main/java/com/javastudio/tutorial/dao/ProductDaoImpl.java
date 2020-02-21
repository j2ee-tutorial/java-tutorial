package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductDaoImpl implements ProductDao {
    Logger logger = Logger.getLogger(ProductDaoImpl.class.getName());

    private static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> list() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }
}
