package com.javastudio.tutorial.service;

import com.javastudio.tutorial.api.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    public void list() {
        LOGGER.info("Populate product list in service layer");
    }
}
