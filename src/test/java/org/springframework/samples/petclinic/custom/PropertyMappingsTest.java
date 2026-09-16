package org.springframework.samples.petclinic.custom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@MyPropertyMappings(url = "jdbc:h2:file:~/data/test2")
public class PropertyMappingsTest {

	@Autowired
	private Environment environment;

	@Test
	void testBlah() {
		assertTrue(true);
	}
}
