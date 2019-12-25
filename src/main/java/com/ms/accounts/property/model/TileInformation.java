package com.ms.accounts.property.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="tileinformation")
public class TileInformation {

	Map<String, Map<String, List<String>>> mapTileInfo;

	public Map<String, Map<String, List<String>>> getMapTileInfo() {
		return mapTileInfo;
	}

	public void setMapTileInfo(Map<String, Map<String, List<String>>> mapTileInfo) {
		this.mapTileInfo = mapTileInfo;
	}

	@Override
	public String toString() {
		return "TileInformation [map=" + mapTileInfo + "]";
	}

}
