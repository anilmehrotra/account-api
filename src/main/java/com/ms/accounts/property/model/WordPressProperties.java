package com.ms.accounts.property.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="wordpress")
public class WordPressProperties {
	
		private List<Menu> menus = new ArrayList<>();

		public List<Menu> getMenus() {
			return menus;
		}

		public void setMenus(List<Menu> menus) {
			this.menus = menus;
		}
		
		@Override
		public String toString() {
			return "test";
		}
}
