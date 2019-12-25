package com.ms.accounts.property.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="config")
public class Fruit {
	
	/*
	 * private List<String> fruits = new ArrayList<>();
	 * 
	 * public List<String> getFruits() { return fruits; }
	 * 
	 * public void setFruits(List<String> fruits) { this.fruits = fruits; }
	 * 
	 * @Override public String toString() { return "FruitList [fruits=" + fruits +
	 * "]"; }
	 */
		
	/*
	 * Map<String,List<String>> food;
	 * 
	 * public Map<String, List<String>> getFood() { return food; }
	 * 
	 * public void setFood(Map<String, List<String>> food) { this.food = food; }
	 * 
	 * @Override public String toString() { return "Fruit [food=" + food + "]"; }
	 */
	Map<String,Map<String,List<String>>> persondetail;

	public Map<String, Map<String, List<String>>> getPersondetail() {
		return persondetail;
	}

	public void setPersondetail(Map<String, Map<String, List<String>>> persondetail) {
		this.persondetail = persondetail;
	}

	@Override
	public String toString() {
		return "Fruit [persondetail=" + persondetail + "]";
	}
}

/*
 * config: food: fruits: - mango - banana vegitables: - onion - potato
 */
