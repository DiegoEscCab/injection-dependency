package com.diegoesc.springboot.app.springbootdi.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Value("${customer.name}")
    private String name;
    @Value("${customer.lastName}")
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
