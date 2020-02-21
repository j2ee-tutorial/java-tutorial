package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product1;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductDaoImpl implements ProductDao {
    Logger logger = Logger.getLogger(ProductDaoImpl.class.getName());

    private static List<Product1> products = new ArrayList<>();

    @Override
    public List<Product1> list() {
        return products;
    }

    @Override
    public void add(Product1 product) {
        products.add(product);
    }
}
