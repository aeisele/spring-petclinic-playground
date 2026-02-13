/*
 * Foobar
 */

package org.springframework.samples.petclinic.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "my")
public class MyProps {

	private Map<Integer, List<String>> prop;

	public MyProps(Map<Integer, List<String>> prop) {
		this.prop = prop;
	}

	public Map<Integer, List<String>> getProp() {
		return prop;
	}
}
