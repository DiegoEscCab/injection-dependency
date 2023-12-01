package com.diegoesc.springboot.app.springbootdi.models.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Bill {
    @Value("${description.bill}")
    private String description;
    @Autowired
    private Customer customer;
    @Autowired
    @Qualifier("officeItemsBill")
    private List<ItemBill> items;

    @PostConstruct
    public void initializer(){
        customer.setName(customer.getName().concat(" ").concat(" "));
        description = description.concat(" from customer: ").concat(customer.getName());
    }
    @PreDestroy
    public void erase(){
        System.out.println("Erased bill: ".concat(description));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ItemBill> getItems() {
        return items;
    }

    public void setItems(List<ItemBill> items) {
        this.items = items;
    }
}
