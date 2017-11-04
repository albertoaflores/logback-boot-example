package io.cybertech.examples.logbackExample.model;

import lombok.Data;

import java.util.Set;

@Data
public class PizzaOrder {
    private String orderNumber;
    private Set<String> topings;
    private Double price;
    private PaymentMethod paymentMethod;
    private Customer customer;
    private Address deliveryAddress;
}
