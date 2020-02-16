package com.javastudio.tutorial.web.service;

import com.javastudio.tutorial.api.ProductService;
import com.javastudio.tutorial.component.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/product")
public class ProductResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductResource.class);

    @Autowired
    ProductService service;

    @Autowired
    MyComponent myComponent;

    @RequestMapping("/index")
    public String index() {
        LOGGER.info("Populate list of products");
        myComponent.help();
        service.list();
        return "Product Index";
    }
}
