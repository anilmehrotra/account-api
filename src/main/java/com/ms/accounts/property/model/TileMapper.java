package com.ms.accounts.property.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="tile")
public class TileMapper {
	private Map<String,List<ApiInfo>> tileInfo;

	public Map<String, List<ApiInfo>> getTileInfo() {
		return tileInfo;
	}

	public void setTileInfo(Map<String, List<ApiInfo>> tileInfo) {
		this.tileInfo = tileInfo;
	}

	@Override
	public String toString() {
		return "TileMapper [tileInfo=" + tileInfo + "]";
	}
}
