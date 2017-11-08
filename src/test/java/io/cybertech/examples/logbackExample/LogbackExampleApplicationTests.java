package io.cybertech.examples.logbackExample;

import io.cybertech.examples.logbackExample.controller.SampleController;
import io.cybertech.examples.logbackExample.model.PizzaOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class LogbackExampleApplicationTests {
    @Autowired  private SampleController controller;

	@Test
	public void contextLoads() {
        PizzaOrder order = new PizzaOrder();

		controller.placeOrder(order);
	}

}
