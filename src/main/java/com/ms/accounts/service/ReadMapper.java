package com.ms.accounts.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.accounts.property.model.ApiInfo;
import com.ms.accounts.property.model.Menu;
import com.ms.accounts.property.model.TileMapper;
import com.ms.accounts.property.model.WordPressProperties;

@Service
public class ReadMapper {

	Map<String,List<ApiInfo>> map;
	
	Map<String,List<String>> apiFieldMap;
	
	Map<String,Map<String,List<String>>> tileApiMap;
	
	
	@Autowired
	public ReadMapper(WordPressProperties wordPressProperties,TileMapper tileMapper) {
		List<Menu> menus  = wordPressProperties.getMenus();
		//menus.forEach(menu -> System.out.println("Values : "+menu.getTitle()+"::"+menu.getName()) );
		this.map = tileMapper.getTileInfo();
		//oldWay();
		
		//map.keySet().stream().collect(collector)
	}
	
	public void oldWay() {
		System.out.println("Map Details");
		System.out.println(map);
		
		System.out.println("Old way");
		
		tileApiMap = new HashMap();
		
		
		Set<Entry<String,List<ApiInfo>>> entrySet = map.entrySet();
		
		Iterator<Entry<String,List<ApiInfo>>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			apiFieldMap = new HashMap();
			
			Entry<String,List<ApiInfo>> entry = itr.next();
		
			List<ApiInfo> apiInfoList = entry.getValue();
			
			for(ApiInfo apiInfo : apiInfoList) { 
			 apiFieldMap.put(apiInfo.getApiName(), Arrays.asList(apiInfo.getFieldName().split(",")));
			}
			tileApiMap.put(entry.getKey(),apiFieldMap);
		}
		System.out.println(tileApiMap);

	}
}
