package com.ms.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.ms.accounts.property.model.Fruit;
import com.ms.accounts.property.model.TileInformation;
import com.ms.accounts.property.model.TileMapper;
import com.ms.accounts.property.model.WordPressProperties;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableConfigurationProperties({WordPressProperties.class,TileMapper.class,TileInformation.class,Fruit.class})
public class AccountsMicroserviceServerApplication {

	public static void main(String[] args) {
		System.out.println("Eneterd in main methodddd");
		SpringApplication.run(AccountsMicroserviceServerApplication.class, args);
	}
}