package io.cybertech.examples.logbackExample.service;

import io.cybertech.examples.logbackExample.model.PizzaOrder;
import io.cybertech.examples.logbackExample.service.metric.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class PizzaPreparationService {

    @LogExecutionTime(processName = "place-order")
    public String placeOrder(PizzaOrder order) {
        log.info("Placing order...");
        String orderNumber = UUID.randomUUID().toString();
        return orderNumber;
    }
}
