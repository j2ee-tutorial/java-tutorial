package com.javastudio.tutorial.service;

import com.javastudio.tutorial.dao.ProductDao;
import com.javastudio.tutorial.model.Product1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao dao;

    public List<Product1> list() {
        return dao.list();
    }

    @Override
    public void add(Product1 product) {
        dao.add(product);
    }
}
