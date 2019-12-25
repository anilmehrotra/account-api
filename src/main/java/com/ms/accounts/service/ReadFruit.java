package com.ms.accounts.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.accounts.property.model.Fruit;

@Service
public class ReadFruit {

	@Autowired
	public ReadFruit(Fruit fruit) {
		/*
		 * Map<String,List<String>> food = fruit.getFood();
		 * System.out.println("fruitdd : "+food);
		 */		
		//fruitList.forEach(fruitName ->System.out.println("fruitname : "+fruitName));
		Map<String, Map<String,List<String>>> map =  fruit.getPersondetail();
		System.out.println("map details :: "+map);
	}
}
