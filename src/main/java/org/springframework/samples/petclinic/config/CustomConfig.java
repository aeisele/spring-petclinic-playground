package org.springframework.samples.petclinic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "custom.config")
public class CustomConfig {

	private final List<String> strList;
	private final Map<String, String> map;
	private final Map<String, List<String>> mapList;
	private final Map<String, MyCustomPropertyType> mapPojo;
	private final Map<MyEnumKey, List<String>> myEnumMapList;

	public CustomConfig(List<String> strList,
						Map<String, String> map,
						Map<String, List<String>> mapList,
						Map<String, MyCustomPropertyType> mapPojo,
						Map<MyEnumKey, List<String>> myEnumMapList) {
		this.strList = strList;
		this.map = map;
		this.mapList = mapList;
		this.mapPojo = mapPojo;
		this.myEnumMapList = myEnumMapList;
	}

	public List<String> getStrList() {
		return strList;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public Map<String, List<String>> getMapList() {
		return mapList;
	}

	public Map<String, MyCustomPropertyType> getMapPojo() {
		return mapPojo;
	}

	public Map<MyEnumKey, List<String>> getMyEnumMapList() {
		return myEnumMapList;
	}
}
