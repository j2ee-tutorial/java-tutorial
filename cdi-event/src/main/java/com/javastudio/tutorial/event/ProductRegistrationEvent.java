package com.javastudio.tutorial.event;

public class ProductRegistrationEvent {
    private final String name;

    public ProductRegistrationEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
