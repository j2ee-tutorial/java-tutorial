package com.javastudio.tutorial.observer;

import com.javastudio.tutorial.event.ProductRegistrationEvent;

import javax.enterprise.event.Observes;
import javax.inject.Named;

@Named
public class ProductRegisterPostIssuance {

    public void issue(@Observes ProductRegistrationEvent productRegistrationEvent) {
        System.out.println(">>>>>>>>>> " + productRegistrationEvent.getName());
    }

}
