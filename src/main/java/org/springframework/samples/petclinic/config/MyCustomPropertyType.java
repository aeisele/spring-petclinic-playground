package org.springframework.samples.petclinic.config;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.Map;

public class MyCustomPropertyType {
	private String myValue;
	private Map<String, String> myMap;

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
}
