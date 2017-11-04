package io.cybertech.examples.logbackExample.controller;

import io.cybertech.examples.logbackExample.model.PizzaOrder;
import io.cybertech.examples.logbackExample.service.CustomerService;
import io.cybertech.examples.logbackExample.service.PizzaPreparationService;
import io.cybertech.examples.logbackExample.service.metric.LogExecutionTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizza")
public class SampleController {
    @Autowired private PizzaPreparationService preparationService;
    @Autowired private CustomerService customerService;

    @RequestMapping(path = "/order/new")
    @LogExecutionTime(processName = "rest-endpoint")
    public String placeOrder(PizzaOrder order) {
        // save customer information
        customerService.saveCustomer(order.getCustomer(), order.getDeliveryAddress());

        // place order
        return preparationService.placeOrder(order);
    }
}
