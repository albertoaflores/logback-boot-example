package io.cybertech.examples.logbackExample.model;

import lombok.Data;

@Data
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zipCode;
}
