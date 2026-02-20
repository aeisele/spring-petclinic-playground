package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	private final int randomViaExpression;

	private final int randomViaProperty;

	public MyComponent(@Value("${random.int}") int randomViaExpression,
					   @Value("${myValue}") int randomViaProperty) {
		this.randomViaExpression = randomViaExpression;
		this.randomViaProperty = randomViaProperty;
	}
}
