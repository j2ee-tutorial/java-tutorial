package com.javastudio.tutorial.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyComponent.class);

    public void help() {
        LOGGER.info("Someone need help!!!");
    }
}
