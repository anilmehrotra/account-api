package com.ms.accounts.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.accounts.property.model.TileInformation;

@Service
public class ReadTileInformation {

	Map<String, Map<String, List<String>>> map;

	Map<String, List<String>> apiFieldMap;

	Map<String, Map<String, List<String>>> tileApiMap;

	@Autowired
	public ReadTileInformation(TileInformation tileInformation) {
		this.map = tileInformation.getMapTileInfo();
		System.out.println("TileInformation MAP : " + tileInformation.getMapTileInfo());

		// map.keySet().stream().collect(collector)
	}

	public void oldWay() {

	}
}
