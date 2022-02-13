package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class CreditCard implements Payment{
	Payment payment = new Cash();

	@Override
	public void pay(int amount) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		payment.pay(amount);
		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}
}
