package io.cybertech.examples.logbackExample.service;

import io.cybertech.examples.logbackExample.model.Address;
import io.cybertech.examples.logbackExample.model.Customer;
import io.cybertech.examples.logbackExample.service.metric.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerService {

    @LogExecutionTime(processName = "saveCustomer")
    public void saveCustomer(Customer customer, Address deliveryAddress) {
        log.info("Saving customer information");

        log.info("Saving delivery address");
    }
}
