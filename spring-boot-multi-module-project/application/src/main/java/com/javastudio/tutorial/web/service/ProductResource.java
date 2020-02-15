package com.javastudio.tutorial.web.service;

import com.javastudio.tutorial.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductResource.class);

    @Autowired
    ProductService service;

    @RequestMapping("/index")
    public String index() {
        LOGGER.info("Populate list of products");
        service.list();
        return "Product Index";
    }
}
